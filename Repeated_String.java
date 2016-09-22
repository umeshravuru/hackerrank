/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Repeated_String
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		long n = Long.parseLong(s.nextLine());
		long count_a = 0;
		for (int i = 0; i < data.length(); i++)
		{
			if (data.charAt(i) == 'a')
				count_a++;
		}

		long times = (long) (n / data.length());
		count_a = times * count_a;
		for (int i = 0; i < n % data.length(); i++)
		{
			if (data.charAt(i) == 'a')
				count_a++;
		}
		System.out.println(count_a);
	}

}
