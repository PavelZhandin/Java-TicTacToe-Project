package GameClasses;

import Graphic_components.*;
import java.util.Random;
import java.util.Scanner;


public  class Player {
    
    Random random;
    Scanner scanner = new Scanner(System.in);
    String type;
    Playground ground;
    String symbol;
    MyPanel panel;
    MyFrame frame;
    
    public Player(){
        
    }
    
    public Player(String symbol){
        this.symbol = symbol;       
    }
    
    public Player(String symbol, String type, Playground ground, MyPanel panel){
        this.symbol = symbol;
        this.type = type;
        this.ground = ground;
        this.panel = panel;
        
    }
    
    
    
    public void takeTurn(){
//       int x, y;
//       if(type.equals("real")){
//            do {
//             System.out.println("Enter X and Y (1..3):");
//             x = scanner.nextInt() - 1;
//             y = scanner.nextInt() - 1;
//         } while (!ground.isCellValid(x, y));
//         ground.table[x][y] = symbol;
//       }
//       if(type.equals("bot")){
//            do {
//            x = random.nextInt(3);
//            y = random.nextInt(3);
//        } while (!ground.isCellValid(x, y));
//        ground.table[x][y] = symbol;
//       }
       
    };
    
    
    public boolean checkWin() {
        return ground.checkWin(symbol);
}
   
   
   
   
  
}
