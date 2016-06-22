package hack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Perfect_Separating_1
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);

		String data1 = s.nextLine();
//		String data1 = "abbb";
		if (data1.length() % 2 == 1)
			System.out.println("0");
		else
		{
			char data[] = data1.toCharArray();
			int [] send_data = new int [data.length-1];
			for(int i =0;i<data.length/2-1;i++)
			{
				send_data[i]=1;
			}
			ArrayList<ArrayList<Integer>> all_perm = permuteUnique(send_data);
			long final_ans =0;
			for(int i = 0 ;i<all_perm.size();i++)
			{
//				System.out.println(all_perm.get(i));
				String a =String.valueOf(data[0]);
				String b ="";
				for (int j  =0;j< all_perm.get(i).size() ; j++)
				{
					if (all_perm.get(i).get(j) == 1)
						a =a +data[j+1];
					else
						b= b+data[j+1];
				}
//				System.out.println(a+" "+b);
				if(a.equals(b))
				{
					final_ans++;
//					System.out.println(a+" "+b);
				}
			}
			System.out.println(final_ans*2);
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
