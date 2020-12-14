 
import java.util.Scanner;

public class ArraywithRange{    
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);    //file to be scanned  
      //returns true if there is another line to read  
      // sc.close();
      int n = Integer.parseInt(sc.nextLine());
      // int[] arr = new int[n*2];
      int val = -1*n;
      for(int i=0; i<=n*2; i++)
      {
        System.out.println(val++);
      }
    }    
}
