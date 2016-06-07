package hack;

import java.util.Scanner;

public class Chef_and_Rectangle_Array
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

		int q = s.nextInt();
		for (int i1 = 0; i1 < q; i1++)
		{
			int a = s.nextInt();
			int b = s.nextInt();

			if (a == 1 && b == 1)
			{
				System.out.println("0");
			} else
			{
				int ans = -1;
				for (int i = 0; i <= n - a; i++)
				{
					for (int j = 0; j <= m - b; j++)
					{
//						System.out.println(i+" "+j);
						int max = -1;
						int tem_ans = 0;
						int tem_count = 0;
						for (int ii = 0; ii < a; ii++)
						{
							for (int jj = 0; jj < b; jj++)
							{
//								System.out.print(data[i+ii][j+jj]);
								if (data[i + ii][j + jj] > max)
								{
									tem_ans = tem_ans
											+ (data[i + ii][j + jj] - max)
													* tem_count;
									max = data[i + ii][j + jj];
									tem_count++;
//									System.out.println(tem_ans);
								}
								else
								{
									tem_ans = tem_ans +  (max-data[i+ii][j+jj]);
											tem_count++;
								}
//								System.out.print(tem_ans+" ");
							}
						}
						if (ans == -1)
							ans = tem_ans;
						else
						{
							if (ans > tem_ans)
								ans = tem_ans;
						}
//						System.out.println();
					}
				}

				System.out.println(ans);

			}

		}

	}

}
