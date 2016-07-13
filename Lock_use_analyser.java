/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**

 */
public class Lock_use_analyser
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String [] data = new String[n];
		for(int i =0;i<n;i++)
		{
			data[i]= s.nextLine();
		}
		System.out.println(check_log_his(data));
		
		
		

	}
	public static int check_log_his(String[] events)
	{
		ArrayList<Integer> data = new ArrayList<>();

		int che = 0;
		int ans = 1;
		for (int ii = 0; ii < events.length; ii++)
		{
			String in = events[ii];
			if (che == 0)
			{
				String in_array[] = in.split(" ");
				int key = Integer.parseInt(in_array[1]);
				if (in_array[0].equals("ACQUIRE"))
				{
					for (int i = 0; i < data.size(); i++)
					{
						if (data.get(i) == key)
						{
							che = 1;
							return ans;
						}
					}
					data.add(key);
					ans++;
				} else
				{
					if (data.get(data.size() - 1) == key)
					{
						ans++;
						data.remove(data.size() - 1);
					} else
						return ans;
				}
			}

		}
		if (data.size() == 0)
			return 0;
		else
			return ans;

	}

}
