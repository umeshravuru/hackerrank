package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Travel_Sky_Bag_Lock
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n = s.nextInt();
			int data = s.nextInt();
			
			String data_str = String.valueOf(data);
			
			int ans =0;
			for(int i =0;i<data_str.length();i++)
			{
				int now = Integer.parseInt(String.valueOf(data_str.charAt(i)));
				int min =10;
				if(!isprime(now))
				{
//					min = Math.min(min, Math.abs(now-2));
					if(now==1)
						ans++;
					else if(now==4)
						ans++;
					else if(now==6)
						ans++;
					else if(now==8)
						ans++;
					else if(now==9)
						ans=ans+2;
				}	
			}
			
			System.out.println(ans);
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
	}
	public static boolean isprime(int num)
	{
		if(num ==2 || num ==3 || num==5 || num==7 || num==0)
			return true;
		else
			return false;
	}

}
