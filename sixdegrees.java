package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sixdegrees
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for(int ii=0;ii<t;ii++)
		{
			int n = Integer.parseInt(s.nextLine());
			Map<String, Integer> dic = new HashMap<String,Integer>();
			ArrayList<String> dic_arr = new ArrayList<String>();
			ArrayList<Integer> links_a = new ArrayList<Integer>();
			ArrayList<Integer> links_b = new ArrayList<Integer>();
			for(int i =0;i<n;i++)
			{
				String tem = s.nextLine();
				String [] tem1 = tem.split(" ");
				if(dic.get(tem1[0])==null)
				{
					dic.put(tem1[0], 1);
					dic_arr.add(tem1[0]);
					links_a.add(dic_arr.size());
				}
				else
				{
					
					for(int j =0;j<dic_arr.size();j++)
					{
						if(tem1[0].equals(dic_arr.get(j)))
						{
							links_a.add(j+1);
							break;
						}
					}
				}
				
				if(dic.get(tem1[1])==null)
				{
					dic.put(tem1[1], 1);
					dic_arr.add(tem1[1]);
					links_b.add(dic_arr.size());
				}
				else
				{
					
					for(int j =0;j<dic_arr.size();j++)
					{
						if(tem1[1].equals(dic_arr.get(j)))
						{
							links_b.add(j+1);
							break;
						}
					}
				}
				
			}
			
			int [] main_array = new int [dic_arr.size()];
			for(int i =0;i<main_array.length;i++)
			{
				main_array[i]=i+1;
			}
			
			for(int i =0;i<links_a.size();i++)
			{
				int temm = main_array[links_b.get(i)-1];
				for(int j=0;j<main_array.length;j++)
				{
					if(main_array[links_a.get(i)-1] == main_array[j])
						main_array[j]=temm;
				}
			}
			
			
			pri(main_array);
			Map<Integer, Integer> freq = new HashMap<Integer,Integer>();
			for(int i =0;i<main_array.length;i++)
			{
				if(freq.get(main_array[i])==null)
					freq.put(main_array[i], 1);
				else
					freq.put(main_array[i],freq.get(main_array[i])+1);
			}
			int che=0;
			System.out.println(freq);
			for (int key : freq.keySet()) {
				if(freq.get(key)>7)
				{
					che=1;
					break;
				}
			}
			if(che==1)
				System.out.println("NO");
			else
				System.out.println("YES");
			
			
			
			
//			System.out.println(dic);
//			System.out.println(dic_arr);
//			System.out.println(links_a);
//			System.out.println(links_b);
		}
		
		
	}
	public static void pri(int data[])
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	

}
