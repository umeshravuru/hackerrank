/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class Count_Duplicates
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
		}
		System.out.println(sol(data));

	}

	public static int sol(int data[])
	{
		int ans = 0;
		Map<Integer, Integer> freq = new HashMap<>();
		for (int i = 0; i < data.length; i++)
		{
			if (freq.get(data[i]) == null)
				freq.put(data[i], 1);
			else
				freq.put(data[i], freq.get(data[i]) + 1);
		}
		
		for(int key : freq.keySet())
		{
			if(freq.get(key)>1)
				ans++;
		}

		return ans;
	}

}
