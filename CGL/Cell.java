import java.util.*;
/**
 * This cell class represents a cell in the CGL and shows whether the cell is alive
 * @author Aravind Meesala
 *
 * @version 2.0
 */

public class Cell{

    /**
     * the attributes of this cell class are
     * row
     * column
     * life
     */
    int row;
    int col;
    boolean life;

    /**
     * The following constructor sets the row and column values of the cell
     * and sets the life value false by default.
     * @param row
     * @param col
     */

    Cell(int row,int col){
        this.row=row;
        this.col=col;
        this.life=false;
    }

    /**
     * With the help of constructor overloading concept we can initiate values of
     * cell with row, column and true or false when specific values needs to be assigned.
     * @param row
     * @param col
     * @param status
     */
    Cell(int row,int col,boolean status){
        this.row=row;
        this.col=col;
        this.life=status;
    }


    /**
     * This method will give the status of the life of the cell.
     *
     * @return true if alive
     * @return false if dead
     */
    public boolean isAlive(){
        return this.life;
    }

    /**
     * This method is used to make the dead cell isAlive
    */
    public void makeAlive(){
        this.life=true;
    }

    /**
     * This method is used to kill the alive cell
     */
    public void makeDead(){
        this.life=false;
    }


    /**
     * This is a getter method for the row
     */
    public int getRow(){
        return this.row;
    }

    /**
     * This is a getter method for the column
     */
    public int getCol(){
        return this.col;
    }

    /**
     * This is a getter method for the life
     */
    public boolean getStatus(){
        return this.life;
    }

    /**
     * @override method to check whether two cells are equal
     * This method compares the row and column attributes of the another cell
     *
     * @param that which is another Cell object
     *
     * @return true if both cells rows and columns are equal.
     *
     */
    public boolean equals(Cell that){
        if ((this.row==that.row) && (this.col==that.col)){
            return true;
        }
        return false;
    }


    /**
     * @override method to print the output as required
     *
     * @return a string format of how out output must look.
     */
    public String toString(){
        return ""+this.row+","+this.col+","+this.life;
    }

    public static void main (String[] args){
        Cell c = new Cell(1,1);
        System.out.println(c);
        c.makeAlive();
        System.out.println(c);
        c.makeDead();
        System.out.println(c);
        System.out.println(c.getRow());
        System.out.println(c.getCol());
        System.out.println(c.getStatus());
        Cell c2= new Cell(1,1);
        System.out.println(c.equals(c2));

    }
}
