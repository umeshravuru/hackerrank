package hack;

import java.util.Arrays;
import java.util.Scanner;

public class Angry_Children_2_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m =s.nextInt();
		long[] data = new long[n];

		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextLong();
		}
		Arrays.sort(data);
		
		long ans=0;
		long tem_sum=0;
		for(int i =0;i<m;i++)
		{
			tem_sum=tem_sum+data[i];
			ans=ans+(i)*data[i]-(m-1-i)*data[i];
		}
		
		
//		for(int i =0;i<m-1;i++)
//		{
//			tem_sum=tem_sum+data[i];
//			for(int j =i+1;j<m;j++)
//			{
//			ans=ans+Math.abs(data[i]-data[j]);
//			}
//		}
		tem_sum=tem_sum-data[0];
//		tem_sum=tem_sum+data[m-1];
		long final_ans=ans;
		
		for(int i =1;i<n-m;i++)
		{
			ans=ans+((m-1)*data[i-1])+((m-1)*data[m+i-1]);
			ans=ans-2*tem_sum;
			tem_sum=tem_sum-data[i];
			tem_sum=tem_sum+data[m+i-1];
			if(final_ans>ans)
				final_ans=ans;
		}
		
		System.out.println(final_ans); 
	
		
		
	}

}
