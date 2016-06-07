package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bus_Numbers
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
		}
		Arrays.sort(data);
		
		int[] ans = new int[n - 1];
		for (int i = 0; i < n - 1; i++)
		{
			ans[i] = data[i + 1] - data[i];
		}
		int max=0;
		for (int i = 0; i < n - 2; i++)
		{
			int j=0;
			while (i+j+1<n-1)
			{
				if (ans[i+j] == 1 && ans[i+j + 1] == 1)
				{
					j++;
				}
				else
					break;
			}
			
			if(j>0)
			{
				System.out.print(data[i]+"-"+data[i+j+1]+" ");
				i=i+j+1;
				max =i;
			}
			else
			{
				System.out.print(data[i]+" ");
			}

		}
		max = Math.max(max, n-3);
		
		for(int i =max+1;i<n;i++)
		{
			System.out.print(data[i]+" ");

		}
	}

}
