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
public class Sock_Merchant
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Map<Integer, Integer> data = new HashMap<>();
		for (int i = 0; i < n; i++)
		{
			int now = s.nextInt();
			if (data.get(now) == null)
				data.put(now, 1);
			else
				data.put(now, data.get(now) + 1);
		}
		int ans = 0;
		for (int key : data.keySet())
		{
			ans = ans + data.get(key) / 2;
		}
		System.out.println(ans);

	}

}
