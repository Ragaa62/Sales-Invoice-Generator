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
public class LinesModelTable extends AbstractTableModel {
  private ArrayList<Line> Lines;
  private String [] Cols = {"Number","Item Name" ,"Item Price","Count","item Total"};

    public LinesModelTable(ArrayList<Line> Lines) {
        this.Lines = Lines;
    }
   
  
  @Override
    public int getRowCount() {
        return Lines.size();
     }

    @Override
    public int getColumnCount() {
    return Cols.length;
    }

    @Override
    public String getColumnName(int column) {
     return Cols[column];
             }

    public ArrayList<Line> getLines() {
        return Lines;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     
    Line line = Lines.get(rowIndex);
        switch (columnIndex) {
            case 0: return line.getInv().getNumber();
             case 1: return line.getItem();
              case 2: return line.getPrice();
               case 3: return line.getCount();
                case 4: return line.getLTotal();
                
            default:
                return "";
        }
    }
    
}
