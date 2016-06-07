package hack;

import java.util.Scanner;

public class Project_Euler_3_Largest_prime_factor
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int t =s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			long n= s.nextLong();
			long ans=0;
			long tem=0;
			while(n>1)
			{
//				System.out.println(n);
				if(n%2==0)
				{
					n=n/2;
					ans=2;
				}
				else
				{
					long passs= n;
				for(int i=3;i<=Math.sqrt(n)+1;i=i+2)
				{
					if(n%i==0)
					{
						n=n/i;
					tem=i;
					if(tem>ans)
						ans=tem;
					break;
					}
				}
				if(passs==n)
				{
					ans=n;
					break;
				}
				}
			}
			System.out.println(ans);
		}
		
	}

}
