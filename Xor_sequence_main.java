package Hackerrank;

import java.util.Scanner;

public class Xor_sequence_main
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int ii=0;ii<n;ii++)
		{
			long p = s.nextInt();
			long q = s.nextInt();
			long pp=p;
			long qq =q; 
			
			if(p%4!=0)
				pp = ((p/4)+1)*4;
			
			if(q%4!=0)
				qq = (q/4)*4;
			long ans =0;
			if(q-p>4)
			{
			
//			System.out.println(pp +" "+ qq);
			
			for(long i =pp;i<qq;i=i+4)
			{
				ans = ans ^ i;
				ans = ans ^ (i+3);
				ans = ans ^ 1;
			}
//			System.out.println(ans);
			for(long i = p;i<pp;i++)
			{
				if(i%4==0)
					ans = ans^i;
				else if((i-1)%4==0)
					ans = ans^1;
				else if((i-2)%4==0)
					ans = ans^(i+1);
			}
//			System.out.println(ans);
			for(long i = q;i>=qq;i--)
			{
				if(i%4==0)
					ans = ans^i;
				else if((i-1)%4==0)
					ans = ans^1;
				else if((i-2)%4==0)
					ans = ans^(i+1);
			}
			System.out.println(ans);
			}
			else
			{
				for(long i = p;i<=q;i++)
				{
					if(i%4==0)
						ans = ans^i;
					else if((i-1)%4==0)
						ans = ans^1;
					else if((i-2)%4==0)
						ans = ans^(i+1);
				}
				System.out.println(ans);
			}
		}
	}
}
