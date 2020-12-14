import java.util.Scanner;

/*
* Author:
* Roll No:
* Date:
* Write/Complete  the java program to FindDistance that reads 
* four int or double values x1, y1, x2, y2 that represent the two points
* (x1, y1) and (x2, y2), and displays the distance between those points 
* as a double
*/
public class Distance {

	/// fill the findDistance function and return the Distance
	public int findDistance(int x1, int y1, int x2, int y2) {
		double distance = 0.0;
		distance = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
		return (int)Math.ceil(distance);

	}

	/*
	 * Do not modify this main function.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(new Distance().findDistance(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()));
		scan.close();
	}
}
