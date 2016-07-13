/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Kattis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class String_Multimatching_1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		while (s.hasNext())
		{
			int n = Integer.parseInt(s.nextLine());
			String data[] = new String[n];
			for (int i = 0; i < n; i++)
			{
				data[i] = s.nextLine();
			}
			String key = s.nextLine();
			
			Map<Character, ArrayList<Integer>> table = new HashMap<>();
			for (int i = 0; i < key.length(); i++)
			{
				if(table.get(key.charAt(i))==null)
				{
					ArrayList<Integer> tem = new ArrayList<>();
					tem.add(i);
				}
				else
				{
					ArrayList<Integer> tem = table.get(key.charAt(i));
					tem.add(i);
					table.put(key.charAt(i), tem);
				}
			}
			ArrayList<Integer> ans = new ArrayList<>();
			for(int i =0;i<n;i++)
			{
				ans = table.get(data[i].charAt(0));
				
				for(int j =1;j<data[i].length();j++)
				{
					ArrayList<Integer> tem = table.get(data[i].charAt(j));
					
//					for(int ii=0;ii<)
					
				}
			}
			
			
		}
		
		
		
	}

}
