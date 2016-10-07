/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Reaching_points
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		System.out.println(sol(a, b, c, d));

	}
		public static String sol(int a, int b, int c, int d)
		{
		if(a==c && b==d)
			return "Yes";
		while (a <= c || b <= d)
		{

			a = a + b;
			b = b;
			if (a == c && b == d)
				return "Yes";
			else
			{
				a = a;
				b = a + b;
			}
			if (a == c && b == d)
				return "Yes";
		}

		return "No";

	}

}
