/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Reaching_points_1
{

	/**
	 * asdas
	 * 
	 * @param args
	 */
	public static int che=0;
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		che = 0;
		System.out.println(sol(a, b, c, d));
	}

	public static String sol(int a, int b, int c, int d)
	{
//		System.out.println(a + " " + b);

		if (a == c && b == d)
		{
			che = 1;
			return "Yes";
		} else if (a <= c && b <= d)
		{
			int tem = a;
			tem = a + b;
			sol(tem, b, c, d);
			sol(a, tem, c, d);
		}
		if (che == 1)
			return "Yes";
		else
			return "No";
	}

}
