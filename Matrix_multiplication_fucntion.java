/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Matrix_multiplication_fucntion
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int m1 = s.nextInt();
		int data1[][] = new int[n1][m1];
		for (int i = 0; i < n1; i++)
		{
			for (int j = 0; j < m1; j++)
			{
				data1[i][j] = s.nextInt();
			}
		}

		int n2 = s.nextInt();
		int m2 = s.nextInt();
		int data2[][] = new int[n2][m2];
		for (int i = 0; i < n2; i++)
		{
			for (int j = 0; j < m2; j++)
			{
				data2[i][j] = s.nextInt();
			}
		}
		disp(matrix_mult(data1, data2));

	}
	public static int[][] matrix_mult(int data1[][], int data2[][])
	{
		int ans[][] = new int[data1.length][data2[0].length];
		int n1 = data1.length;
		int m1 = data1[0].length;
		int n2 = data2.length;
		int m2 = data2[0].length;

		for (int i1 = 0; i1 < n1; i1++)
		{
			for (int i2 = 0; i2 < m2; i2++)
			{
				int tem = 0;
				for (int i3 = 0; i3 < m1; i3++)
				{
						tem = tem + data1[i1][i3] * data2[i3][i2];
				}
				ans[i1][i2] = tem;
			}
		}
		return ans;
	}
	public static void disp(int data[][])
	{
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data.length; j++)
			{
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}

	}

}
