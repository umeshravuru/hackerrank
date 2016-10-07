/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Pattern_Search
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String tem = s.nextLine();
		String data1 = s.nextLine();
		String data2 = s.nextLine();
		int freq[] = new int[4];
		int now_freq[] = new int[4];
		for (int i = 0; i < data2.length(); i++)
		{
			if (data2.charAt(i) == 'A')
				freq[0]++;
			else if (data2.charAt(i) == 'B')
				freq[1]++;
			else if (data2.charAt(i) == 'C')
				freq[2]++;
			else if (data2.charAt(i) == 'D')
				freq[3]++;

			if (data1.charAt(i) == 'A')
				now_freq[0]++;
			else if (data1.charAt(i) == 'B')
				now_freq[1]++;
			else if (data1.charAt(i) == 'C')
				now_freq[2]++;
			else if (data1.charAt(i) == 'D')
				now_freq[3]++;
		}
		disp(freq);
		disp(now_freq);
		int ans = 0;
		for (int i = 0; i < data1.length() - data2.length()+1; i++)
		{
			System.out.println(check(now_freq, freq));
			if (check(now_freq, freq))
			{
				int che = 0;
				for (int j = 0; j < data2.length(); j++)
				{
					if (data2.charAt(j) != '*')
					{
						if (data2.charAt(j) != data1.charAt(j + i))
						{
							che = 1;
							break;
						}
					}
				}
				if (che == 0)
					ans++;
			}
			if (data1.charAt(i) == 'A')
				now_freq[0]--;
			else if (data1.charAt(i) == 'B')
				now_freq[1]--;
			else if (data1.charAt(i) == 'C')
				now_freq[2]--;
			else if (data1.charAt(i) == 'D')
				now_freq[3]--;

			if (data1.charAt(i + data2.length() - 1) == 'A')
				now_freq[0]++;
			else if (data1.charAt(i + data2.length() - 1) == 'B')
				now_freq[1]++;
			else if (data1.charAt(i + data2.length() - 1) == 'C')
				now_freq[2]++;
			else if (data1.charAt(i + data2.length() - 1) == 'D')
				now_freq[3]++;

		}
		System.out.println(ans);

	}
	public static boolean check(int data1[], int data2[]) /// data1 is bigger
															/// than data2
	{
		for (int i = 0; i < 4; i++)
		{
			if (data1[i] < data2[i])
				return false;
		}
		return true;
	}
	public static void disp(int data[])
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}

}
