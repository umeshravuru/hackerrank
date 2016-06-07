package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Team_Formation_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++)
		{
			int n = s.nextInt();
			int data[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				data[i] = s.nextInt();
			}
			Arrays.sort(data);
			Map<Integer, Integer> freq = new HashMap<>();
			for(int i =0;i<n;i++)
			{
				if (freq.get(data[i]) == null)
					freq.put(data[i], 1);
				else
					freq.put(data[i], freq.get(data[i]) + 1);
			}
			
			ArrayList<Integer> tem = new ArrayList<>();
			
			for(int i =0;i<n;i++)
			{
				tem.add(data[i]);
				
			}
			System.out.println(freq);
			
		}
		
		
	}
	
	public static int min_in_sub_array(int []data)
	{
		int max =0;
		for(int i =0;i<data.length;i++)
		{
			if(data[i]>max)
				max = data[i];
		}
		int tem_max =0;
		for(int i =0;i<data.length;i++)
		{
			if(data[i]==max)
				tem_max++;
			else
				tem_max=0;
			if(tem_max>max)
				max = tem_max;
		}
		
		
		
		return max;
	}
	

}
