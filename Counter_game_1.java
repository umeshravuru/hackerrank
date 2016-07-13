package Hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Counter_game_1
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());

		for (int i = 0; i < t; i++)
		{
			String data1 = s.nextLine();
			BigInteger myInt = new BigInteger(data1);
			String data2 = myInt.toString(2);
			ArrayList<Integer> data = new ArrayList<>();
			for (int j = 0; j < data2.length(); j++)
			{
				if (data2.charAt(j) == '1')
					data.add(1);// = 1;
				else
					data.add(0);
			}
			int now = 0;
			int ones = count_ones(data);
			while (true)
			{
				if (ones > 1)
				{
					data.remove(0);
					now++;
					data = remove_zeros(data);
					ones--;
				} else
				{
					data.remove(0);
					data.set(0, 1);
					now++;
				}
				// System.out.println(data);
				if (data.size() <= 1)
					break;

			}

			// System.out.println(now);
			if (now % 2 == 0)
				System.out.println("Richard");
			else
				System.out.println("Louise");
		}

	}
	public static int count_ones(ArrayList<Integer> data)
	{
		int ans = 0;
		for (int i = 0; i < data.size(); i++)
		{
			ans = ans + data.get(i);
		}
		return ans;
	}

	public static ArrayList<Integer> remove_zeros(ArrayList<Integer> data)
	{
		for (int i = 0; i < data.size(); i++)
		{
			if (data.get(i) == 0)
			{
				data.remove(i);
				i--;
			} else
				return data;
		}

		return data;
	}

}
