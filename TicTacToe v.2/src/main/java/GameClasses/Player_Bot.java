
package GameClasses;

import java.util.Scanner;
import java.util.Random;
public class Player_Bot extends Player {
    
    Random random ;
    Scanner scanner;
    
    public Player_Bot(){
        //random = new Random();
    }
    
    public Player_Bot(String symbol){
        this.symbol = symbol;
    }
    
    public Player_Bot(String symbol, Playground ground){
        this.symbol = symbol;
        this.ground = ground;
         random = new Random();
         scanner = new Scanner(System.in);
        
    }
    
    @Override
    public void takeTurn(){
       int x, y;            
            do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!ground.isCellValid(x, y));
        ground.table[x][y] = symbol;
       
       
    };
}
