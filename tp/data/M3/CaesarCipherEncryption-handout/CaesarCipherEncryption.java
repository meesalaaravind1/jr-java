import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//A Java Program to illustrate Caesar Cipher Technique 
class CaesarCipherEncryption {
	// Encrypts text using a shift od s
	public String encrypt(int n) {
		String cipherText = "";
		String s = "";
		try 
		{
			// Create Scanner instnace to read File in Java
			// write code here to read string from the file
			// use only file name dont use path
			File f = new File("A.txt");
			Scanner sc = new Scanner(f);		
			while(sc.hasNextLine())
			{
				s = s+sc.nextLine()+"\n";
			}
			// System.out.print(s);
		} catch (FileNotFoundException e) 
		{
			System.out.println(e);
		}		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch>=65 && ch<91)
			{
				int val = (int)(ch)+n;
				if(val>91)
					val = val-26;	
				ch = (char)val;
			}
			else if(ch>=97 && ch<123)
			{
				int val = (int)(ch)+n;
				// System.out.println(ch+" ++ "+(int)(ch)+" --- "+val);
				if(val>122)
					val = val-26;	
				// System.out.println(ch+" --- "+val);	
				ch = (char)val;
			}
			cipherText += ch;
			
		}
		return cipherText;

	}

	public static void main(String args[]) throws FileNotFoundException {

		// Creating Scanner instnace to read shift value
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		CaesarCipherEncryption cce = new CaesarCipherEncryption();
		System.out.println(cce.encrypt(n));
	}
}
