
package Graphic_components;

import java.awt.*;
import javax.swing.*;
import GameClasses.Playground;
public class MyFrame extends JFrame {
 
    public MyPanel panel;
    
    
    public MyFrame(){
        super("Test Frame");
        createGUI();                 
    }
    
    public MyFrame(Playground ground){
        super("Test Frame");
        createGUI(ground);                 
    }
    
    
    public void createGUI(){
        this.setVisible(true);
        this.setSize(700, 700);
        this.setLocation(800, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Крестики нолики"); 
        this.panel = new MyPanel();
        
        add(panel);
        //MyPanel upperpanel = new MyPanel();
        //upperpanel.setLayout(new BorderLayout());         
        //this.add(upperpanel);
        
       
    }
    
    
    public void createGUI(Playground ground){
        this.setVisible(true);
        this.setSize(700, 700);
        this.setLocation(800, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Крестики нолики"); 
        this.panel = new MyPanel(ground);
        
        add(panel);
        //MyPanel upperpanel = new MyPanel();
        //upperpanel.setLayout(new BorderLayout());         
        //this.add(upperpanel);
        
       
    }
}
