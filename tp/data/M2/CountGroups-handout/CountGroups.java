import java.util.Scanner;

public class CountGroups {	
	public int countGroups(int list[]) {	
		//fill code here
		int prev = list[0];
		int cnt = 0;
		boolean flag = false;
		for(int i=1; i<list.length; i++)
		{
			if(prev == list[i] && flag)
			{
				flag = true;
				// cnt++;
			}
			else if(prev == list[i] && !flag)
			{
				// System.out.println("hi");
				flag = true;
				cnt++;
			}
			 			
			else
			{
				flag = false;
				prev = list[i];
			}
		}
		return cnt;
	}

	/*
	 * Do not modify this main function.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String arr[]=scan.nextLine().replace("[","").replace("]","").replace(" ","").split(",");
		int l[]=new int[arr.length];
		for(int i=0;i<l.length;i++) {
			
				 l[i]=Integer.parseInt(arr[i].replace(" ",""));
				 //System.out.println(l[i]);
		}
		System.out.println(new CountGroups().countGroups(l));
		scan.close();	
	}
}