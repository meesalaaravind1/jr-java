/* Author: Santosh Kumar M
   Date:20-11-2020 */

import java.util.*;
public class MatrixAddition{
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int m = Integer.parseInt(s.split(" ")[0]);
		int n = Integer.parseInt(s.split(" ")[1]);
		int [][] arr = new int[m][n];
		for(int i=0; i<m; i++)
		{
			String line = sc.nextLine();
			for(int j=0; j<n; j++)
			{
				arr[i][j] = Integer.parseInt(line.split(" ")[j]);
			}		
		}
		String s1 = sc.nextLine();
		int m1 = Integer.parseInt(s1.split(" ")[0]);
		int n1 = Integer.parseInt(s1.split(" ")[1]);
		int [][] arr1 = new int[m1][n1];
		for(int i=0; i<m1; i++)
		{
			String line = sc.nextLine();
			for(int j=0; j<n1; j++)
			{
				arr1[i][j] = Integer.parseInt(line.split(" ")[j]);
			}
			// arr1[i][0] = Integer.parseInt(line.split(" ")[0]);
			// arr1[i][1] = Integer.parseInt(line.split(" ")[1]);
			// arr1[i][2] = Integer.parseInt(line.split(" ")[2]);			
		}
		// System.out.println(m+" -- "+m1+" -- "+n+" -- "+n1);
		if(m != m1 && n != n1)
		{
			System.out.println("not possible");
		}
		else
		{
			int i = 0;
			int j = 0;
			for(i=0; i<m; i++)
			{
				for(j=0; j<n-1; j++)
				{
					arr[i][j] += arr1[i][j];
					System.out.print(arr[i][j]+" ");
				}
				System.out.println(arr[i][j]+arr1[i][j]);
			}

		}
	}
}
