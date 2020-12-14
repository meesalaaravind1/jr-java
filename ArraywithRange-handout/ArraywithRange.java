
import java.util.Scanner;

/**
 * Write the java program to create an array and fill the array with -n to n numbers.
 * read n
 * create array and fill the array [-n to 0 to n] numbers
 * display array on the console
 * @author
 * Roll. No.
 * Date:
 */
public class ArraywithRange {


  /**
   * Use main method to
   * => create a new array
   * => fill array with [-n to 0 to n ] numbers
   * => print the array
   *
   * @param args
   */
  public static void main(String[] args) {
    // use this scanner to read input
    Scanner sc = new Scanner(System.in);
    // add code to read n
    // create array and fill the array [-n to 0 to n] numbers
    // display array on the console
    int n=sc.nextInt();
    int[]arr=new int[(2*n)+1];
    int x=(n)*-1;
    for (int i=0;i<arr.length;i++){
      arr[i]=x;
      x+=1;
    }
    for (int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }

    sc.close();
  }
}
