/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Kattis;

import java.util.Scanner;

/**

 */
public class Time_Travelling_Temperatures
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		if (b == 1 && a == 0)
			System.out.println("ALL GOOD");
		else if (b == 1 && a != 0)
			System.out.println("IMPOSSIBLE");
		else
		{
			double ans = (double) a / (double) ((double) 1 - (double) b);
			System.out.println(
					(double) Math.round(ans * 100000000d) / 100000000d);
		}

	}

}
