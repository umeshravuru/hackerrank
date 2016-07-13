package Code_chef;

import java.util.Scanner;

public class Coin_Flip
{

	public static void main(String[] args)
	{
		
		Scanner s  = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n = s.nextInt();
			for(int jj=0;jj<n;jj++)
			{
				int a= s.nextInt();
				int b= s.nextInt();
				int c= s.nextInt();
				
				if(b%2==0)
					System.out.println(b/2);
				else
				{
					if(a==c)
						System.out.println(b/2);
					else
						System.out.println((b/2)+1);
				}
				
				
			}
		}
		
	}

}
