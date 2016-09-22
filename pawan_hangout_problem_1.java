/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class pawan_hangout_problem_1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in); /// takes input from console.
		int n = s.nextInt(); // input S

		int tem_n = n - 7; // simplifying -ve terms.
		if (tem_n <= 0)
			System.out.println("0");
		else
		{
			System.out.println(((tem_n)*(tem_n+1)*(tem_n+2))/6);   
		}

	}

}
