/* Author: Santosh Kumar M
   Date: 20-11-2020 
   */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//A Java Program to illustrate Caesar Cipher Technique 
class CaesarCipherDecryption {

	// Decrypts text using a deshift  s
	public String decrypt(String fname,int n) {
		String s = "";
		String orgText = "";
		try{
			File f = new File(fname);
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine())
			{
				s = s+sc.nextLine()+"\n";
			}

		}catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch>=65 && ch<91)
			{
				int val = (int)(ch)-n;
				if(val<65)
					val = val+26;	
				ch = (char)val;
			}
			else if(ch>=97 && ch<123)
			{
				int val = (int)(ch)-n;
				// System.out.println(ch+" ++ "+(int)(ch)+" --- "+val);
				if(val<97)
					val = val+26;	
				// System.out.println(ch+" --- "+val);	
				ch = (char)val;
			}
			orgText += ch;
			
		}

		return orgText;
	}

	public static void main(String args[]) throws FileNotFoundException {

		// Creating Scanner instnace to read File name and  deshift value
		Scanner sc = new Scanner(System.in);
		CaesarCipherDecryption cce = new CaesarCipherDecryption();
		System.out.println(cce.decrypt(sc.next(),sc.nextInt()));
	}
}
