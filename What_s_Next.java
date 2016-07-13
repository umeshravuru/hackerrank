package Hackerrank;

import java.util.Scanner;

public class What_s_Next
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++)
		{
			int n = s.nextInt();
			long data[] = new long[n];

			for (int i = 0; i < n; i++)
			{
				data[i] = s.nextLong();
			}

			if (data.length % 2 != 0)
			{
				if (data.length != 1)
				{
					System.out.println(n + 2);
					for (int i = 0; i < n - 2; i++)
					{
						System.out.print(data[i] + " ");
					}
					System.out.print(data[n - 2] - 1);
					System.out.print(" 1 1 ");
					System.out.print(data[n - 1] - 1);
					System.out.println();
				}
				else
				{
					System.out.println("3");
					System.out.print("1 1 ");
					System.out.print(data[0]-1);
					System.out.println();
				}
			}
			else
			{
				if(data.length==2)
				{
					System.out.println(n + 2);
					System.out.println((data[0]-1)+ " 1 1 "+ (data[1]-1));
				}
				else
				{
					System.out.println(n + 2);
					for (int i = 0; i < n - 3; i++)
					{
						System.out.print(data[i] + " ");
					}
					System.out.print(data[n - 3] - 1);
					System.out.print(" 1 1 ");
					System.out.print(data[n - 2] - 1+" ");
					System.out.print(data[n-1]);
					System.out.println();
				}
			}
			
			

		}
	}

}
