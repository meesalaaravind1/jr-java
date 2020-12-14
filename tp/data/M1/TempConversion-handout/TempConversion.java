import java.util.Scanner;
/*
* Author:
* Roll No:
* Date:
* Write/Complete  the java program to convert given temperature in
* celsius to Farenheit.  That reads double value for degreesCelsius from 
* console and  prints the Farenheit as a double on Console
*/
public class TempConversion {
	


	
    /*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double degrees=scan.nextDouble();	

          // write code here
         System.out.println(degrees* (9.0/5)+ 32);





		scan.close();	
	}
}
