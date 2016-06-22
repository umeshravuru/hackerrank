package hack;

import java.util.Scanner;

public class Suggest_Better_Spending_Rates_testing
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int thre = s.nextInt();
		int data[] = new int[n];
		int data1[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
			data1[i]= data[i];
			sum = sum + data[i];
		}

	

		for (int i = 0; i < n; i++)
		{
			data[i] = data[i] + 2;
		}

		int now = 0;
		while (now != n )
		{
			if(sum(data)==sum)
			disp(data);
			if(data[now]==data1[now]-thre)
			{
				now++;
			}
			else
				data[now]--;
			
			
		}

	}

	public static void disp(int[] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	public static int sum (int [] data)
	{
		int s  =0;
		for(int i=0;i<data.length;i++)
		{
			s= s+ data[i];
		}
		return s;
		
	}

}
