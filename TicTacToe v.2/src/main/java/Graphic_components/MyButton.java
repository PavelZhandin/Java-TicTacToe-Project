/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic_components;

import javax.swing.*;



public class MyButton extends JButton{
    private int Xindex;
    private int Yindex;
    
    public MyButton(){
        
    }
    
    public MyButton(int x, int y){
        setIndexes(x,y);
    }
    
    public void setIndexes(int x, int y){
        this.Xindex = x;
        this.Yindex = y;
    }
    
    public int GetXIndex(){
        return Xindex;
    }
    
    public int GetYIndex(){
        return Yindex;
    }
    
    
    
}
