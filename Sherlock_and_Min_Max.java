package hack;

import java.util.Arrays;
import java.util.Scanner;

public class Sherlock_and_Min_Max
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int[n + 1];
		for (int i = 0; i < n; i++)
		{
			data[i + 1] = s.nextInt();
		}
		int p = s.nextInt();
		int q = s.nextInt();

		Arrays.sort(data);
		int present = 0;
		for (int i = 0; i < n; i++)
		{
			if (data[i] <= p && data[i + 1] >= p)
			{
				present = i + 1;
				break;
			}

		}
		// System.out.println(present);
		int final_ans = 0;
		int max = -1;
		for (int i = p; i <= q; i++)
		{
			if (present <= n)
			{
				if (i > data[present])
					present++;
			}
			int tem = 0;

			if (present > n)
			{
				tem = i - data[n];
			} else
			{
				if (present == 1)
					tem = data[present] - i;
				else
					tem = Math.min(data[present] - i, i - data[present - 1]);
			}
			if (tem > max)
			{
				max = tem;
				final_ans = i;
			}

		}

		System.out.println(final_ans);

	}

}
