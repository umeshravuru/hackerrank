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
public class Gridland_Metro
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int r = s.nextInt();
		long ans = n*m;
		Map<Integer, Integer> start = new HashMap<>();
		Map<Integer, Integer> end = new HashMap<>();
		for(int i =0;i<r;i++)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			if(start.get(a)==null)
			{
				start.put(a, b);
				end.put(a, c);
			}
			else
			{
				if(start.get(a)>b)
					start.put(a, b);
				if(end.get(a)<c)
					end.put(a, c);
			}
		}
		for(int key : start.keySet())
		{
			ans = ans - (end.get(key)-start.get(key)+1);
		}
		System.out.println(ans);
		
	}

}
