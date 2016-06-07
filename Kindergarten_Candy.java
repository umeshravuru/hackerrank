package hack;

import java.util.Scanner;

public class Kindergarten_Candy
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		
		int[] data = new int[t];
		for(int i =0;i<t;i++)
		{
			data[i]=s.nextInt();
		}
		int [] ans = new int [t];
		ans[0]=1;
		int min =100000;
		for(int i =1;i<t;i++)
		{
			if(data[i]>data[i-1])
				ans[i]=ans[i-1]+1;
			else
				ans[i]=ans[i-1]-1;
			
			
			if(ans[i]<min)
				min=ans[i];
		}
//		for(int i =0;i<t;i++)
//		{
//			System.out.print(ans[i]+" ");
//		}
		if(min<1)
		{
		for(int i =data.length-1;i>=0;i--)
		{
			ans[i]=ans[i]+1-min;
		}
		}
//		ans[ans.length-1]=1;
		if(data[data.length-1]<data[data.length-2])
		{
			ans[data.length-1]=1;
		}
		for(int i =data.length-2;i>0;i--)
		{
			if(data[i]<data[i-1])
			{
				ans[i]=ans[i+1]+1;
			}
			else
				break;
		}
//		System.out.println("");
		long final_Ans=0;
		for(int i =0;i<t;i++)
		{
			final_Ans=final_Ans+ans[i];
		}
		System.out.print(final_Ans);
		
		
	}

}
