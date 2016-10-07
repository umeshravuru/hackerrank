/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Build_a_Palindrome
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < n; ii++)
		{
			String data1 = s.nextLine();
			String data3 = s.nextLine();
			char[] data22 = new char[data3.length()];
			for (int i = 0; i < data22.length; i++)
			{
				data22[i] = data3.charAt(data3.length() - 1 - i);
			}
			String data2 = new String(data22);
			String lcsssss[] = longest_common_substring(data1, data2);
			String lcs = lcsssss[0];
			int data1_index = Integer.parseInt(lcsssss[1]);
			int data2_index = Integer.parseInt(lcsssss[2]);
			if (lcs.length() == 0)
				System.out.println("-1");
			else
			{
				System.out.print(lcs);
				char tem_data1 = 'A';
				char tem_data2 = 'A';
				if (data1.length() > data1_index + 1)
				{
					tem_data1 = data1.charAt(data1_index + 1);
				}
				if (data2.length() > data2_index + 1)
				{
					tem_data2 = data2.charAt(data2_index + 1);
				}
				if (tem_data1 != 'A' && tem_data2 != 'A')
				{
					if ((int) tem_data1 < (int) tem_data2)
						System.out.print(tem_data1);
					else
						System.out.print(tem_data2);
				} else if (tem_data1 == 'A')
					System.out.print(tem_data2);
				else
					System.out.print(tem_data1);
				for (int i = 0; i < lcs.length(); i++)
				{
					System.out.print(lcs.charAt(lcs.length() - 1 - i));
				}
				System.out.println();
			}

		}

	}
	public static String[] longest_common_substring(String data1, String data2)
	{
		String ans_ret[] = new String[3];
		int mat[][] = new int[data1.length() + 1][data2.length() + 1];
		int ans = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < data1.length(); i++)
		{
			for (int j = 0; j < data2.length(); j++)
			{
				if (data1.charAt(i) == data2.charAt(j))
				{
					mat[i + 1][j + 1] = mat[i][j] + 1;
					if (ans == mat[i + 1][j + 1])
					{
						String tem_data1 = data1.substring(x - ans + 1, x + 1);
						String tem_data2 = data1.substring(i - ans + 1, i + 1);
						if (alphabatic_first(tem_data2, tem_data1))
						{
							x = i;
							y = j;
						}
					}
					if (ans < mat[i + 1][j + 1])
					{
						ans = mat[i + 1][j + 1];
						x = i;
						y = j;
					}

				}
			}
		}
		disp(mat);
		ans_ret[0] = data1.substring(x - ans + 1, x + 1);
		ans_ret[1] = String.valueOf(x);
		ans_ret[2] = String.valueOf(y);

		return ans_ret;
	}
	public static boolean alphabatic_first(String data1, String data2)
	{
		for (int i = 0; i < data1.length(); i++)
		{
			if ((int) data1.charAt(i) < (int) data2.charAt(i))
				return true;
			else if ((int) data1.charAt(i) > (int) data2.charAt(i))
				return false;
		}
		return false;

	}
	public static void disp(int data[][])
	{
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[0].length; j++)
			{
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}

}
