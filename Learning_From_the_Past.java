/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Learning_From_the_Past
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int max = -1;
		for (int i = 0; i < n; i++)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();

			int min = Math.min(c, Math.min(a, b));
			int tem = a + b + c - min;
			if (tem > max)
				max = tem;
		}
		System.out.println(max);

	}

}
