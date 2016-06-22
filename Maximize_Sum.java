package hack;

import java.util.Scanner;

public class Maximize_Sum
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int ii = 0; ii < t; ii++)
		{
			int n = s.nextInt();
			long m = s.nextLong();
			long data[] = new long[n];

			for (int i = 0; i < n; i++)
			{
				data[i] = s.nextLong();
			}

			long max = -1;

			for (int i = 0; i < data.length; i++)
			{
				long sum = 0;
				for (int j = i; j < data.length; j++)
				{
					sum = sum + data[j];
					if (max < sum % m)
						max = sum % m;
					// System.out.println(sum%m);

				}
			}

			System.out.println(max);
		}
	}

}
