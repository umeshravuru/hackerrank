/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Little_Elephant_and_Permutations
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
			for (int i = 0; i < n; i++)
			{
				data[i] = s.nextInt();
			}
			int ans1 = 0;
			int ans2 = 0;
			for (int i = 0; i < n - 1; i++)
			{
				for (int j = i + 1; i < n; i++)
				{
					if (data[i] > data[j])
						ans1++;
				}
			}
			for (int i = 0; i < n - 1; i++)
			{
				if (data[i] > data[i + 1])
					ans2++;
			}
			if (ans1 == ans2)
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}

}
