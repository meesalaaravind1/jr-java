import java.util.Scanner;

// import jdk.javadoc.internal.doclets.toolkit.taglets.SystemPropertyTaglet;

/**
 * Find the count of Groups in a given Array. "Group" in an array is a series of
 * 2 or more adjacent elements of the same value. Return the number of Groups in
 * the given array.
 * @author Sridevi. K.
 * Aravind Meesala
 * @version 1.0
 */
public final class CountGroups {
    /**
     * This method returns the number of Groups in the given array
     * @param arr that contains n elements
     * @return the count of Groups in the given array
     */
    public int countGroups(final int[] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(i>0){
                if(arr[i]==arr[i+1] && arr[i]!=arr[i-1]){
                    count+=1;
                }
            }
            if(i==0){
                if(arr[i]==arr[i+1]){
                    count+=1;
                }
            }
        }
        return count;
    }

    /**
     * CAUTION: Don't chagne the code.
     * The purpose of the main method is to read and print the output.
     * @param args the command line args
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().replace("[", "")
                .replace("]", "").replace(" ", "").split(",");

                int[] l = new int[arr.length];

        for (int i = 0; i < l.length; i++) {
            l[i] = Integer.parseInt(arr[i].replace(" ", ""));
        }

        System.out.println(new CountGroups().countGroups(l));
        scan.close();
    }
}
