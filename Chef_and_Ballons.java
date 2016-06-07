package hack;

import java.util.Scanner;

public class Chef_and_Ballons
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		for(int i =0;i<t;i++)
		{
			long r = s.nextLong();
			long g = s.nextLong();
			long b = s.nextLong();
			long m =s.nextLong();
			long ans =0;
			if(r<m)
				ans = ans+r;
			else
				ans = ans+m-1;
			
			if(g<m)
				ans = ans+g;
			else
				ans = ans+m-1;
			
			if(b<m)
				ans = ans+b;
			else
				ans = ans+m-1;
			
			System.out.println(ans+1);
			
		}
		
		
	}

}
