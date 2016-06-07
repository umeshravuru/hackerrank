package beer_night;

import java.util.Scanner;

public class Consecutive_Subsequences
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int t = s.nextInt();
		
		for(int ii=0;ii<t;ii++)
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int [] data = new int [n];
			int [] cum_Sum = new int [n];
			int [] ans = new int [k];
			ans[0]=1;
			for(int i =0;i<n;i++)
			{
				data[i]=s.nextInt();
			}
			ans[data[0]%k]++;
			cum_Sum[0]=data[0]%k;
			for(int i =1;i<n;i++)
			{
				cum_Sum[i]=cum_Sum[i-1]+data[i];
				cum_Sum[i]=cum_Sum[i]%k;
				ans[cum_Sum[i]]++;
			}
			int final_Ans = 0;
			for(int i =0;i<ans.length;i++)
			{
				final_Ans = final_Ans +(ans[i]*(ans[i]-1))/2;
			}
//			disp(ans);
			System.out.println(final_Ans);
		}
		
	}
	
	
	public static void disp(int[] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("");
	}

}
