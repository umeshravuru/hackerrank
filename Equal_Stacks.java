package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Equal_Stacks
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		ArrayList<Integer> data1 = new ArrayList<>();
		ArrayList<Integer> data2 = new ArrayList<>();
		ArrayList<Integer> data3 = new ArrayList<>();
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for(int i =0;i<a;i++)
		{
			int now = s.nextInt();
			data1.add(now);
			sum1 = sum1 + now;
		}
		for(int i =0;i<b;i++)
		{
			int now = s.nextInt();
			data2.add(now);
			sum2 = sum2 + now;
		}
		for(int i =0;i<c;i++)
		{
			int now = s.nextInt();
			data3.add(now);
			sum3 = sum3 + now;
		}
		
		
		
		while(true)
		{
			if(sum1==sum2 && sum2 == sum3)
				break;
			int max_index =1;
			if(sum1<sum2)
				max_index=2;
			if(sum2<sum3)
				max_index=3;
			
			if(max_index==1)
			{
				sum1 = sum1-data1.get(0);
				data1.remove(0);
			}
			else if(max_index==2)
			{
				sum2 = sum2-data2.get(0);
				data2.remove(0);
			}
			else if(max_index==3)
			{
				sum3 = sum3-data3.get(0);
				data3.remove(0);
			}
			
		}
		System.out.println(sum1);
		
		
		
		
		
		
		
		
	}

}
