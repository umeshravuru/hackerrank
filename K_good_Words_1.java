package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class K_good_Words_1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < t; ii++)
		{
			String data1 = s.nextLine();
			String[] data2 = data1.split(" ");
			String data = data2[0];
			int k = Integer.parseInt(data2[1]);
			Map<Character, Integer> freq = new HashMap<>();

			for (int i = 0; i < data.length(); i++)
			{
				if (freq.get(data.charAt(i)) != null)
					freq.put(data.charAt(i), freq.get(data.charAt(i)) + 1);
				else
					freq.put(data.charAt(i), 1);
			}
			int min = 100001;
			for (char key : freq.keySet())
			{
				if (freq.get(key) < min)
					min = freq.get(key);
			}
			int final_ans = 0;
			for (char key : freq.keySet())
			{
				if (Math.abs(min - freq.get(key)) > k)
				{
					final_ans = final_ans + Math.abs(min - freq.get(key)) - k;
				}
			}

			System.out.println(final_ans);

		}

	}
}
