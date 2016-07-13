package Code_chef;

import java.util.Scanner;

public class Paying_up
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++)
		{
			int n = s.nextInt();
			int m = s.nextInt();
			int data[][] = new int[n][m + 1];
			int in[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				in[i] = s.nextInt();
			}

			data[0][in[0]] = 1;
			for (int i = 1; i < n; i++)
			{
				for (int j = 1; j <= m; j++)
				{
					if (data[i - 1][j] == 1)
					{
						data[i][j] = 1;
					} else if (j == in[i])
					{
						data[i][j] = 1;

					}
					if (j - in[i] >= 0)
					{
						if (data[i - 1][j - in[i]] == 1)
						{
							data[i][j] = 1;
						}
					}
				}
			}

//			for (int i = 0; i < n; i++)
//			{
//				for (int j = 1; j <= m; j++)
//				{
//					System.out.print(data[i][j] + " ");
//				}
//				System.out.println();
//			}
			if(data[n-1][m]==1)
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

}
