package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Easy_GCD
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int k = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
		}

		int gcd = 0;

		if (n == 1)
		{
			gcd = data[0];
		} else
		{
			gcd = gcd_Cal(data[0], data[1]);
			for (int i = 2; i < n; i++)
			{
				gcd = gcd_Cal(data[i], gcd);
				// System.out.println(gcd);
			}
		}
		// System.out.println(gcd);
		int ans = 0;

		ArrayList<Integer> div = new ArrayList<Integer>();

		for (int i = 2; i <= Math.sqrt(gcd); i++)
		{
			if (gcd % i == 0)
			{
				div.add(i);
				div.add(gcd / i);
			}
		}
		div.add(gcd);
		int max =-1;
		for (int j = 0; j < div.size(); j++)
		{
			int tem =-1;
			for (int i = k; i >= 0; i--)
			{
				if (i % div.get(j) == 0)
				{
						tem = i;
						break;
				}
			}
			if(tem>max)
				max = tem;
		}
		System.out.println(max);

	}

	public static int gcd_Cal(int a, int b)
	{
		if (b == 0)
			return a;
		else
			return gcd_Cal(b, a % b);

	}

}
