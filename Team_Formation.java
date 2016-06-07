package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Team_Formation
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
			ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
			for (int i = 0; i < data.length; i++)
			{
				int che = 0;
				for (int j = 0; j < arr.size(); j++)
				{
					if (arr.get(j).get(arr.get(j).size() - 1) + 1 == data[i])
					{
						arr.get(j).add(data[i]);
						che = 1;
						break;
					}
				}
				if (che == 0)
				{
					ArrayList<Integer> tem = new ArrayList<>();
					tem.add(data[i]);
					arr.add(tem);
				}
			}
			int min = 100001;
			for (int i = 0; i < arr.size(); i++)
			{
				if (arr.get(i).size() < min)
					min = arr.get(i).size();
			}
			if (min == 100001)
				System.out.println("0");
			else
				System.out.println(min);
		}

	}

}
