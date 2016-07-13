package Hackerrank;

import java.util.Scanner;

public class Sum_of_series
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double ans =(double)1;
		long tem =1;
		for(int i =2;i<=n;i++)
		{
			tem = tem * i;
			ans = ans + (double)1/(double)tem;
		}
		System.out.println((double)Math.round(ans * 1000000000d) / 1000000000d);
	}

}
