package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Match_the_Shoes_1
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
				
				int che =0;
				for(int i =0;i<final_ans.size();i++)
				{
					if(final_ans.get(i).get(0)==num)
					{
						int che1 =0;
						for(int j =1;j<final_ans.get(i).size();j++)
						{
							if(final_ans.get(i).get(j)>key)
							{
								final_ans.get(i).add(j,key);
								che1 =1;
								break;
							}
						}
						if(che1==0)
							final_ans.get(i).add(key);
						che=1;
						break;
					}
					
				}
				if(che==0)
				{
					ArrayList<Integer> tem = new ArrayList<>();
					tem.add(num);
					tem.add(key);
					final_ans.add(tem);
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
						final_ans.set(j, final_ans.get(j+1));
						final_ans.set(j+1, tem);
					}
				}
			}
			
			System.out.println(final_ans);
			
			for(int i =final_ans.size()-1;i>=0;i--)
			{
				
				for(int j =1;j<final_ans.get(i).size();j++)
				{
					System.out.println(final_ans.get(i).get(j));
					k--;
					if(k==0)
						break;
				}
				if(k==0)
					break;
				
			}
			
			
		}

	}
