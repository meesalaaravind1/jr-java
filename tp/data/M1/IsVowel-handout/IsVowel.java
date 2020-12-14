import java.util.Scanner;

/*
* Author:Santosh Kumar M
* Roll No:CIHL0090
* Date:18-11-2020
* Write/Complete  the java program that takes a character  and
*  displays the given character is Vowel or not. Input character
*   can be small letter and capital letter.
*/
public class IsVowel {

	public Boolean isVowel(char ch) {

		/// fill the isVowelOrConsonent function and
		/// print whether its vowel or consonant, print output in only small letters
		if(ch == 'A' || ch == 'a' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'u')
		{
			return true;
		}
		return false;

	}

	/*
	 * Do not modify this main function.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(new IsVowel().isVowel(scan.next().charAt(0)));
		scan.close();
	}
}
