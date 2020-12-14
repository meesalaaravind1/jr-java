import java.util.Scanner;
/*
** Author:
** Roll No:
** Date
* Write a java program to calculate the total electricity bill,when given input is 
* the number of units. minimum amount is 60, If the calculated amount is less than 
* 60 then it should return 60. Input is the number of units and the output is the 
*  bill.
* Example: If units are 240 then first 50 units will be cost 2.6 and next fifty will be 3.25 and next 50 will be cost 4.88 and next  fify will be 5.63 and next 40 will be cost 6.38. 
* So total cost will be  50*2.6+50*3.25+50*4.88+50*5.63+40*6.38=1073.2
*/
public class CalculateElectricityBill {

	/// fill the areaOfTriangle function and print th
	public double calculateBill(int units) {
		
		double bill_cost = 0.0;
		while(units!=0)
		{
			if(units>500)
			{
				bill_cost += (units-500)*8.38;
				units = units-(units-500);
			}
			else if(units<=500 &&units>400)
			{
				bill_cost += (units-400)*7.88;
				units = units-(units-400);
			}
			else if(units<=400 && units>300)
			{
				bill_cost += (units-300)*7.38;
				units = units-(units-300);
			}
			else if(units<=300 && units>250)
			{
				bill_cost += (units-250)*6.88;
				units = units-(units-250);
			}
			else if(units<=250 && units>200)
			{
				bill_cost += (units-200)*6.38;
				units = units-(units-200);
			}
			else if(units<=200 && units>150)
			{
				bill_cost += (units-150)*5.63;
				units = units-(units-150);
			}
			else if(units<=150 & units>100)
			{
				// System.out.println("101-150");
				bill_cost += (units-100)*4.88;
				units = units-(units-100);
				// System.out.println(bill_cost);
				// System.out.println(units);
			}
			else if(units<=100 & units>50)
			{
				// System.out.println("51-100");
				bill_cost += (units-50)*3.25;
				units = units-(units-50);
				// System.out.println(bill_cost);
				// System.out.println(units);
			}
			else
			{
				// System.out.println("less 50");
				bill_cost += (units)*2.6;
				units = 0;
				// System.out.println(bill_cost);
			}
			// System.out.println(bill_cost);
		}
		if(bill_cost<=60)
			return 60;
		return bill_cost;

	}

	/*
	 * Do not modify this main function.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(new CalculateElectricityBill().calculateBill(scan.nextInt()));
		scan.close();
	}
}
