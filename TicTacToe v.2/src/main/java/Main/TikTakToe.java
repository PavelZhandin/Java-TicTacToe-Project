
package Main;

//import java.util.Scanner;
import javax.swing.*;
import Graphic_components.MyFrame;
import Model.Game;
//import GameClasses.Game;
import view.*;




public class TikTakToe {
    public static void main(String[] args) {
        
          
         //MyFrame frame = new MyFrame();        
         new Game(new ConsoleRender()).start();
         System.out.print("fre");
       
    }
}
