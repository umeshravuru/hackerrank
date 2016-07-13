package Hackerrank;

import java.util.Scanner;

public class The_Bomberman_Game_1
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);

		String data0 = s.nextLine();
		String data1[] = data0.split(" ");

		int n = Integer.parseInt(data1[0]);
		int m = Integer.parseInt(data1[1]);
		int p = Integer.parseInt(data1[2]);

		char data[][] = new char[n + 2][m + 2];
		for (int i = 0; i < n; i++)
		{
			String tem = s.nextLine();
			for (int j = 0; j < m; j++)
			{
				data[i + 1][j + 1] = tem.charAt(j);
			}
		}

		int tem = 0;
		char ans1[][] = new char[n + 2][m + 2];
		char ans2[][] = new char[n + 2][m + 2];
		int che = 0;
		while (tem != 10)
		{
			char data2[][] = new char[n + 2][m + 2];

			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < m; j++)
				{
					// data2[i + 1][j + 1] = data[i+1][j+1];
					data2[i + 1][j + 1] = 'O';
				}
			}

			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < m; j++)
				{
					if (data[i + 1][j + 1] == 'O')
					{
						data2[i + 1][j + 1] = '.';
						data2[i + 1][j + 2] = '.';
						data2[i + 2][j + 1] = '.';
						data2[i][j + 1] = '.';
						data2[i + 1][j] = '.';
					}
				}
			}
			if (che == 0 && p == 1)
			{

				for (int i = 0; i < n ; i++)
				{
					for (int j = 0; j < m ; j++)
					{
						System.out.print(data[i + 1][j + 1]);
					}
					System.out.println();
				}
				che = 1;
			}
			for (int i = 0; i < n + 2; i++)
			{
				for (int j = 0; j < m + 2; j++)
				{
					data[i][j] = data2[i][j];
				}
			}
			
			if (tem == 5)
			{
				for (int i = 0; i < n + 2; i++)
				{
					for (int j = 0; j < m + 2; j++)
					{
						ans1[i][j] = data2[i][j];
					}
				}
			}
			if (tem == 8)
			{
				for (int i = 0; i < n + 2; i++)
				{
					for (int j = 0; j < m + 2; j++)
					{
						ans2[i][j] = data2[i][j];
					}
				}
			}

			tem++;
		}

		if (p % 2 == 0)
		{
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < m; j++)
				{
					System.out.print("O");
				}
				System.out.println();
			}

		} else if (p % 4 == 1 && p != 1)
		{
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < m; j++)
				{
					System.out.print(ans1[i + 1][j + 1]);
				}
				System.out.println();
			}
		} else if (p % 4 == 3)
		{
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < m; j++)
				{
					System.out.print(ans2[i + 1][j + 1]);
				}
				System.out.println();
			}
		}

	}

}
