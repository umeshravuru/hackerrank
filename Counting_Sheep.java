package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting_Sheep
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int i = 0; i < t; i++)
		{
			long n = s.nextLong();
			long nn = n;
			Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
			if (n == 0)
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
			else
			{
				while (freq.size() < 10)
				{
//					System.out.println(n);
					int tem[] = numbers(n);
					n = n + nn;
					for (int j = 0; j < tem.length; j++)
					{
						if (tem[j] == 1)
						{
							if (freq.get(j) == null)
							{
								freq.put(j, 1);
							}
						}
					}
				}
				System.out.println("Case #"+(i+1)+": "+(n-nn));
			}

		}
		
//		disp(numbers(253763));
		

	}
	public static int[] numbers(long m)
	{
		int[] ans = new int[10];
		while (m > 0)
		{
			ans[(int) (m % 10)] = 1;
			m = m / 10;
		}

		return ans;

	}
	public static void disp(int [] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("");
	}

}
