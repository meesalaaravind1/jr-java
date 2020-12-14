import java.util.Scanner;
/*
* Author:
* 
* sumOfOddDigits(n )[10pts]
* Write the function sumOfOddDigits(int n) that takes  possible 
* negative or positive int value and returns sum of odd digits in given number 
*/
public class SumOfOddDigits {

	/// fill the areaOfTriangle function and print th
	public int findSumOfOddDigits(int n) {
		int sum = 0;
		n = Math.abs(n);
		while(n!=0)
		{
			if((n%10)%2 != 0)
			{
				sum = sum+n%10;
			}
			n = n/10;
		}
		return sum;

	}

	/*
	 * Do not modify this main function.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(new SumOfOddDigits().findSumOfOddDigits(scan.nextInt()));
		scan.close();
	}
}
