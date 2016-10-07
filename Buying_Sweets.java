/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Arrays;
import java.util.Scanner;

/**

 */
public class Buying_Sweets
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
			int k = s.nextInt();
			int data[] = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++)
			{
				data[i] = s.nextInt();
				sum = sum + data[i];
			}
			Arrays.sort(data);
			int tem_sum = sum / k;
//			System.out.println(sum);
			if (sum % k == 0)
			{
				System.out.println(sum / k);
			} else
			{
//				System.out.println("kj");
				sum = sum - data[0];
				if (sum / k == tem_sum)
				{
					System.out.println("-1");
				} else
				{
					System.out.println(tem_sum);
				}
			}

		}

	}

}
