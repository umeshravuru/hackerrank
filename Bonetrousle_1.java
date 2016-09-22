/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Bonetrousle_1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++)
		{
			long n = s.nextLong();
			long k = s.nextLong();
			int b = s.nextInt();

			long data[] = new long[(int) b];
			data[b - 1] = n;
			int che = 0;
			long now = 1;
			for (int j = 0; j < b - 1; j++)
			{
				data[j] = now;
				data[b - 1] = data[b - 1] - now;
				if (data[b - 1] <= data[j])
				{
					che = 1;
					break;
				}
				now++;

			}

			long min = (b * (b + 1)) / 2;
			if (n < min)
				che = 1;
			if (che == 1)
				System.out.println("-1");
			else
			{
				for (int j = 0; j < b; j++)
				{
					System.out.print(data[j] + " ");
				}
				System.out.println();
			}

		}

	}

}
