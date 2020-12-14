
/**
 * Given an array of Strings, convert each string of the array into 
 * lower case String and then return the array. 
 * 
 * Input : {"Hello", "Hi"}
 * Output : {"olleH", "iH"}
 * Author:Santosh Kumar M
 * Date:19-11-2020
 * @author 
 */
import java.io.*;  
import java.util.Scanner;  

public class StringReverse {

    /**
     * This method returns the array of reverse strings.
     * @param arr, the input array.
     * @return the array of reverse Strings based on the input parameter.
     */
    public static String[] reverse(String[] arr) {
        //  your code goes here....
        for(int i=0; i<arr.length; i++)
        {
            String s = arr[i];
            String rev = "";
            for(int j=s.length()-1; j>=0; j--)
            {
                rev += s.charAt(j);
            }
            arr[i] = rev;
        }
        return arr;
    }
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);    //file to be scanned  
        if(sc.hasNextLine())
        {
            String a[]=sc.nextLine().split(" ");
            sc.close();
            String newarr[]=reverse(a);
            for(int i=0;i<newarr.length;i++){
                System.out.println(newarr[i]);
            }
        }
        else
            System.out.println("No string to reverse");

    }
}
