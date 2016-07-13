/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Hackerrank;

import java.util.Scanner;

/**

 */
public class Goodland_Electricity
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();

		int data1[] = new int[n];
		int data[] = new int[n];
		int ans = 0;
		for (int i = 0; i < n; i++)
		{
			data1[i] = s.nextInt();
			if (data1[i] == 1)
				ans++;
		}

		for (int j = 0 - k + 1; j < 0 + k; j++)
		{
			if (j >= 0 && j < n)
				if (data1[j] == 1)
					data[0]++;
		}

		for (int i = 1; i < n; i++)
		{
			data[i]= data[i-1];
			if(i+k-1<n)
				if(data1[i+k-1]==1)
					data[i]++;
			if(i-k>=0)
				if(data1[i-k]==1)
					data[i]--;
		}
//		disp(data);

		for (int i = 0; i < n; i++)
		{
			if (data[i] == 0)
			{
				ans = -1;
				break;
			}
		}
		if (ans == -1)
			System.out.println(ans);
		if (ans != -1)
		{
//			for (int ii = 0; ii < n; ii++)
//			{
				for (int i = 0; i < n; i++)
				{
					if (data1[i] == 1)
					{
						int che = 0;
						for (int j = i - k + 1; j < i + k; j++)
						{
							if (j >= 0 && j < n)
							{
								if (data[j] == 1)
								{
									che = 1;
									break;
								}
							}
						}
						if (che == 0)
						{
							for (int j = i - k + 1; j < i + k; j++)
							{
								if (j >= 0 && j < n)
								{
									data[j]--;
								}
							}
							ans--;
						}
					}
//				}

			}
			System.out.println(ans);

		}

		// disp(data);

	}

	public static void disp(int data[])
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
