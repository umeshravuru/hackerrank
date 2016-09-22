/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Washing_Plates_1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++)
		{
			b[i] = s.nextInt();
		}
		int count = 0;
		int ans = 0;
		int min = (int) Math.pow(10, 9);
		for (int i = 0; i < n; i++)
		{
			if (count < k)
			{
				if (a[i] > b[i])
				{
					ans = ans + a[i];
					count++;
					if (a[i] < min)
						min = a[i];
				}
			} else
			{
				if (a[i] > b[i])
				{
					if (a[i] > min)
					{
						ans = ans - min + a[i];
					}
				}
			}
		}
		System.out.println(ans); 
		

	}

}
