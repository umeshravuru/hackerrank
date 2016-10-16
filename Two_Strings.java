/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.HashMap;
import java.util.Map;

/**

 */
public class Two_Strings
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

	}
	public static void sol(String a[], String b[])
	{
		for (int i = 0; i < a.length; i++)
		{
			String aa = a[i];
			String bb = b[i];
			int che = 0;
			Map<Character, Integer> map1  = new HashMap<>();
			Map<Character, Integer> map2  = new HashMap<>();
			for (int j = 0; j < aa.length(); j++)
			{
				map1.put(aa.charAt(j), 1);
			}
			for (int j = 0; j < bb.length(); j++)
			{
				map2.put(bb.charAt(j), 1);
			}
			for(char key : map1.keySet())
			{
				if(map2.get(key)!=null)
				{
					che=1;
					break;
				}
			}
			
			if(che==1)
				System.out.println("YES");
			else
				System.out.println("NO");
			
			
		}

	}

}
