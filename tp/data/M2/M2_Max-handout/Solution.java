
import java.util.*;
public class Solution
{
		/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		int arraySize = Integer.parseInt(sc.nextLine());
		int[] arr = new int[arraySize];
		for(int i=0; i<arraySize; i++)
		{
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println(max);
		// write code to read array of  ArraySize and print maximum element of the array
		

	}
}
