package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_Euler_10_Summation_of_primes
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int t =s.nextInt();
		ArrayList<Integer> data = new ArrayList<Integer>(); 
		data.add(2);
		for(int ii=3;ii<1000000;ii++)
		{
			int che=0;
			for(int i =0;i<data.size();i++)
			{
				if(ii%data.get(i)==0)
				{
					che=1;
					break;
				}
				if(data.get(i)>Math.sqrt(ii)+1)
					break;
			}
			if(che==0)
				data.add(ii);
			
		}
		
		
		for(int i =0;i<t;i++)
		{
			int n = s.nextInt();
			long ans =0;
			for(int j=0;j<data.size();j++ )
			{
				if(data.get(j)<=n)
					ans=ans+data.get(j);
				else
					break;
			}
			System.out.println(ans);
		}
		
		
	}

}
