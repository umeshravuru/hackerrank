package Hackerrank;

import java.util.Scanner;

public class Ema_s_Supercomputer
{

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

		int ans[][] = new int[n][m];
		int max1 = -2;
		int max2 = -2;
		int che =0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				int dis = -1;
				if (data[i][j] == 'G')
				{
					dis++;
					while (true)
					{
						if (i + dis >= n || i - dis < 0 || j - dis < 0
								|| j + dis >= m)
							break;
						if (data[i + dis][j] == 'G' && data[i - dis][j] == 'G'
								&& data[i][j + dis] == 'G'
								&& data[i][j - dis] == 'G')
							dis++;
						else
							break;
					}
				}
				if(max1==dis)
					max2=max1;
				ans[i][j] = dis;
				if(max1<dis)
				{
					max2=max1;
					max1 = dis;
					che=1;
				}
				
				System.out.print(dis + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
//				if()
			}
		
		}
		System.out.println(max1+" "+max2);
		System.out.println(((4*(max1-1))+1)*((4*(max2-1))+1));
	}

}
