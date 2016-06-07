package beer_night;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Project_Euler_23_Non_abundant_sums
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		data.put(12, 1);
		for (int i = 12; i < 100000; i++)
		{

			if (abundant(i) && data.get(i) == null)
			{
				int tem = i;
				while (tem < 100000)
				{
					data.put(tem, 1);
					tem = tem + i;
				}
			}

		}

		int t = s.nextInt();
		for (int i = 0; i < t; i++)
		{
			int n = s.nextInt();
			if (n <= 12)
			{
				System.out.println("no");
			}
			else if(n>28123)
				System.out.println("yes");
			else
			{
				int chek =0;
				for(int j=12;j<n;j++)
				{
					if(data.get(j)!=null && data.get(n-j)!=null)
					{
						chek=1;
						break;
					}
				}
				if(chek==0)
					System.out.println("no");
				else
					System.out.println("yes");
			}
		}
//		System.out.println(data);

	}

	public static boolean abundant(int n)
	{
		int sum = 1;
		for (int i = 2; i <= Math.sqrt(n); i++)
		{
			if (n % i == 0)
			{
				sum = sum + n / i + i;
			}
		}
		if (perfect_square(n))
			sum = (int) (sum - Math.sqrt(n));

		if (sum > n)
			return true;
		else
			return false;

	}

	public static boolean perfect_square(int n)
	{
		int m = (int) Math.sqrt(n);
		if (m * m == n)
			return true;
		else
			return false;
	}

}
