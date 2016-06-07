package hack;

import java.util.Scanner;

public class New_Year_Chaos
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++)
		{
			int n = s.nextInt();
			int data[] = new int[n];
			for (int j = 0; j < n; j++)
			{
				data[j] = s.nextInt();
			}
			int total = 0;
			for (int j = 0; j < n - 1; j++)
			{
				for (int k = j + 1; k < n; k++)
				{
					if (data[j] > data[k])
						total++;
				}
			}

			if (total % 2 == 0)
				System.out.println("Too chaotic");
			else
				System.out.println(total);

		}

	}

}
