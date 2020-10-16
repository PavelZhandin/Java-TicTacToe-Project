/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic_components;
import java.awt.*;
import java.awt.event.*;
//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

import javax.swing.JButton;



public class Example_Action implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton b = (JButton)e.getSource();
        System.out.println(b.getText());
        b.setText("changed");
        
    }
    
}
