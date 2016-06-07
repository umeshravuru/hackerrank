package hack;
import java.util.ArrayList;
import java.util.Scanner;
public class Kindergarten_Candy_2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] data = new int[t + 2];
		data[0] = 100001;
		data[t + 1] = 100001;
		for (int i = 1; i <= t; i++)
		{
			data[i] = s.nextInt();
		}
		int[] ans = new int[t + 2];
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 1; i <= t; i++)
		{
			if (data[i] < data[i - 1] && data[i] < data[i + 1])
			{
				ans[i] = 1;
				index.add(i);
			}
		}
		// System.out.println(index);

		if (index.size() == 1)
		{
			int min = 100000;
			ans[1] = 1;
			for (int i = 2; i <= t; i++)
			{
				if (data[i] > data[i - 1])
					ans[i] = ans[i - 1] + 1;
				else
					ans[i] = ans[i - 1] - 1;

				if (ans[i] < min)
					min = ans[i];
			}
			if (min < 1)
			{
				for (int i = 1; i <= t; i++)
				{
					ans[i] = ans[i] + 1 - min;
				}
			}
		} else
		{
			for (int i = 0; i < index.size() - 1; i++)
			{
				int x = index.get(i);
				int y = index.get(i + 1);
				// System.out.println(x+" "+y);
				for (int j = x + 1; j < y; j++)
				{
					if (data[j] > data[j - 1])
						ans[j] = ans[j - 1] + 1;
					else
						break;
				}
				for (int j = y - 1; j > x; j--)
				{
					if (data[j + 1] < data[j])
					{
						if (ans[j] <= ans[j + 1])
							ans[j] = ans[j + 1] + 1;
					} else
						break;
				}
			}
		}
		int final_ans = 0;
		for (int i = 1; i <= t; i++)
		{
			final_ans = final_ans + ans[i];
		}
		System.out.println(final_ans);
	}

}
