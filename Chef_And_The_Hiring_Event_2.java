package hack;

import java.util.Scanner;

public class Chef_And_The_Hiring_Event_2
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		int t = s.nextInt();
		for(int i =0;i<t;i++)
		{
			int  n = s.nextInt();
			int len =0;
			for(int j=0;j<100;j++)
			{
				if(Math.pow(5, j)<n && Math.pow(5, j+1)>=n)
					len = j+1;
			}
//			System.out.println(len);
			String ans = "";
			
			n = (int) (n-Math.pow(5, len-1));
//			System.out.println(n);
			int tem1 =2;
			while(n>0)
			{
				if(Math.pow(5, len-1)<n)
				{
					n = (int) (n - Math.pow(5, len-1));
						tem1= tem1+2;	
						if(tem1==8)
						{
							break;
						}
				}
				else
					break;
			}
			ans = ans+String.valueOf(tem1);
			len--;
			int tem2 =0;
			while(n>0)
			{
				if(Math.pow(5, len-1)<n)
				{
					n = (int) (n - Math.pow(5, len-1));
						tem2= tem2+2;	
						if(tem2==8)
						{
							len--;
							ans = ans+String.valueOf(tem2);
							tem2 =0;
						}
				}
				else
				{
					len--;
					ans = ans+String.valueOf(tem2);
					tem2 = 0;
//					System.out.println(n);
				}
			}
			
			System.out.println(ans);
			
			
			
		}
		
		
	}

}
