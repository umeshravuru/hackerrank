package hack;

import java.util.Scanner;

public class a1paper_3
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] data = new int[n - 1];
		int[] data_inc = new int[n];

		for (int i = 0; i < n - 1; i++)
		{
			data[i] = s.nextInt();
			data_inc[i+1]=(int) (Math.pow(2, i)*data_inc[i]+data[i]);
		}
		
		int needed = 0;
		int exact = 0;
		int had = 0;
		for(int i =0;i<n-1;i++)
		{
//			System.out.print((int)Math.pow(2, i+1)+" ");
		}
		System.out.println();
		for(int i =0;i<n-1;i++)
		{
			exact = (int) Math.pow(2, i+1);
//			has = had+data
			needed = (exact - data[i])* (exact/2);
			
			
			
			
			
			
			System.out.print(needed+" ");
		}
		
		
		
		
	}

}
