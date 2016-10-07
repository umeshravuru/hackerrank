/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Chef_and_Inequality
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			long ans = 0;
			for (int i = a; i <= b; i++)
			{
				if (d - Math.max(c, i + 1) + 1 >= 0)
					ans = ans + d - Math.max(c, i + 1) + 1;
			}
			System.out.println(ans);

		}

	}

}
