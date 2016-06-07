package hack;

import java.util.Scanner;

public class Chef_and_Rectangle_Array_checking
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int data[][] = new int[n][m];
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				data[i][j] = s.nextInt();
			}
		}

		int a = s.nextInt();
		int b = s.nextInt();

		int ans[][] = new int[n][m];
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				int tem = 0;
				for (int ii = 0; ii <= i; ii++)
				{
					for (int jj = 0; jj <= j; jj++)
					{
						tem = tem + 8 - data[ii][jj];
					}
				}
				ans[i][j] = tem;
			}
		}
		
		disp(ans);

	}
	public static void disp(int[][] data)
	{

		for (int i = 0; i < data.length; i++)
		{
			for(int j=0;j<data[0].length;j++)
			{
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}

	}

}
