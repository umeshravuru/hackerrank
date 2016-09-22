/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Bon_Appetit
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int sum = 0;
		int save = 0;
		for (int i = 0; i < n; i++)
		{
			if (i != k)
			{
				sum = sum + s.nextInt();
			} else
				save = s.nextInt();
		}

		sum = sum / 2;
		int save2 = s.nextInt();
		if (save2 == sum)
			System.out.println("Bon Appetit");
		else
			System.out.println(save2 - sum);

	}

}
