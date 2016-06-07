package beer_night;

import java.util.Scanner;

public class Nikita_and_the_Game
{

	public static void main(String[] args)
	{
		
		Scanner s  = new Scanner(System.in );
		int t = s.nextInt();
		for(int i =0;i<t;i++)
		{
			int n = s.nextInt();
			int[] data = new int [n];
			long sum =0;
			for(int j=0;j<n;j++)
			{
				data[i]=s.nextInt();
				sum=sum+data[i];
			}
			int ans = 0;
			int x =0;
			int  y =n-1;
			while(sum%2==0)
			{
				ans++;
				sum=sum/2;
				
			}
		}
		
		
	}

}
