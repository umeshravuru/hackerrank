/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class The_Longest_Common_SubString
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();
		String data2 = s.nextLine();

		int mat[][] = new int[data1.length() + 1][data2.length() + 1];
		int ans =0;
		int x =0;
		for (int i = 0; i < data1.length(); i++)
		{
			for (int j = 0; j < data2.length(); j++)
			{
				if (data1.charAt(i) == data2.charAt(j))
				{
					mat[i + 1][j + 1] = mat[i][j] + 1;
					if(ans<mat[i+1][j+1])
					{
						ans = mat[i+1][j+1];
						x = i;
					}
				}
			}
		}

		System.out.println(ans);
		System.out.println(data1.substring(x-ans+1,x+1));

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

	