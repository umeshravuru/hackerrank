package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bear_and_Five_Cards
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		Map<Integer, Integer> freq = new HashMap<>();
		int sum = 0;
		for (int i = 0; i < 5; i++)
		{
			int now = s.nextInt();
			if (freq.get(now) == null)
				freq.put(now, 1);
			else
				freq.put(now, freq.get(now) + 1);
			sum = sum + now;
		}

		if (freq.size() == 5)
			System.out.println(sum);
		else if (freq.size() == 4)
		{
			for (int key : freq.keySet())
			{
				if (freq.get(key) == 2)
				{
					sum = sum - 2 * key;
					break;
				}
			}
			System.out.println(sum);
		} else if (freq.size() == 3)
		{
			int che = 0;
			for (int key : freq.keySet())
			{
				if (freq.get(key) == 3)
				{
					sum = sum - 3 * key;
					che = 1;
					break;
				}
			}
			if (che == 1)
				System.out.println(sum);
			else
			{
				int a = 0;
				int b = 0;
				for (int key : freq.keySet())
				{
					if (freq.get(key) == 2)
					{
						if (a == 0)
							a = key;
						else
							b = key;

					}
				}
				System.out.println(sum - 2*Math.max(a, b));
			}
		}
		else if(freq.size()==2)
		{
			
			int che = 0;
			for (int key : freq.keySet())
			{
				if (freq.get(key) == 4)
				{
					sum = sum - 3 * key;
					che = 1;
					break;
				}
			}
			if (che == 1)
				System.out.println(sum);
			else
			{
				int a = 0;
				int b = 0;
				for (int key : freq.keySet())
				{
					if (freq.get(key) == 2)
							a = key;
						else
							b = key;
				}
				System.out.println(Math.min(sum-2*a, sum-3*b));//
			}
		}
		else
		{
			for (int key : freq.keySet())
			{
				System.out.println(sum - 3*key);
				break;
			}
		}

	}

}
