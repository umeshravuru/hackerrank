package Hackerrank;

import java.util.Scanner;

class New_Year_Chaos_2
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
			int min = data[0];
			int max =min;
			if (data[0] - 1 > 2)
				che = 1;
			for (int i = 1; i < n; i++)
			{
				if (data[i] - (i + 1) > 2)
				{
					che = 1;
					break;
				}
				if (data[i] < min)
				{
					min = data[i];
					ans = ans + i;
				} else if(data[i]>max)
				{
					max = data[i];

				}
				else

				{

					for (int j = 0; j < i; j++)
					{
						if (data[i] < data[j])
							ans++;
					}
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
