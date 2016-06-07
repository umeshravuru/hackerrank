package hack;

import java.util.Arrays;
import java.util.Scanner;

public class Angry_Children_2
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
		long sum =0;
		long min =10000000;
		
		for(int i =0;i<n-m;i++)
		{
			long tem=0;
			for(int j=i;j<m-1+i;j++)
			{
				for(int k=j+1;k<i+m;k++)
				{
				tem=tem+Math.abs(data[j]-data[k]);
				}
			}
//			System.out.println(tem);
			if(tem<min)
				min=tem;
		}
		
		System.out.println(min);
//		
		
	}

}
