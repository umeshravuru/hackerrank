/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Carvans
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
			int n = s.nextInt();
			int data[] = new int[n];
			int ans = 1;
			data[0]= s.nextInt();
			for (int i = 1; i < n; i++)
			{
				int now = s.nextInt();
				data[i] = now;
				if (data[i-1] >= data[i])
					ans++;
				else
					data[i]= data[i-1];

			}
			System.out.println(ans);
		}

	}

}
