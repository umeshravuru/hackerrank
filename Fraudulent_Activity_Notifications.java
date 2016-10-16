/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Fraudulent_Activity_Notifications
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
		}
		int freq[] = new int[201];
		for (int i = 0; i < d; i++)
		{
			freq[data[i]]++;
		}
		int first = 0;
		if (d % 2 == 1)
		{
			int ans =0;
			for (int i = d; i < n; i++)
			{
				int median = 0;
				int now = (d / 2) ;
				for (int j = 0; j < 201; j++)
				{
					now = now - freq[j];
					if (now < 0)
					{
						median = j;
						break;
					}
				}
				freq[data[i]]++;
				freq[data[first]]--;
				first++;
				if(data[i]>=median*2)
					ans++;
				
			}
			System.out.println(ans);
		} else
		{
			int ans =0;
			for (int i = d; i < n; i++)
			{
				int median1 = 0;
				int median2 = 0;
				int now = (d / 2);
				for (int j = 0; j < 201; j++)
				{
					now = now - freq[j];
					if (now < 0)
					{
						median1 = j;
						break;
					}
				}
				now = (d / 2)-1;
				for (int j = 0; j < 201; j++)
				{
					now = now - freq[j];
					if (now < 0)
					{
						median2 = j;
						break;
					}
				}
				freq[data[i]]++;
				freq[data[first]]--;
				first++;
				if(data[i]>=median1+median2)
					ans++;
				
//				System.out.println(median1+" "+median2);
			}
			System.out.println(ans);
		}

	}

}
