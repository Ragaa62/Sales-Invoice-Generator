/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Project.view;

import com.Project.Controller.InvoiceController;
import com.Project.model.Inv;
import com.Project.model.InvTable;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author User
 */
public class InvoiceSalesProjectFrame extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceSalesProjectFrame
     */
    public InvoiceSalesProjectFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invTable = new javax.swing.JTable();
        invTable.getSelectionModel().addListSelectionListener(Controller);
        createInvButton = new javax.swing.JButton();
        createInvButton.addActionListener(Controller);
        deleteInvButton = new javax.swing.JButton();
        deleteInvButton.addActionListener(Controller);
        label1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        nomTable = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        newItemButton = new javax.swing.JButton();
        newItemButton.addActionListener(Controller);
        deleteItemButton = new javax.swing.JButton();
        deleteItemButton.addActionListener(Controller);
        CustomerNsameLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        NumberLabel = new javax.swing.JLabel();
        TotalLabel = new javax.swing.JLabel();
        fileBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        saveFileItem = new javax.swing.JMenuItem();
        saveFileItem.addActionListener(Controller);
        loadFileItem = new javax.swing.JMenuItem();
        loadFileItem.addActionListener(Controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(invTable);

        createInvButton.setText("Create New Invoice");
        createInvButton.setActionCommand("CreateNewInv");
        createInvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvButtonActionPerformed(evt);
            }
        });

        deleteInvButton.setText("Delete Invoice");
        deleteInvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvButtonActionPerformed(evt);
            }
        });

        label1.setText("Customer Name :");

        date.setText("Date :");

        nomTable.setText("Number :");

        total.setText("Total : ");

        lineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(lineTable);

        newItemButton.setText("New Item");
        newItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemButtonActionPerformed(evt);
            }
        });

        deleteItemButton.setText("Delete An Item");
        deleteItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        saveFileItem.setText("Save File");
        saveFileItem.setActionCommand("SF");
        saveFileItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveFileItem);

        loadFileItem.setText("Load File");
        loadFileItem.setActionCommand("LF");
        jMenu1.add(loadFileItem);

        fileBar.add(jMenu1);

        setJMenuBar(fileBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(createInvButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteInvButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1)
                                    .addComponent(date)
                                    .addComponent(nomTable)
                                    .addComponent(total))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TotalLabel)
                                    .addComponent(NumberLabel)
                                    .addComponent(DateLabel)
                                    .addComponent(CustomerNsameLabel))))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(newItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteItemButton)
                        .addGap(112, 112, 112))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(CustomerNsameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date)
                            .addComponent(DateLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomTable)
                            .addComponent(NumberLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total)
                            .addComponent(TotalLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteInvButton)
                    .addComponent(createInvButton)
                    .addComponent(newItemButton)
                    .addComponent(deleteItemButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createInvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createInvButtonActionPerformed

    private void deleteInvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteInvButtonActionPerformed

    private void saveFileItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveFileItemActionPerformed

    private void newItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newItemButtonActionPerformed

    private void deleteItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteItemButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvoiceSalesProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceSalesProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceSalesProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceSalesProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceSalesProjectFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerNsameLabel;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel NumberLabel;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JButton createInvButton;
    private javax.swing.JLabel date;
    private javax.swing.JButton deleteInvButton;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JMenuBar fileBar;
    private javax.swing.JTable invTable;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JTable lineTable;
    private javax.swing.JMenuItem loadFileItem;
    private javax.swing.JButton newItemButton;
    private javax.swing.JLabel nomTable;
    private javax.swing.JMenuItem saveFileItem;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
   private ArrayList<Inv> invoices;
   private InvoiceController Controller = new InvoiceController(this);
   private InvTable InvTable ;

    public JTable getInvTable() {
        return invTable;
    }
    public InvTable getinvTable() {
        return InvTable;
    }

    public void setInvTable(JTable invTable) {
        this.invTable = invTable;
    }

    public ArrayList<Inv> getInvoices() {
        return invoices;
    }

    public void setInvoices(ArrayList<Inv> invoices) {
        this.invoices = invoices;
    }

    public InvoiceController getController() {
        return Controller;
    }

    public void setCustomerNsameLabel(JLabel CustomerNsameLabel) {
        this.CustomerNsameLabel = CustomerNsameLabel;
    }

    public JLabel getCustomerNsameLabel() {
        return CustomerNsameLabel;
    }

    public void setDateLabel(JLabel DateLabel) {
        this.DateLabel = DateLabel;
    }

    public JLabel getDateLabel() {
        return DateLabel;
    }
    

    public void setLineTable(JTable lineTable) {
        this.lineTable = lineTable;
    }

    public void setInvTable(InvTable InvTable) {
        this.InvTable = InvTable;
    }

    public JLabel getNumberLabel() {
        return NumberLabel;
    }

    public JLabel getTotalLabel() {
        return TotalLabel;
    }

    public JTable getLineTable() {
        return lineTable;
    }
    
   public int NextInvNumber(){
       int Number = 0;
       for(Inv inv : invoices){
           if(inv.getNumber() > Number) Number = inv.getNumber();
       }
       return ++Number;
   }

}