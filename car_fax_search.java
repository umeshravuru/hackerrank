/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class car_fax_search
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();

		System.out.println(sol(data));

	}
	public static String sol(String data)
	{
		String dic[] =
		{"dog", "cat", "the", "off", "fox", "bar", "foo", "car", "hack", "cup",
				"pen"};
		for (int i = 0; i < dic.length; i++)
		{
			if (data.contains(dic[i]))
				return "FOUND";
		}
		return "NOT FOUND";
	}

}
