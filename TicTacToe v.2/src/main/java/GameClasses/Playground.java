
package GameClasses;





public class Playground {
    int size;
    String table[][];
    
    final String Empty_Symbol = ".";
    final String X_Symbol = "X";
    final String O_Symbol = "0";
    
    public Playground(){
        size = 3;
    }
    
    public int getSize(){
        return size;
    }
    
    public String[][] GetTable(){
        return table;
    }
    
    
    
    
    
   public void initTable() {
    table = new String[size][size];
    for (int i = 0; i < size; i++)
        for (int j = 0; j < size; j++)
            table[i][j] = Empty_Symbol;
}
    
    
   public void printTable() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++)
                System.out.print(table[row][col] + " ");
            System.out.println();
        }
}
   
   boolean isCellValid(int x, int y){
       if (x < 0 || y < 0 || x >= 3|| y >= 3)
        return false;
       
        return table[x][y] == Empty_Symbol;
   }
   
 public   boolean isTableFull() {
    for (int row = 0; row < 3; row++)
        for (int col = 0; col < 3; col++)
            if (table[row][col] == Empty_Symbol)
                return false;
    return true;
}
   
 public  boolean checkWin(String dot) {
    for (int i = 0; i < 3; i++)
        if ((table[i][0].equals(dot) && table[i][1].equals(dot) && table[i][2].equals(dot)) 
                ||
                (table[0][i].equals(dot) && table[1][i].equals(dot) && table[2][i].equals(dot)))
            return true;
    
        if ((table[0][0].equals(dot) && table[1][1].equals(dot) && table[2][2].equals(dot)) 
                ||
                (table[2][0].equals(dot) && table[1][1].equals(dot) && table[0][2].equals(dot)))
            return true;
    return false;
}
   
   
}
