package hack;

import java.util.Scanner;

public class Chef_And_The_Hiring_Event
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		int n =1000;
		for(int i =11;i<=n;i++)
		{
			String data = String.valueOf(i);
			int sum =0;
			for(int j=0;j<=data.length()-1;j++ )
			{
				
				for(int k=j+1;k<=data.length();k++)
				{
					String now = data.substring(j,k);
					int prod =1;
//					System.out.println(now);
					for(int l =0;l<now.length();l++ )
					{
						prod = prod * Integer.parseInt(String.valueOf(now.charAt(l)));
//						System.out.println(prod);
						
						
					}
					sum = sum+prod;
//					System.out.println(sum);
				}
				
				
			}
			if(sum%2==0)
			{
				System.out.println(i+" "+sum);
			}
		}
		
		
	}

}
