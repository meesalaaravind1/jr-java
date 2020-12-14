
/**
 * Given a string and a non-negative int n, we'll say that the front
 * of the string is the first 3 chars, or whatever is there if the 
 * string is less than length 3. Return n copies of the front;
 * 
 * Input : frontTimes("Chocolate", 2)
 * Output : ChoCho
 * 
 * Input : frontTimes("Chocolate", 3)
 * Output : ChoChoCho
 * 
 * Input : frontTimes("Abc", 3)
 * Output : AbcAbcAbc
 * Author:Santosh
 * @author: 
 */
import java.io.*;  
import java.util.Scanner;  
public class FrontTimes {

    /**
     * This method returns n copies of the front.
     * @param str, the string to be considered.
     * @param n, the non-negative integer value.
     * @return the n copies of the front string.
     */
    public static String frontTimes(String str, int n) 
    {
      String st = "";
      String sub = "";
      if(str.length()<3)
      {
        sub = str;
        // for(int i=0; i<n; i++)
        // {
        //   st += st;
        // }
      }
      else{
        sub = str.substring(0, 3);
        
      }
      for(int i=0; i<n; i++)
      {
        st += sub;
      }
      return st;
    }
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);    //file to be scanned  
  String s=sc.next();
  if(s.equals(""))
    s=sc.nextLine();
  int n=sc.nextInt();
  String result=frontTimes(s,n);
  System.out.println(result);
  
   }

}