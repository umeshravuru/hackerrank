package hack;

import java.util.Scanner;

public class Xor_sequence_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		for(int i =0;i<n;i++)
		{
			long ans=0;
			long a = s.nextLong();
			long b =s.nextLong();
			int check=0;
			for(long j =a;j<=b;j++)
			{
				
				if(j%4==0 && b-4>j)
				{
					
					while(j<b-4)
					{
					
					ans=ans^2;
					j=j+3;
					}
				}
				else
				ans=ans^arra((int) j);
			}
			System.out.println(ans);
			
			
		}

	}
	public static int arra(int n){
		if(n%4==0)
			return n;
		if(n%4==1)
			return 1;
		if(n%4==2)
			return n+1;
		if(n%4==3)
			return 0;
			
		
		return 0;
	}

}
