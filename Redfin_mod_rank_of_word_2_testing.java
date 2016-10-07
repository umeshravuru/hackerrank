/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**

 */
public class Redfin_mod_rank_of_word_2_testing
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		String target = data;
		char tem[] = data.toCharArray();
		Arrays.sort(tem);

		data = new String(tem);
		// System.out.println(data);

		int ans = 0;
		ArrayList<Character> data_main = new ArrayList<>();
		ArrayList<Character> target_main = new ArrayList<>();
		for (int i = 0; i < data.length(); i++)
		{
			data_main.add(data.charAt(i));
			target_main.add(target.charAt(i));
		}
		while (target_main.size() > 0)
		{
			for (int i = 0; i < data.length(); i++)
			{
				if (data_main.get(i) == target_main.get(0))
				{
					data_main.remove(i);
					target_main.remove(0);
					break;
				} else
				{
					ans = ans + fac(data_main.size() - 1);
				}
			}
		}
		System.out.println(ans+1);

	}
	public static int fac(int n)
	{
		if (n == 1)
			return 1;
		else
			return n * fac(n - 1);
	}

}
