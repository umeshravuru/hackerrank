/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Flipping_the_Matrix
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		for (int ii = 0; ii < q; ii++)
		{
			int n = s.nextInt();
			int data[][] = new int[2*n][2*n];
			for (int i = 0; i < 2 * n; i++)
			{
				for (int j = 0; j < 2 * n; j++)
				{
					data[i][j] = s.nextInt();
				}
			}
			int ans =0;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					ans = ans + max(data,i,j);
				}
			}
			System.out.println(ans);

		}

	}

	public static int max(int data[][], int x, int y)
	{
		int max = -1;
		int n = data.length;
//		System.out.println(x+" "+y);
//		for(int i =x;i<n-x;i++)
//		{
//			if(max<data[i][y])
//				max = data[i][y];
//		}
//		for(int i =x;i<n-x;i++)
//		{
//			if(max<data[i][n-y-1])
//				max = data[i][n-y-1];
//		}
//		for(int i =y;i<n-y;i++)
//		{
//			if(max<data[x][i])
//				max = data[x][i];
//		}
//		for(int i =x;i<n-x;i++)
//		{
//			if(max<data[n-y-1][i])
//				max = data[n-y-1][i];
//		}
		
		max = Math.max(max, data[x][y]);
		max = Math.max(max, data[x][n-y-1]);
		max = Math.max(max, data[n-x-1][y]);
		max = Math.max(max, data[n-x-1][n-y-1]);
		
		
		
//		System.out.println(max);
		return max;
	}

}
