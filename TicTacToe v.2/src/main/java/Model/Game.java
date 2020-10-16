package Model;
import GameClasses.*;
import  Graphic_components.*;
import view.*;

import java.util.Scanner;


public class Game {
    
    String X_SYMBOL = "X";
    String O_SYMBOL = "0";
    Playground ground;
    MyFrame frame;
    IRender IRender;
    Player player1;
    Player player2;
    String mode;
    Scanner scanner = new Scanner(System.in);
    
    
    
   public Game(){
    this.IRender = new ConsoleRender();
    this.ground = new Playground();
    player1 = new Player_real(X_SYMBOL,ground);
    player2 = new Player_Bot(O_SYMBOL, ground);
}
    
    
    
   public Game(IRender forRender) {
    
    
    this.ground = new Playground();
    this.frame = new MyFrame(ground);
    this.IRender =  forRender;
    player1 = new Player_real(X_SYMBOL,ground);
    player2 = new Player_Bot(O_SYMBOL, ground);
    
}
   
    public Game(String mod) {
        
    ground = new Playground();
   
   
      do {
//          
    this.IRender.showMsg("Выбор режима игры (pvp/pve):");
          mode = scanner.nextLine();             
         } while (!(mode.equals("pve")) && ( !(mode.equals("pvp") )));
    switch(mode){
        case ("pvp"):
            this.IRender.showMsg("Игра против человека");
            player1 = new Player_real(X_SYMBOL, ground);
            player2 = new Player_real(O_SYMBOL, ground);
            break;
            
        case("pve"): 
            this.IRender.showMsg("Игра против бота");
            player1 = new Player_real(X_SYMBOL,ground);
            player2 = new Player_Bot(O_SYMBOL, ground);
            break;
    } 
    
}
   
  
    
    
   public void start(){
    
   ground.initTable();
    
   while (true) {
       this.IRender.showMsg(" Ходит Игрок 1");
       
       player1.takeTurn();
        if (player1.checkWin()) {
            this.IRender.showMsg("Игрок 1 побеждает");
            break;
        }
        if (ground.isTableFull()) {
            this.IRender.showMsg("НИЧЬЯ");
            break;
        }
        
        if(player2 instanceof Player_real){
             ground.printTable();
              this.IRender.showMsg(" Ходит Игрок 2");
        }
        player2.takeTurn();
       
        ground.printTable();
        
        if (player2.checkWin()) {
           this.IRender.showMsg("Игрок 2 побеждает");
            break;
        }
        
        
        if (ground.isTableFull()) {
           this.IRender.showMsg("НИЧЬЯ");
            break;
        }
    }
    ground.printTable();
    

    }
   
   

  
   
}