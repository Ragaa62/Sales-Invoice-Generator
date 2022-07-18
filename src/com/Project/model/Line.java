/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Project.model;

/**
 *
 * @author User
 */
public class Line {
    private String Item;
     private double price;
    private int Count;
    private Inv Inv;
 public Line(String Item, int Number, double price, int Count,Inv Inv) {
        this.Item = Item;
        this.price = price;
        this.Count = Count;
        this.Inv = Inv;
    }
 public double getLTotal(){
     return price * Count;
 }
    public Line() {
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }
    
    @Override
    public String toString() {
            return "Line{" + "Number=" + Inv.getNumber() + ",Item=" + Item + ", Price=" + price + ",Count =" +Count + '}';

            }

    public Inv getInv() {
        return Inv;
    }
    public String GetFileAsCsv(){
        return Inv.getNumber()+ "," + Item +","+ price +"," +Count;
    }
}
