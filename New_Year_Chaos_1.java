package Hackerrank;

import java.util.Scanner;

public class New_Year_Chaos_1
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++)
		{
			int n = s.nextInt();
			int data[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				data[i] = s.nextInt();
			}

			int ans = 0;
			int che = 0;
			if (data[0] - 1 > 2)
				che = 1;
			int count =0;
			for (int i = 1; i < n; i++)
			{
				if (data[i] - (i + 1) > 2)
				{
					che = 1;
					break;
				}
				if (data[i]==data[i-1]+1)
				{
					ans = ans+ count;
				}
				else
				{
					count=0;
					for (int j = 0; j < i; j++)
					{
						if (data[i] < data[j])
							count++;
					}
					ans = ans + count;
//					System.out.println(count);
				}
//				System.out.println(ans);
			}
			if (che == 1)
				System.out.println("Too chaotic");
			else
				System.out.println(ans);

		}

	}

}
