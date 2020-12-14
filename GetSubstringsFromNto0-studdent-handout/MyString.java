import java.util.*;

public final class MyString {

	/**
	 * This method returns the string.
	 * @param str the input string
	 * @param n the value n
	 * @return the string based on the repeatitions. See for test cases
	 */
	public String getSubstringsFromNto0(final String str, final int n) {
		StringBuilder sb=new StringBuilder();
		if (n>str.length()){
			return "";
		}
		for (int i=n;i>=0;i--){
			sb.append(str.substring(0,i));
		}
		return sb.toString();
	}

	/**
	 * CAUTION: Don't chagne the code.
	 * The purpose of the main method is to read and print the output.
	 * @param args the command line args
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(new MyString().getSubstringsFromNto0(
			scan.nextLine(), scan.nextInt()));
		scan.close();
	}
}
