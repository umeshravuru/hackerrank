/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class Substring_vowels
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		find_sol(data);

	}

	public static void find_sol(String data)
	{
		Map<String, Integer> sets = new HashMap<>();
		String min = "";
		String max = "";
		int tem_i = -1;
		int tem_j = -1;
		for (int i = 0; i < data.length() - 1; i++)
		{
			for (int j = i + 2; j < data.length() + 1; j++)
			{
				// System.out.println(data.substring(i, j));
				String tem = data.substring(i, j);
				if (tem.charAt(0) == 'a' || tem.charAt(0) == 'e'
						|| tem.charAt(0) == 'i' || tem.charAt(0) == 'o'
						|| tem.charAt(0) == 'u')
				{
					if (tem.charAt(tem.length() - 1) != 'a'
							&& tem.charAt(tem.length() - 1) != 'e'
							&& tem.charAt(tem.length() - 1) != 'i'
							&& tem.charAt(tem.length() - 1) != 'o'
							&& tem.charAt(tem.length() - 1) != 'u')
					{
						if (min.equals(""))
						{
							min = tem;
						} else
						{
							if (tem_j != i)
							{
								if (min_check(min, tem))
								{
									min = tem;
									tem_j=i;
								}
							}
							else
							{
								min = tem;
							}
						}

						if (max.equals(""))
						{
							max = tem;
						} else
						{
							if (tem_i != i)
							{
							if (min_check(tem, max))
							{
								max = tem;
								tem_i=i;
							}
							}
						}

					}
				}

			}
		}
		// System.out.println(min_check("aab", "ab"));
		// System.out.println();
		System.out.println(max);
		System.out.println(min);

	}
	public static boolean min_check(String a, String b)
	{
		for (int i = 0; i < Math.min(a.length(), b.length()); i++)
		{
			if (a.charAt(i) < b.charAt(i))
				return true;
			else if (a.charAt(i) > b.charAt(i))
				return false;
		}

		if (a.equals(b))
			return false;
		if (a.length() < b.length())
			return true;

		return false;

	}

}
