package hack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Coin_Jam
{

	public static void main(String[] args)
	{
		int N = 16;
		int J = 50;
		Map<String, long[]> data = new HashMap<String, long[]>();
		Map<String, Integer> data_check = new HashMap<String, Integer>();

		ArrayList<long[]> divisors = new ArrayList<long[]>();

		String tem = "1000000000000001";
//		data_check.put(tem, 1);
//		 String tem = "1000000001111001";
		while (data.size() < 50)
		{
			int check = 0;
			long[] tem_div = new long[9];
			for (int i = 2; i <=10; i++)
			{
				long num_base = base(tem, i);
//				System.out.println(num_base);
				long tem_div_numer = prime(num_base);
				if (tem_div_numer == 1)
				{
					check = 1;
					break;
				} else
					tem_div[i - 2] = tem_div_numer;
			}

			if (check == 0)
			{
				data.put(tem, tem_div);
//				divisors.add(tem_div);
			}

			while (true)
			{
				tem = Long.toString(base(tem, 2) + 1, 2);
				if(tem.charAt(tem.length()-1)=='1')
					break;
			}

		}
		// System.out.println(prime(16));
		int inc = 0;
		for (String key : data.keySet())
		{
			System.out.print(key + " ");
			for (int i = 0; i < 9; i++)
			{
//				System.out.print(divisors.get(inc)[i] + " ");
				System.out.print(data.get(key)[i]+" ");
			}
			System.out.println();
			inc++;
		}
		System.out.println(data.size() + " sdgsgsf ");

	}
	public static long base(String data, int n)
	{

		long ans = 0;
		for (int i = 0; i < data.length(); i++)
		{
			if (data.charAt(i) == '1')
			{
				ans = (long) (ans + Math.pow(n, data.length() - 1 - i));
			}
		}

		return ans;

	}

	public static long prime(long n)
	{
		if (n % 2 == 0)
			return (long) 2;
		for (long i = 3; i < Math.sqrt(n) + 4; i = i + 2)
		{
			if (n % i == 0)
				return i;
		}

		return (long) 1;
	}

}
