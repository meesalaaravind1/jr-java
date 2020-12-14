/* Author: Santosh Kumar M */
import java.util.Scanner;

public class IsOmnipresent
{	
	///fill the areaOfTriangle function and print th
	public boolean isOmnipresent(int list[] ,int n)
	{
		
		if(list.length <= 1)
		{
			return true;
		}
		for(int i=0; i<list.length-1; i++)
		{
			if(list[i] == n  || list[i+1] == n)
			{
				
			}
			else{
				return false;
			}
		}
		return true;
	}
	/*
		Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String arr[]=scan.nextLine().split("],");

		int l[];
		if(arr[0].length()==1)
		{
			l=new int[0];
		}
		else{
			String list[]=arr[0].replace("[","").replace(" ","").split(",");
			l=new int[list.length];
			for(int i=0;i<list.length;i++) {
                 l[i]=Integer.parseInt(list[i]);
			}
		}
		System.out.println(new IsOmnipresent().isOmnipresent(l,Integer.parseInt(arr[1].replace(" ",""))));
		scan.close();	
	}
}