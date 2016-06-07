package hack;

import java.util.Scanner;

public class Chef_and_Rectangle_Array_1
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
				int max = -1;
				int tem_ans = 0;
				int tem_count = 0;
				for (int i = 0; i < a; i++)
				{
					for (int j = 0; j < b; j++)
					{
						if (data[i][j] > max)
						{
							tem_ans = tem_ans + (data[i][j] - max) * tem_count;
							max = data[i][j];
							tem_count++;
						} else
						{
							tem_ans = tem_ans + (max - data[i][j]);
							tem_count++;
						}
					}
				}
					//// tem_ans is our main iterator.
				for (int i = a; i < n ; i++)
				{
					for (int j = b; j < m ; j++)
					{
						
						for (int ii = 0; ii < b; ii++)
						{
							if(data[i][ii]>max)
							{
								
							}
						}
					}
				}
				
				
				
				
				

			}

		}

	}

}
