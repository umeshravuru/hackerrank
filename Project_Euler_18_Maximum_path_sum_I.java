package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_Euler_18_Maximum_path_sum_I
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		for(int i =0;i<t;i++)
		{
			int n = s.nextInt();
			ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> tem_arraylist = new ArrayList<Integer>();
			tem_arraylist.add(s.nextInt());
			data.add(tem_arraylist);
			for(int j =1;j<n;j++)
			{
				ArrayList<Integer> tem_arr = new ArrayList<Integer>();
				int [] tem = new int [j+1];
				for(int k=0;k<=j;k++)
				{
					tem[k]=s.nextInt();
				}
				
				for(int k=0;k<=j;k++)
				{
					if(k==0)
						tem_arr.add(Math.max(data.get(j-1).get(k),0)+tem[k]);
					else if(k<j)
						tem_arr.add(Math.max(data.get(j-1).get(k), data.get(j-1).get(k-1))+tem[k]);
					else
						tem_arr.add(Math.max(data.get(j-1).get(k-1), 0)+tem[k]);
				}
				data.add(tem_arr);
				
			}
			int final_ans=0;
			for(int j =0;j<data.get(data.size()-1).size();j++)
			{
				if(final_ans<data.get(data.size()-1).get(j))
					final_ans=data.get(data.size()-1).get(j);
			}
			
			System.out.println(final_ans);
			
			
		}
		
	}

}
