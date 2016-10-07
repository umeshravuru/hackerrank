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
public class String_Construction_1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < n; ii++)
		{
			String data = s.nextLine();
			Map<Character, Integer> used = new HashMap<>();
			used.put(data.charAt(0), 1);
			int ans =1;
			for(int i =0;i<data.length();i++)
			{
				if(used.get(data.charAt(i))== null)
				{
					ans++;
					used.put(data.charAt(i), 1);
				}
			}
			System.out.println(ans);
			
			
		}
		
	}

}

