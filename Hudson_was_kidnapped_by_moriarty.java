/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Hackerrank;

import java.util.Scanner;

/**

 */
public class Hudson_was_kidnapped_by_moriarty
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for (int i = 0; i < n; i++)
		{
			String tem = s.nextLine();
			String tem1[] = tem.split(",");
			int x = Integer.parseInt(tem1[0]);
			int y = Integer.parseInt(tem1[1]);
			long ans = y * 60 / (y - x);

			int hh = 10;
			int mm = 00;
			while (ans >= 60)
			{
				hh++;
				ans = ans - 60;
			}
			mm = (int) (mm + ans);
			if (mm >= 10)
				System.out.println(hh + ":" + mm);
			else
				System.out.println(hh + ":0" + mm);

		}

	}

}
