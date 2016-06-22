package beer_night;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class All_permutations_of_an_array_woring
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
		}
		
		ArrayList<ArrayList<Integer>> all_perm = permuteUnique(data);
		
		for(int i =0;i<all_perm.size();i++)
		{
			System.out.println(all_perm.get(i));
		}
		
		
	}

	public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num)
	{
		ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
		returnList.add(new ArrayList<Integer>());

		for (int i = 0; i < num.length; i++)
		{
			Set<ArrayList<Integer>> currentSet = new HashSet<ArrayList<Integer>>();
			for (ArrayList<Integer> l : returnList)
			{
				for (int j = 0; j < l.size() + 1; j++)
				{
					l.add(j, num[i]);
					ArrayList<Integer> T = new ArrayList<Integer>(l);
					l.remove(j);
					currentSet.add(T);
				}
			}
			returnList = new ArrayList<ArrayList<Integer>>(currentSet);
		}

		return returnList;
	}
}
