package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class A_or_B_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		ArrayList<ArrayList<Integer>> keys1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> keys2 = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<16;i++)
		{
			ArrayList<Integer> temp1 = new ArrayList<Integer>();
			ArrayList<Integer> temp2 = new ArrayList<Integer>();
			for(int i1=0;i1<16-1;i1++)
			{
				for(int i2=0;i2<16;i2++)
				{
					if((i1|i2 )== i)
					{
						temp1.add(i1);
						temp2.add(i2);
					}
				}
			}
			keys1.add(temp1);
			keys2.add(temp2);
		}
		System.out.println(keys1);
		System.out.println(keys2);

		int change[][] = new int [15][15];
		for(int i =0;i<16;i++)
		{
			for(int j =i+1;j<16;j++)
			{
				change[i][i]= get_change(i,j);
				change[j][i]= change[i][j];
			}
		}
		
		
		for (int ii = 0; ii < t; ii++)
		{
			int k = Integer.parseInt(s.nextLine());
			String data1 = s.nextLine();
			String data2 = s.nextLine();
			String data3 = s.nextLine();

			int max_len = Math.max(data1.length(),
					Math.max(data2.length(), data3.length()));
			for (int i = 0; i < max_len - data1.length(); i++)
			{
				data1 = "0" + data1;
			}
			for (int i = 0; i < max_len - data2.length(); i++)
			{
				data2 = "0" + data2;
			}
			for (int i = 0; i < max_len - data3.length(); i++)
			{
				data3 = "0" + data3;
			}
			
			
			for(int i =0;i<data3.length();i++)
			{	
				
			}
			
			
			
			
			
			
		}
		
		
	}
	public static int get_change(int a,int b)
	{
		String aa = Integer.toBinaryString(a);
		String bb = Integer.toBinaryString(b);
		int ans =0;
		for(int i =0;i<4;i++)
		{
			if(aa.charAt(i)!=bb.charAt(i))
				ans++;
		}
		return ans;
	}

}
