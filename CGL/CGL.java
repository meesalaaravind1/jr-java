import java.util.*;

/**
 * This CGL class is the main class for the game to start
 *
 * @author Aravind Meesala
 *
 * @version 2.0
 *
 */

public class CGL{

    /**
     * the attrbutes of the CGL class are
     * board (game board)
     * size (size of the board)
     */
    Board board;
    int size;

    /**
     * the following constructor creates a new game board
     * with some live cells that halps the game to start
     * @param liveCells (array of alive cells)
     * @param sizeOfBoard (size of the game board)
     */
    CGL(Cell [] liveCells , int sizeOfBoard){
        this.board = new Board(sizeOfBoard);
        this.size = sizeOfBoard;
        for (int i =0;i<sizeOfBoard;i++){
            for (int j=0;j<sizeOfBoard;j++){
                for (int k=0;k<liveCells.length;k++){
                    if (this.board.cells[i][j].equals(liveCells[k])){
                        this.board.cells[i][j]=new Cell(i,j,true);
                    }
                }
            }
        }
    }

    /**
     * This method will help you to generate the next generation of the board based on the
     * 4 game rules mentioned in CGL 1.0
     *
     * @return this method will create a new game board with
     * new live cells and replace the old board with the new one and returns the same.
     *
     */
    public Board getNextGeneration(){
        Cell [][] newBoard=new Cell [this.board.cells.length][this.board.cells.length];
        for (int i=0;i<this.size;i++){
            for (int j=0;j<this.size;j++){
                newBoard[i][j]= new Cell(i,j);
            }
        }
        for(int i=0;i<this.board.cells.length;i++){
            for (int j=0;j<this.board.cells.length;j++){
                int cnt=0;
                int sr=-1;
                int sc=-1;
                int er=1;
                int ec=1;
                if (i==0){
                    sr=0;}

                if (i==this.board.cells.length-1){
                    er=0;}

                if (j==0){
                    sc=0;}

                if (j==this.board.cells.length-1){
                    ec=0;}

                for(int i1=sr;i1<=er;i1++){
                    for (int j1=sc;j1<=ec;j1++){
                        if (this.board.cells[i+i1][j+j1].life==true && (i1!=0 || j1!=0)){
                            cnt+=1;}
                    }
                }
                // int cnt=this.board.getLiveNeighbours(new Cell(i,j)).length;

                if (this.board.cells[i][j].life==true){
                    if (cnt==2 || cnt==3){
                        newBoard[i][j]=new Cell(i,j,true);}
                }

                else{
                    if (cnt==3){
                        newBoard[i][j]=new Cell(i,j,true);}
                }


            }
        }
        this.board.cells=newBoard;
        // System.out.println(this.board.toString());
        return this.board;
    }

    public static void main(String [] args){

        Cell c1=new Cell(1,1);
        Cell c2=new Cell(1,2);
        Cell c3=new Cell(1,0);
        Cell c4=new Cell(0,1);
        Cell [] live = {c1,c2,c3};
        CGL cgl= new CGL(live,5);
        System.out.println(cgl.board);
        cgl.getNextGeneration();
        System.out.println(cgl.board);
        cgl.getNextGeneration();
        System.out.println(cgl.board);
    }
}