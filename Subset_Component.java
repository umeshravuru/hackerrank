package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Subset_Component
{

	public static void main(String[] args)
	{
		Scanner  s = new Scanner(System.in);
		int n =s.nextInt();
		long [] data = new long[n];
		for(int i=0;i<n;i++)
		{
			data[i]=s.nextLong();
		}
		int total_number = (int)( Math.pow(2, data.length));
		
		ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>(); 
		for(int i=1;i<total_number;i++)
		{
			ArrayList<Long> temp = new ArrayList<Long>();
			String binary_string = Integer.toBinaryString(i);			
			for(int j=binary_string.length()-1;j>=0;j--)
			{
				if(binary_string.charAt(j)=='1')
				{
					temp.add(data[binary_string.length()-1-j]);
				}
			}
			
			ans.add(temp);
		}

		int final_ans=64;
	
		
		for(int i=0;i<ans.size();i++)
		{
			
//			int [] tree = new int [64];
			ArrayList<Integer> tree = new ArrayList<Integer>();
			for(int j=0;j<64;j++)
			{
//				tree[j]=j;
				tree.add(j);
			}
			
			int temp_index=0;
			for(int j=0;j<ans.get(i).size();j++)
			{
				int check_sum=0;
				String temp_tree_value = Long.toBinaryString(ans.get(i).get(j));
				for(int k=temp_tree_value.length()-1;k>=0;k--)
				{
					if(temp_tree_value.charAt(k)=='1')
					{
						check_sum++;
						if(check_sum==1)
						{
							temp_index=tree.get(temp_tree_value.length()-1-k);//[temp_tree_value.length()-1-k];
						}
						else
						{
//							System.out.println(temp_index+" inde" );
						for(int k1=0;k1<64;k1++)
						{
							if(tree.get(k1)==temp_tree_value.length()-1-k)
							{
								tree.set(k1, temp_index);//=temp_index;
							}
						}
						}
					}
				}
			}
			System.out.println(ans.get(i));
		System.out.println(tree);
			System.out.println(" ");
			
			int final_sub_ans=64;
			while(tree.size()>0)
			{
				int temp_eq=tree.get(0);
				for(int j=1;j<tree.size();j++)
				{
					if(temp_eq==tree.get(j))
					{
						final_sub_ans--;
						tree.remove(j);
						j--;
					}
				}
				tree.remove(0);
			}
//			System.out.println(final_sub_ans);
		
			final_ans=final_ans+final_sub_ans;
			
		}
		
		System.out.println(final_ans);
		
		
		

	}

}
