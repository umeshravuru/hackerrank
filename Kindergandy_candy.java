package hack;

import java.util.Scanner;

public class Kindergandy_candy
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int [] data = new int [t];
		for(int i =0;i<t;i++)
		{
			data[i]=s.nextInt();
		}

		System.out.println(solu(data));
	}
	
	public static int solu(int [] data)
	{
		
		int [] ans = new int [data.length];
		ans[0]=1;
		for(int i =1;i<ans.length;i++)
		{
			if(data[i]>data[i-1])
				ans[i]=ans[i-1]+1;
			else //if(data[i]==data[i-1])
			{
				ans[i]=1;
			}
		}
		
		for(int i=ans.length-1;i>0;i--)
		{
			if(data[i]<data[i-1])
			{
				if(ans[i]>=ans[i-1])
				{
					ans[i-1]=ans[i]+1;
				}
			}
		}
		int final_ans=0;
		for(int i =0;i<ans.length;i++)
		{
//			if(ans[i]<=0)
//				System.out.println("no");
//			System.out.println(ans[i]);
			final_ans=final_ans+ans[i];
		}
		
		return final_ans;
	}

}
