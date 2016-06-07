package beer_night;

import java.util.Scanner;

public class prsteni
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [ ]data = new int [n];
		for(int i=0;i<n;i++)
		{
				data[i]=s.nextInt();
			
		}
		for(int i =1;i<n;i++)
		{
			int tem = gcd(data[0],data[i]);
			System.out.println(data[0]/tem+"/"+data[i]/tem);
		}
		
//		System.out.println(gcd(9,6));
		
		
		
	}
	
	public static int gcd(int a, int b)
	{
		if(b==0)
			return a;
		else
			return gcd(b,a%b);

		
	}

}
