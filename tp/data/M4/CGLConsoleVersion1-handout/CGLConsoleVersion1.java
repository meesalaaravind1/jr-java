
import java.util.Scanner;



/**
 * @author Sridevi
 * @version Version1
 * 
 * @developer: Santosh Kumar M
 * Date:22-11-2020
 * ****************Conways Game Of Life***********************************
 * Initially, there is a board with some cells which may be alive or dead. 
 * Task is to generate the next generation of cells based on the following rules: 
 *     
 * Rule 1: Any live cell with fewer than two live neighbors dies, as if caused by under
 * population. 
 * Rule 2:Any live cell with two or three live neighbors lives on
 * to the next generation. 
 * Rule 3: Any live cell with more than three live  neighbors dies, as if by overpopulation. 
 * Rule 4: Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * 
 * Step 1 => find the no Of Neighbours that are alive; 
 * Step 2 => apply rules of game to get next genration by use the if conditions
 * to check all neighbors exluding it self as given video lecture
 * 
 * *************Rules of Life********************* 
 * Lonely cell will die ==> aliveNeighbours < 2 ;
 * Cell will die due to overpopulation ==> aliveNeighbours > 3 
 * A new cell will born ==> if currently dead cell have aliveNeighbours == 3
 * 
 * 
 * The ‘*’ represent an alive cell and the ‘.’ represent a dead cell
 * Updated By 
 * @author:Santosh Kumar M
 * Roll No:CIHL0090
 * Date:22-11-2020
 */
class CGLConsoleVersion1 {

    /**
     * Creates initial genration [borad]
     * @param n  size of the board n X n
     * @param l[][]  array of live cells
     */
    public boolean[][] createBoard(int n, int l[][]) 
    {
        // add code here
        boolean[][] board = new boolean[n][n];

        // System.out.println(l.length);
        for(int i=0; i<l.length; i++)
        {
            board[l[i][0]][l[i][1]] = true;
            // System.out.println(" ");
        }

        System.out.println("CurrentGenration");
        printBoard(board);

        return board;
    }

    /**
     * Method to print board on console:  
     * The ‘*’ represent an alive cell and the ‘.’ represent a dead cell.
     * @param board[][]
     * 
     */
    public void printBoard(boolean board[][]) {
        // add code here
        for(int i=0; i<board.length; i++)
        {
            String line = "";
            for(int j=0; j<board.length; j++){
                if(board[i][j] == false)
                {
                    line += ".";
                }
                else{
                    line += "*";
                }
            }
            line = line.trim();
            System.out.println(line);
        }
    }

    /**
     * Method to gerate and print next generation
     * 
     * @param board[][] board
     * 
     */
    public void generateNextGeneration(boolean board[][]) {
        int M = board.length;
        boolean[][] future = new boolean[M][M];

        
        for (int l = 1; l < board.length-1; l++) 
        { 
            for (int m = 1; m < board.length-1; m++) 
            { 
                // finding no Of Neighbours that are alive 
                int aliveNeighbours = 0; 
                for (int i = -1; i <= 1; i++) 
                {
                    for (int j = -1; j <= 1; j++) 
                    {
                        if(board[i+l][j+m] == true)
                        {
                            aliveNeighbours +=  1; 
                        }
                    }
                }
  
                // The cell needs to be subtracted from 
                // its neighbours as it was counted before 
                if(board[l][m] == true)
                    aliveNeighbours -= 1; 
  
                // Implementing the Rules of Life 
  
                // Cell is lonely and dies 
                if ((board[l][m] == true) && (aliveNeighbours < 2)) 
                    future[l][m] = false; 
  
                // Cell dies due to over population 
                else if ((board[l][m] == true) && (aliveNeighbours > 3)) 
                    future[l][m] = false; 
  
                // A new cell is born 
                else if ((board[l][m] == false) && (aliveNeighbours == 3)) 
                    future[l][m] = true; 
  
                // Remains the same 
                else
                    future[l][m] = board[l][m]; 
            } 
        } 
           
        System.out.println("NextGenration");
        printBoard(future);
    }

    /**
     * Do not modify this main Method.
     * 
     * @param args
     * @return
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading size of the Board
        int n = sc.nextInt();
        
        // Reading no. of initial live cells
        int m = sc.nextInt();
        int[][] l = new int[m][2];
        int i = 0;
        
        // Reading Live cells
        while (sc.hasNextInt()) {
            l[i][0] = sc.nextInt();
            l[i++][1] = sc.nextInt();
        }
        
        // creating instance to CGLVersion2
        CGLConsoleVersion1 c = new CGLConsoleVersion1();
        
        // creating nextgenratin by calling nextgenration method
        c.generateNextGeneration(c.createBoard(n, l));
        sc.close();
    }
}
