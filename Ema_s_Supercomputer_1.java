/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Ema_s_Supercomputer_1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String now = s.nextLine();
		String now1[] = now.split(" ");
		int n = Integer.parseInt(now1[0]);
		int m = Integer.parseInt(now1[1]);
		char data[][] = new char[n][m];
		for (int i = 0; i < n; i++)
		{
			now = s.nextLine();
			for (int j = 0; j < m; j++)
			{
				data[i][j] = now.charAt(j);
			}
		}
		ranks(data);

	}

	public static int[][] ranks(char[][] data)
	{
		int n = data.length;
		int m = data[0].length;
		int ans[][] = new int[n][m];
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				if (data[i][j] == 'G')
				{
					int x = i;
					int y = j;
					int rank_now = 1;
					if (x + 1 < n && x - 1 >= 0 && y + 1 < m && y - 1 >= 0)
					{
						if (data[x + 1][y] == 'G' && data[x - 1][y] == 'G'
								&& data[x][y + 1] == 'G'
								&& data[x][y - 1] == 'G')
						{
							rank_now++;
						}
					}
					ans[i][j] = rank_now;
				}

			}
		}
		disp(ans);
		return ans;
	}

	public static void disp(int[][] data)
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
