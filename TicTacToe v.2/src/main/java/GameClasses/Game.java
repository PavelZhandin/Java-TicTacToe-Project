package GameClasses;
import  Graphic_components.*;

import java.util.Scanner;

public class Game {
    
    String X_SYMBOL = "X";
    String O_SYMBOL = "0";
    Playground ground;
    MyPanel panel;
    MyFrame frame;
    Player player1;
    Player player2;
    String mode;
    Scanner scanner = new Scanner(System.in);
    
    
   public Game() {
    
    ground = new Playground();
    frame = new MyFrame();
    //panel = new MyPanel();
    player1 = new Player_real(X_SYMBOL,ground, frame);
    player2 = new Player_Bot(O_SYMBOL, ground);
    
}
   
    public Game(String mod) {
        
    ground = new Playground();
   
   
      do {
          System.out.println("Выбор режима игры (pvp/pve):");
          mode = scanner.nextLine();             
         } while (!(mode.equals("pve")) && ( !(mode.equals("pvp") )));
    switch(mode){
        case ("pvp"):
            System.out.println("Игра против человека");
            player1 = new Player_real(X_SYMBOL, ground);
            player2 = new Player_real(O_SYMBOL, ground);
            break;
            
        case("pve"): 
            System.out.println("Игра против бота");
            player1 = new Player_real(X_SYMBOL,ground);
            player2 = new Player_Bot(O_SYMBOL, ground);
            break;
    } 
    
}
   
  
    
    
   public void start(){
    
   ground.initTable();
    
   while (true) {
       System.out.println(" Ходит Игрок 1");
       player1.takeTurn();
        if (player1.checkWin()) {
            System.out.println("Игрок 1 побеждает");
            break;
        }
        if (ground.isTableFull()) {
            System.out.println("НИЧЬЯ");
            break;
        }
        
        if(player2 instanceof Player_real){
             ground.printTable();
              System.out.println(" Ходит Игрок 2");
        }
        player2.takeTurn();
       
        ground.printTable();
        
        if (player2.checkWin()) {
            System.out.println("Игрок 2 побеждает");
            break;
        }
        if (ground.isTableFull()) {
            System.out.println("НИЧЬЯ");
            break;
        }
    }
    ground.printTable();
    

    }
   
   

  
   
}