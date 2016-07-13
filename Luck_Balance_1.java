package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Luck_Balance_1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int data2[] = new int[n];
		ArrayList<Integer> data1 = new ArrayList<>();
		int total_luck = 0;
//		int number_of_1 = 0;
		
		for(int i =0;i<n;i++)
		{
			int now = s.nextInt();
			data2[i] = s.nextInt();
			if(data2[i]==1)
				data1.add(now);
			else
			total_luck = total_luck + now;
			
		}
		
		for(int i =0;i<data1.size();i++)
		{
			for(int j =0;j<data1.size()-1;j++)
			{
				if(data1.get(j)<data1.get(j+1))
				{
					int tem = data1.get(j);
					data1.set(j, data1.get(j+1));
					data1.set(j+1, tem);
				}
			}
		}
		
		for(int i =0;i<k;i++)
		{
			total_luck = total_luck + data1.get(i);
		}
		for(int i =k;i<data1.size();i++)
		{
			total_luck = total_luck - data1.get(i);
		}
		
		System.out.println(total_luck);
		
		
		
	}

}
