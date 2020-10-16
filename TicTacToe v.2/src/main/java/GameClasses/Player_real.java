
package GameClasses;

import Graphic_components.*;
import java.awt.Component;



public class Player_real extends Player {
    
  
    public Player_real(){
       
    }
    
    public Player_real(String symbol){
        this.symbol = symbol;
        
    }
    
    public Player_real(String symbol, Playground ground){
        this.symbol = symbol;
        this.ground = ground;
        
    }
    
    public Player_real(String symbol, Playground ground, MyFrame frame){
        this.symbol = symbol;
        this.ground = ground;
        this.frame = frame;
        
    }
    
    @Override
    public void takeTurn(){        
       int x, y;    
            do {
             System.out.println("Enter X and Y (1..3):");
             x = scanner.nextInt() - 1;
             y = scanner.nextInt() - 1;
         } while (!ground.isCellValid(x, y));
         ground.table[x][y] = symbol;
         
//         for(Component c : frame.panel.getComponents()) {
//            if(c instanceof MyButton ) {
//                if( (((MyButton)c).GetXIndex() == (x + 1)) && (((MyButton)c).GetYIndex() == (y + 1) ) ) {
//                   ((MyButton) c).setText("It Worked!");
//                }
//                
//            } 
//        }   
    };
    
    public void TakeNewTurn(int x, int y){
         
         ground.table[x][y] = symbol;
    }  
    
}
