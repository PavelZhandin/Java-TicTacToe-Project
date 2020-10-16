/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic_components;


//import java.awt.Color;
import GameClasses.Playground;
import controller.Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyPanel  extends  JPanel{
    
    
    Example_Action action1;
    private JTextField tf;
    Controller controller;
    Playground ground;
    
    public int currentX, currentY;
    
    public MyPanel(){
                    
        GridLayout experimentLayout = new GridLayout(3,3,1,1);       
        this.setLayout(experimentLayout);      
        action1 = new Example_Action();
        addButtons();  
        
    }
    
    
    public MyPanel(Playground ground){
                    
        GridLayout experimentLayout = new GridLayout(3,3,1,1);       
        this.setLayout(experimentLayout);      
        action1 = new Example_Action();
        addButtons();  
        this.ground = ground;
    }
    
    
    public void addButtons(){
        for (int i = 0; i < 3; i++) 
        {         
                for (int j = 0; j < 3; j++)
                {   
//                    
                      MyButton a = new MyButton(i+1 , j+1);
                      
                    a.addActionListener(new ActionListener() {
                          @Override
                          public void actionPerformed(ActionEvent e) {
                               
                               ground.GetTable()[a.GetXIndex()-1][a.GetYIndex()-1] = "x";
                               currentX = a.GetXIndex()-1;
                               currentY = a.GetYIndex()-1;
                               a.setText("x");
                               //System.out.println(a.GetXIndex()+ " " +a.GetYIndex() );
                          }
                    });
                    
                      this.add(a);
                      
                }                   
        }
    }
    
    public class Example_Action implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        
//        JButton b = (JButton)e.getSource();
//        System.out.println(b.getText());
        tf.setText("changed");
        
    }
    
}
    
    
}
