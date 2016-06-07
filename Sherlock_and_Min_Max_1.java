package hack;

import java.util.Arrays;
import java.util.Scanner;

public class Sherlock_and_Min_Max_1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long[] data = new long[(int) (n)];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
		}
		Arrays.sort(data);
		long max = 0;
		long ans = 0;
		long p = s.nextLong();
		long q = s.nextLong();

		long max_check = 0;
		long max_index = 0;

		for (long i = 0; i < n - 1; i++)
		{
			if (max_check < Math.abs(data[(int) i] - data[(int) i + 1]))
			{
				max_check = Math.abs(data[(int) i] - data[(int) i + 1]);
				max_index = i;
			}
		}
		ans = (data[(int) max_index] + data[(int) (max_index + 1)]) / 2;
		if (ans <= q && ans >= p)
			max = data[(int) (max_index + 1)] - ans;

		if (p < data[0])
		{
			if (data[0] - p > max)
			{
				max = data[0] - p;
				ans = p;
			}
		}

		if (q > data[(int) (n - 1)])
		{
			if (q - data[(int) (n - 1)] > max)
			{
				max = q - data[(int) (n - 1)];
				ans = q;
			}
		}
		System.out.println(ans);

	}

}