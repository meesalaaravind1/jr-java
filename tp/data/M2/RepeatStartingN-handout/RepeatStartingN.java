import java.util.Scanner;

public class RepeatStartingN {

	public String repeatStartingN(String str,int n) {
		// fill code here
		String st = str.substring(0, n);
		int m = n-1;
		for(int i=1; i<n; i++)
		{
			st += st.substring(0, m);
			m = m-1;
		}
		return st;

	}

	/*
	 * Do not modify this main function.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(new RepeatStartingN().repeatStartingN(scan.nextLine(),scan.nextInt()));
		scan.close();	
	}
}