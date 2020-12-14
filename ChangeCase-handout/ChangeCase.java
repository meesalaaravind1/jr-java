import java.util.Scanner;
import java.util.*;
/**
 * This program converts all small letters to capital letters and
 * capital letters in a given string.
 *
 * @author
 * Roll No.
 * Date
 *
 */
public class ChangeCase {


    public static void main(String[] args) {

        //use scanner to read input string
        Scanner sc=new Scanner(System.in);

        // add code here
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();

        for (int i=0;i<s.length();i++){
            String flag=""+s.charAt(i);
            if (Character.isUpperCase(s.charAt(i))){
                sb.append(flag.toLowerCase());
            }
            else if (Character.isLowerCase(s.charAt(i))){
                sb.append(flag.toUpperCase());
            }
            else{
                sb.append(flag);
            }
        }

        System.out.println(sb);

    }
}
