import java.util.Scanner;
/*
* Author:
* Roll No:
* Date:
* A shop will give a discount of 10% if the cost of purchased quantity is more than 1000.
*A shop will give a discount of 20% if the cost of purchased quantity is more than 5000.
*Read the quantity from console, Suppose, one unit will cost 100.
* Judge and print total cost for user.
*/
public class TotalCost {

	public double  calculateTotalCost(int Qty) { 
		double total_cost = 0.0;
		total_cost = Qty*100;       
		// fill code here
		if(total_cost>5000)
		{
			total_cost = total_cost-(total_cost*.20);
		}
		else if(total_cost>1000 && total_cost<5000)
		{
			total_cost = total_cost-(total_cost*.10);
		}
		return total_cost;
	}

	/*
	 * Do not modify this main function.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(new TotalCost().calculateTotalCost(scan.nextInt()));
		scan.close();
	}
}
