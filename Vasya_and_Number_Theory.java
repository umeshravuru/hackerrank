package codeeva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vasya_and_Number_Theory
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < data.length; i++)
		{
			data[i] = s.nextInt();
		}
		Arrays.sort(data);
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		int final_more = 0;
		for (int j = 0; j < data.length; j++)
		{
			int che = 0;
			for (int i = 0; i < ans.size(); i++)
			{

				if (data[j] == 1)
				{
					final_more = 1;
					che = 1;
					break;
				}
				if (data[j] % ans.get(i).get(ans.get(i).size() - 1) == 0)
				{
					ans.get(i).add(data[j]);
					che = 1;
					break;
				}

			}
			if (che == 0)
			{
				ArrayList<Integer> tem = new ArrayList<>();
				tem.add(data[j]);
				ans.add(tem);
			}

		}
		int max =-1;
		for (int i = 0; i < ans.size(); i++)
		{
			if(ans.get(i).size()>max)
				max = ans.get(i).size();
		}
		System.out.println(max+final_more);

	}

}
