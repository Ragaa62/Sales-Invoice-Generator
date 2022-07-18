/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Project.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class DialogInv extends JDialog {
    private JTextField customerNameField;
    private JTextField DateField;
    private JLabel customerNameLabel;
    private JLabel DateLabel;
    private JButton OkButton;
    private JButton CancelButton;

    public DialogInv(InvoiceSalesProjectFrame f) {
        customerNameLabel = new JLabel("CustomerName:");
        customerNameField = new JTextField(20);
        DateLabel = new JLabel(" Date:");
        DateField = new JTextField(20);
        OkButton= new JButton("OK");
        CancelButton = new JButton("Cancel");
        
        OkButton.setActionCommand("Create Invoice Ok");
        CancelButton.setActionCommand("Create Invoice Cancel");
        
        OkButton.addActionListener(f.getController());
        CancelButton.addActionListener(f.getController());
        setLayout(new GridLayout(3, 2));
        
        add(DateLabel);
        add(DateField);
        add(customerNameLabel);
        add(customerNameField);
        add(OkButton);
        add(CancelButton);
        
        pack();
        
    }

    public JTextField getCustomerNameField() {
        return customerNameField;
    }

    public JTextField getDateField() {
        return DateField;
    }
    
}
