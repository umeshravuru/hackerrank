package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Redfin_mod_rank_of_word_2_testing_another
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();
		char[] data = data1.toCharArray();

		ArrayList<String> ans = sortedPermutations(data);
		int tem_now = 1;
		for (int i = 0; i < ans.size(); i++)
		{
			System.out.println(tem_now + " " + ans.get(i));
			tem_now++;
		}

	}

	public static ArrayList<String> sortedPermutations(char[] data)
	{
		ArrayList<String> ans = new ArrayList<>();
		while (true)
		{
			String tem = new String(data);
			// System.out.print(tem+",");
			ans.add(tem);
			int now = 0;
			for (now = data.length - 2; now >= 0; --now)
			{
				if (data[now] < data[now + 1])
				{
					break;
				}
			}
			if (now == -1)
				break;
			else
			{
				int ceilIndex = findCeil(data, data[now], now + 1,
						data.length - 1);
				char temp = data[now];
				data[now] = data[ceilIndex];
				data[ceilIndex] = temp;
				reverse(data, now + 1, data.length - 1);
			}

		}
		return ans;
	}

	public static int findCeil(char[] data, char now, int l, int h)
	{
		int ceilIndex = l;
		for (int i = l + 1; i <= h; i++)
		{
			if (data[i] > now && data[i] < data[ceilIndex])
				ceilIndex = i;
		}
		return ceilIndex;
	}

	public static void reverse(char data[], int l, int h)
	{
		while (l < h)
		{
			char temp = data[l];
			data[l] = data[h];
			data[h] = temp;
			l++;
			h--;
		}
	}

}
