import java.util.Scanner;
/*
* Author:Santosh Kumar M
* Roll No:CIHL0090
* Date:18-11-2020
* 
* Write/update method isOddPrime(int n) that takes int value and returns 
*true if its a prime and  sum of its digits is odd
*you can use helper functions

*/
public class OddPrime {
	public static boolean isPrime(int n)
	{
		int cnt = 0;
		n = Math.abs(n);
		for(int i=1; i<=n; i++)
		{
			if(n%i == 0)
			{
				cnt++;
			}
		}
		if (cnt == 2)
			return true;
		return false;
	}
	public static int sum(int n)
	{
		int cnt = 0;
		while(n!=0)
		{
			cnt = cnt+n%10;
			n = n/10;
		}
		return cnt;
	}
	public boolean isOddPrime(int n) {
		/// add code here
		
    	return (isPrime(n) & (sum(n)%2!=0));
	}

	/*
	 * Do not modify this main function.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(new OddPrime().isOddPrime(scan.nextInt()));
		scan.close();
	}
}
