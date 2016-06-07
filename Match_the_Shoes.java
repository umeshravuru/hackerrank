package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Match_the_Shoes
{

	 public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			int k = s.nextInt();
			int n = s.nextInt();
			int m = s.nextInt();
			int data[] = new int [m];
			Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
			for(int i =0;i<m;i++)
			{
				data[i]=s.nextInt();
				if(freq.get(data[i])!=null)
					freq.put(data[i], freq.get(data[i])+1);
				else
					freq.put(data[i],1);
			}
			ArrayList<ArrayList<Integer>> final_ans = new ArrayList<ArrayList<Integer>>();
			for(int key : freq.keySet())
			{
				int num = freq.get(key);
				if(final_ans.size()<num)
				{
					ArrayList<Integer> tem = new ArrayList<>();
					tem.add(key);
					final_ans.add(tem);
				}
				else
				{
					int che =0;
					for(int i =0;i<final_ans.get(num-1).size();i++)
					{
						if(final_ans.get(num-1).get(i)>key)
						{
							final_ans.get(num-1).add(i,key);
							che =1;
							break;
						}
					}
					if(che==0)
						final_ans.get(num-1).add(key);
				}
			}
			
			
			System.out.println(final_ans);
			
			for(int i =0;i<final_ans.size();i++)
			{
				for(int j =0;j<final_ans.size()-1;j++)
				{
					if(final_ans.get(j).get(0)>final_ans.get(j+1).get(0))
					{
						ArrayList<Integer> tem = new ArrayList<>();
						tem = final_ans.get(j);
						final_ans.set(i, final_ans.get(i+1));
						final_ans.set(i+1, tem);
					}
				}
			}
			
			System.out.println(final_ans);
			
			
			for(int i =final_ans.size()-1;i>=0;i--)
			{
				
				int now = final_ans.get(i).size();
				while(k!=0 && now !=0)
				{
					System.out.println(final_ans.get(i).get(final_ans.get(i).size()-now));
					
					now--;
					k--;
				}
				if(k==0)
					break;
				
			}
			
			
		}

	}
