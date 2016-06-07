package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Quicksort_1_Partition
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner( System.in);
		int n= s.nextInt();
		int [] data = new int [n];
		for(int i =0;i<n;i++)
		{
			data[i]=s.nextInt();
		}
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add(data[0]); 
		for(int i=1;i<data.length;i++)
		{
			if(data[i]>=data[0])
				ans.add(data[i]);
			else
				ans.add(0, data[i]);
		}
		for(int i =0;i<data.length;i++)
		{
		System.out.print(ans.get(i)+ " ");
		}
	}

}
