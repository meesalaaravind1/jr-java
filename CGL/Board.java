import java.util.*;

/**
 * This board class represents the CGL game board madeup of the cells
 *
 * @author Aravind Meesala
 *
 * @version 2.0
 */

public class Board{

    /**
     * the attributes of the board class are
     * size(size of the board)
     * cells(all the cells that the board is made of)
     */
    int size;
    Cell[][] cells;


    /**
     * The following constructor creates a new board
     * with default state of all the cells in the board as dead
     *
     * @param size
     */
    Board(int size){
        this.size=size;
        cells=new Cell[size][size];
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                cells[i][j]= new Cell(i,j);
            }
        }
    }

    /**
     * This method will help you to check whether the given cell is in given bounds of the board
     * @param cell (Cell object)
     * @return true if the cell is in the boundaries else false
     */
    public boolean isValidPosition(Cell cell){
        int r=cell.getRow();
        int c=cell.getCol();
        return r>=0 && r<this.size && c>=0 && c<this.size;
    }

    /**
     * This method will help you to get all the live neighbours for a given cell
     * @param cell (Cell object)
     * @return an array of all the alive cells
     */
    public Cell[] getLiveNeighbours(Cell cell){
        ArrayList<Cell> al = new ArrayList<Cell>();
        // (i-1,j-1),(i-1,j),(i-1,j+1),(i,j-1),(i,j+1),(i+1,j-1),(i+1,j),(i+1,j+1)
        int i=cell.getRow();
        int j=cell.getCol();

        if (isValidPosition(new Cell(i-1,j-1))){
            Cell c= new Cell(i-1,j-1);
            if (c.life==true){
                al.add(c);}
        }

         if (isValidPosition(new Cell(i-1,j))){
            Cell c = new Cell(i-1,j);
            if (c.life==true){
                al.add(c);}
        }


         if (isValidPosition(new Cell(i-1,j+1))){
            Cell c = new Cell(i-1,j+1);
            if (c.life==true){
                al.add(c);}
        }

         if (isValidPosition(new Cell(i,j-1))){
            Cell c = new Cell(i,j-1);
            if (c.life==true){
                al.add(c);}
        }

         if (isValidPosition(new Cell(i,j+1))){
            Cell c = new Cell(i,j+1);
            if (c.life==true){
                al.add(c);}
        }

         if (isValidPosition(new Cell(i+1,j-1))){
            Cell c = new Cell(i+1,j-1);
            if (c.life==true){
                al.add(c);}
        }

         if (isValidPosition(new Cell(i+1,j))){
            Cell c=new Cell(i+1,j);
            if (c.life==true){
                al.add(c);}
        }

         if (isValidPosition(new Cell(i+1,j+1))){
            Cell c =new Cell(i+1,j+1);
            if (c.life==true){
                al.add(c);}
        }

        Cell[] arr= new Cell[al.size()];
        arr = al.toArray(arr);
        return arr;
    }

    /**
     * This method will help you to get all the dead neighbours for a given cell
     * @param cell (Cell object)
     * @return an array of all the dead cells
     */
    public Cell[] getDeadNeighbours(Cell cell){
        ArrayList<Cell> al = new ArrayList<Cell>();
        // (i-1,j-1),(i-1,j),(i-1,j+1),(i,j-1),(i,j+1),(i+1,j-1),(i+1,j),(i+1,j+1)
        int i=cell.getRow();
        int j=cell.getCol();

        if (isValidPosition(new Cell(i-1,j-1))){
            Cell c= new Cell(i-1,j-1);
            if (c.life==false){
                al.add(c);}
        }

         if (isValidPosition(new Cell(i-1,j))){
            Cell c = new Cell(i-1,j);
            if (c.life==false){
                al.add(c);}
        }


         if (isValidPosition(new Cell(i-1,j+1))){
            Cell c = new Cell(i-1,j+1);
            if (c.life==false){
                al.add(c);}
        }

         if (isValidPosition(new Cell(i,j-1))){
            Cell c = new Cell(i,j-1);
            if (c.life==false){
                al.add(c);}
        }

         if (isValidPosition(new Cell(i,j+1))){
            Cell c = new Cell(i,j+1);
            if (c.life==false){
                al.add(c);}
        }

         if (isValidPosition(new Cell(i+1,j-1))){
            Cell c = new Cell(i+1,j-1);
            if (c.life==false){
                al.add(c);}
        }

         if (isValidPosition(new Cell(i+1,j))){
            Cell c=new Cell(i+1,j);
            if (c.life==false){
                al.add(c);}
        }

         if (isValidPosition(new Cell(i+1,j+1))){
            Cell c =new Cell(i+1,j+1);
            if (c.life==false){
                al.add(c);}
        }
        Cell[] arr= new Cell[al.size()];
        arr = al.toArray(arr);
        return arr;
    }

    public Cell[][] getBoard(){
        return this.cells;
    }

    /**
     * @override method to print the output as required
     *
     * @return a string format of how out output must look.
     */
    public String toString(){
        String s="";
        for (int i=0;i<this.size;i++){
            for (int j=0;j<this.size;j++){
                if (cells[i][j].life==true){
                    s+="*"+" ";
                }
                else{
                    s+="."+" ";
                }
            }
            s+="\n";
        }
        return s;
    }

    public static void main(String[] args){
        Board b= new Board(5);
        System.out.println(b);
        Cell c= new Cell(1,1);
        Cell[] dead = (b.getDeadNeighbours(c));
        for (Cell x:dead){
            System.out.println(x);
        }
    }

}