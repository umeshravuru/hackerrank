package Hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Minimum_Distances
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data [] = new int [n];
		Map<Integer, ArrayList<Integer>> freq  = new HashMap<>();
		
		for(int i =0;i<n;i++)
		{
			data[i]= s.nextInt();
			if(freq.get(data[i])==null)
			{
				ArrayList<Integer> tem  = new ArrayList<>();
				tem.add(i);
				freq.put(data[i], tem);
			}
			else
			{
				freq.get(data[i]).add(i);
			}
		}
		
		
//		System.out.println(freq);
		if(freq.size()==n)
		{
			System.out.println("-1");
		}
		else
		{
		int min = n;
		for(int key : freq.keySet())
		{
			ArrayList<Integer> tem = freq.get(key);
			for(int i =0;i<tem.size()-1;i++)
			{
				if(Math.abs(tem.get(i)-tem.get(i+1))<min)
						min = Math.abs(tem.get(i)-tem.get(i+1));
			}
			
			
		}
		
		System.out.println(min);
		}
		
		
	}

}
