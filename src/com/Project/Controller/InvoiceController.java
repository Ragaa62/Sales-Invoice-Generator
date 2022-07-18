/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Project.Controller;


import com.Project.model.Inv;
import com.Project.model.InvTable;
import com.Project.model.Line;
import com.Project.model.LinesModelTable;
import com.Project.view.DialogInv;
import com.Project.view.DialogLine;
import com.Project.view.InvoiceSalesProjectFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author User
 */
public class InvoiceController implements ActionListener, ListSelectionListener{
    private DialogLine Dialogline;
    private InvoiceSalesProjectFrame f;
    private DialogInv Dialoginv;
public InvoiceController(InvoiceSalesProjectFrame f){
    this.f = f;
}
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        System.out.println("Ok : " + actionCommand);
        switch(actionCommand){
            case "CreateNewInv" :
                CreateNewInvoice();
            break; 
            case "Delete An Item" :
                DeleteAnItem();
            break; 
            case "LF" :
                LoadFile();
            break; 
            case "Delete Invoice" :
                DeleteInvoice();
            break; 
            case "New Item" :
                NewItem();
            break; 
            case "SF" :
                SaveFile();
                break;
            case "Create Invoice Ok" :
                CreateInvoiceOk();
                break;
                case "Create Invoice Cancel" :
                    CreateInvoiceCancel();
                    break;
                    case "Create Line OK" :
                        CreateLineOK();
                        break;
                        case "Create Line Cancel" :
                        CreateLineCancel();
            break;  
        }
    }

    private void CreateNewInvoice() {
        
        Dialoginv = new DialogInv(f);
        Dialoginv.setVisible(true);
    }

    private void DeleteAnItem() {
        int SelecInvoice = f.getInvTable().getSelectedRow();
          int SelecRow = f.getLineTable().getSelectedRow();
       if(SelecRow != -1){
        
           LinesModelTable LModelTab = (LinesModelTable) f.getLineTable().getModel();
           LModelTab.getLines().remove(SelecRow);
           LModelTab.fireTableDataChanged();
           f.getinvTable().fireTableDataChanged();
       }
    }
 @Override
    public void valueChanged(ListSelectionEvent e) {
        int SelIndex =  f.getInvTable().getSelectedRow(); 
        if(SelIndex!=-1){
        System.out.println("You have seleCted row : " + SelIndex);
        Inv CurrntInv = f.getInvoices().get(SelIndex);
        f.getNumberLabel().setText(""+CurrntInv.getNumber());
        f.getDateLabel().setText(CurrntInv.getDate());
        f.getCustomerNsameLabel().setText(CurrntInv.getCustomerName());
        f.getTotalLabel().setText(""+CurrntInv.InvTotal());
        LinesModelTable linesModelTab = new LinesModelTable(CurrntInv.getLines());
        f.getLineTable().setModel(linesModelTab);
       linesModelTab.fireTableDataChanged();
        }
  }
    private void LoadFile() {
        JFileChooser fchooser = new JFileChooser();
     
        try{
        int option =  fchooser.showOpenDialog(f);
      if(option == JFileChooser.APPROVE_OPTION){
         File hFile =  fchooser.getSelectedFile();
        Path hPath= Paths.get(hFile.getAbsolutePath());
        List<String> hLines =  Files.readAllLines(hPath);
          System.out.println("Invoices has been read ");
          ArrayList <Inv> invoiceArray = new ArrayList<>();
          for(String headerLine : hLines){
              String [] hParts = headerLine.split(",");
              String customerName = hParts[2];
              String invDate = hParts [1];
              int invNum = Integer.parseInt(hParts[0]);
              Inv Invoice = new Inv(invDate, invNum, customerName);
              invoiceArray.add(Invoice);
              
          }
     option = fchooser.showOpenDialog(f);
     if(option == JFileChooser.APPROVE_OPTION){
         File lineFile = fchooser.getSelectedFile();
         Path linePath = Paths.get(lineFile.getAbsolutePath());
         List <String> lLines = Files.readAllLines(linePath);
         System.out.println("lines have been read");
         for(String lLine : lLines){
             String lParts [] = lLine.split(",");
             int Number = Integer.parseInt(lParts[0]);
             String itemName = lParts[1];
             double Price = Double.parseDouble(lParts[2]);
             int count = Integer.parseInt(lParts[3]);
             Inv inv = null;
             for(Inv Invoice : invoiceArray){
                 if(Invoice.getNumber()== Number){
                     inv = Invoice;
                     break;
                     
                 }
             }
             
             Line Line = new Line(itemName,Number,Price,count,inv);
             inv.getLines().add(Line);
             
             System.out.println(lLine);
         }
     }
      f.setInvoices(invoiceArray);
      InvTable invTable = new InvTable(invoiceArray);
      f.setInvTable(invTable);
      f.getInvTable().setModel(invTable);
      f.getinvTable().fireTableDataChanged();
      }
    }
        
        catch(IOException ex){
            ex.printStackTrace();
        }
        }

    private void DeleteInvoice() {
        
       int SelecRow = f.getInvTable().getSelectedRow();
       if(SelecRow != -1){
           f.getInvoices().remove(SelecRow);
           f.getinvTable().fireTableDataChanged();
       }
        
   }

    private void NewItem() {
        
        Dialogline = new DialogLine(f);
        Dialogline.setVisible(true);
    }

    private void SaveFile() {
        
        ArrayList <Inv> invs = f.getInvoices();
        String Lines ="";
        String Headers = "";
        for(Inv inv : invs){
            String CsvInvs= inv.GetFileAsCsv();
            Headers+=CsvInvs;
            Headers += "\n";
            for(Line line : inv.getLines()){
                String CsvLine = line.GetFileAsCsv();
                Lines+=CsvLine;
                Lines += "\n";
            }
        }
        try{
        JFileChooser fchooser = new JFileChooser();
       int done = fchooser.showSaveDialog(f);
       if(done == JFileChooser.APPROVE_OPTION){
           File HeaderFile = fchooser.getSelectedFile();
           FileWriter HeaderfileW = new FileWriter(HeaderFile);
           HeaderfileW .write(Headers);
           HeaderfileW.flush();
           HeaderfileW .close();
           done = fchooser.showSaveDialog(f);
           if(done==JFileChooser.APPROVE_OPTION){
               File LineFile = fchooser.getSelectedFile();
                FileWriter LinefileW = new FileWriter(LineFile);
          LinefileW .write(Lines);
           LinefileW.flush();
           LinefileW.close();
       }
       }
        } catch (Exception ex){
            
        }
    }

    private void CreateInvoiceOk() {
        String Date = Dialoginv.getDateField().getText();
        String CustomerName = Dialoginv.getCustomerNameField().getText();
        int Number = f.NextInvNumber();
        
        Inv inv = new Inv(Date, Number, CustomerName);
        f.getInvoices().add(inv);
        f.getinvTable().fireTableDataChanged();
        Dialoginv.setVisible(false);
        Dialoginv.dispose();
        Dialoginv = null;
        
    }

    private void CreateInvoiceCancel() {
        Dialoginv.setVisible(false);
        Dialoginv.dispose();
        Dialoginv = null;
    }

    private void CreateLineOK() {
        String Item = Dialogline.getNameField().getText();
        String count = Dialogline.getCountField().getText();
        String price = Dialogline.getPriceField().getText();
        double Price = Double.parseDouble(price);
        int Count = Integer.parseInt(count);
        
        int InvSelec  = f.getInvTable().getSelectedRow();
        if(InvSelec!=-1){
        Inv inv = f.getInvoices().get(InvSelec);
        Line l = new Line(Item, InvSelec, Price, Count, inv);
        inv.getLines().add(l);
        LinesModelTable lModelTable = ( LinesModelTable)f.getLineTable().getModel();
        //lModelTable.getLines().add(l);
        lModelTable.fireTableDataChanged();
        f.getinvTable().fireTableDataChanged();
        }
        Dialogline.setVisible(false);
        Dialogline.dispose();
        Dialogline = null;
    }

    private void CreateLineCancel() {
        
        Dialogline.setVisible(false);
        Dialogline.dispose();
        Dialogline = null;
    }

   
    
}
