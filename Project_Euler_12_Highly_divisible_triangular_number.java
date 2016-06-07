package hack;

import java.util.Scanner;

public class Project_Euler_12_Highly_divisible_triangular_number
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++)
		{
			long m = s.nextInt();
			long now = 3;
			long ans=3;
			while(true)
			{
				if(number_of_div(ans)>m)
				{
					break;
				}
				else
				{
					ans=ans+now;
					now++;
					
				}
			}
			
			System.out.println(ans);
//			System.out.println(number_of_div(4));
		}

	}
	
	
	
	public static long number_of_div(long data)
	{

		long ans = 2;
		if (data == 1)
			ans = 1;
		long present = data;
		for (int i = 2; i < present; i++)
		{
			if (data % i == 0)
			{
				ans = ans + 2;
				if(data/i==i)
					ans--;
				present=data/i;
//				System.out.print(i);
			}
		}

		return (long)ans;
	}

}
