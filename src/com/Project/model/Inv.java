/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Project.model;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Inv {
    private String Date;
    private int Number;
    private String CustomerName;
    private ArrayList <Line> lines;
    public String getTotalLabel;
   

    public Inv() {
    }

    public Inv(String Date, int Number, String CustomerName ) {
        this.Date = Date;
        this.Number = Number;
        this.CustomerName = CustomerName;
        
    }
public double InvTotal(){
    double Total = 0.0;
    for(Line line : getLines() ){
        Total+= line.getLTotal();
        
    }
    return Total;
}
    public ArrayList<Line> getLines() {
        if(lines == null){
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

   

    @Override
    public String toString() {
        return "Inv{" + "Date=" + Date + ", Number=" + Number + ", CustomerName=" + CustomerName + '}';
    }
    
    public String GetFileAsCsv(){
        return Number + "," + Date +","+ CustomerName;
    }
}
