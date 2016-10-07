/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class A_Complex_Matrix_Count
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int k = s.nextInt();
		int x = s.nextInt();
		int data[][] = new int[n][m];
		int ans = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				data[i][j] = s.nextInt();
			}
		}
		s.close();
		for (int i1 = 0; i1 < n - 1; i1++)
		{
			for (int i2 = 0; i2 < m - 1; i2++)
			{
				for (int i3 = i1 + 1; i3 < n; i3++)
				{
					for (int i4 = i2 + 1; i4 < m; i4++)
					{
						int index[] = new int[4];
						index[0] = i1;
						index[1] = i2;
						index[2] = i3;
						index[3] = i4;
						if (edge_equal(data, index))
						{
							if (k <= count(data, x, index))
							{
								ans++;
							}
						}
					}
				}
			}
		}
		System.out.println(ans);

	}

	public static boolean edge_equal(int data[][], int index[])
	{
		int tem[] = new int[4];
		tem[0] = data[index[0]][index[1]];
		tem[1] = data[index[0]][index[3]];
		tem[2] = data[index[2]][index[3]];
		tem[3] = data[index[2]][index[1]];
		for (int i = 0; i < 3; i++)
		{
			for (int j = i + 1; j < 4; j++)
			{
				if (tem[i] == tem[j])
					return true;
			}
		}
		return false;
	}
	public static int count(int data[][], int x, int index[])
	{
//		disp(index);
		int cou = 0;
		// System.out.println(x);
		for (int i = index[0]; i <= index[2]; i++)
		{
			for (int j = index[1]; j <= index[3]; j++)
			{
				if (data[i][j] == x)
					cou++;
			}
		}
//		System.out.println(cou);
		return cou;
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
