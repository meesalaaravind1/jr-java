
/**
 * Given an array of Strings, convert each string of the array into
 * lower case String and then return the array.
 *
 * Input : Hello Hi
 * Output : {"olleH", "iH"}
 *
 * @author
 * Roll No.
 * Date
 */

import java.util.Scanner;

public class StringReverse {

    /**
     * This method returns the array of reverse strings.
     *
     * @param arr, the input array.
     * @return the array of reverse Strings based on the input parameter.
     */
    public static String[] reverse(String arr) {
        // your code goes here....
        String[]s= arr.split(" ");
        String[]s2=new String[s.length];
        for (int i=0;i<s.length;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(s[i]);
            s2[i]=sb.reverse().toString();
        }
        return s2;
    }

    /**
     * Do not edit this method
     *
     * @param args
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String s = sc.nextLine();

            sc.close();
            String newarr[] = reverse(s);
            for (int i = 0; i < newarr.length; i++)
                System.out.println(newarr[i]);

        }
        else
            System.out.println("No string to reverse");

    }
}
