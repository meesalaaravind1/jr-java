
import java.util.*;

/**
 *
 * MaxInArray
 *
 * Write a java program to Find the Maximum number in a given array of numbers.
 * A skeleton code was given for your convenience to read the input arraySize.
 * Write code to read array of arraySize and print maximum element of the array
 * @ Author
 * Roll No.
 * Date
 */
public class MaxInArray {
	/**
	 * Fill this main function to print maximum of given array
	 */
	public static void main(String[] args) {
		// don't edit this code
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();

		// add code to create Array ,read elements into the array of ArraySize and print
		// maximum element of the array
		int[] arr=new int[arraySize];
		int s=Integer.MIN_VALUE;
		for (int i=0;i<arraySize;i++){
			arr[i]=sc.nextInt();
			if (arr[i]>s){
				s=arr[i];
			}
		}
		System.out.println(s);
        sc.close();
	}
}
