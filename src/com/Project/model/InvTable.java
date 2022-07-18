/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Project.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class InvTable extends AbstractTableModel{
    private ArrayList<Inv> invoices;
    private String [] Cols = {"Number","Date" ,"CustomerName","Total"};

    public InvTable(ArrayList<Inv> invoices) {
        this.invoices = invoices;
    }

    @Override
    public int getRowCount() {
      return invoices.size();
    }

    @Override
    public String getColumnName(int column) {
        return Cols [column];
    }
    

    @Override
    public int getColumnCount() {
    return  Cols.length;
            }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Inv inv = invoices.get(rowIndex);
       switch (columnIndex){
           case 0 : return inv.getNumber();
           case 1 : return inv.getDate();
           case 2 : return inv.getCustomerName();
           case 3 : return inv.InvTotal();
           default: return "";
       }
    
    }
    
}
