/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Kattis;

import java.util.Scanner;

/**

 */
public class String_Multimatching
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);

		while (s.hasNext())
		{
			int n = Integer.parseInt(s.nextLine());
			String data[] = new String[n];
			for (int i = 0; i < n; i++)
			{
				data[i] = s.nextLine();
			}
			String key = s.nextLine();

			for (int i = 0; i < n; i++)
			{
				if (key.contains(data[i]))
				{
					for (int j = 0; j < key.length() - data[i].length()
							+ 1; j++)
					{
						// System.out.println(key.substring(j,j+data[i].length()));
						if (data[i]
								.equals(key.substring(j, j + data[i].length())))
							System.out.print(j + " ");
					}
				System.out.println();
				}
				else
				{
					System.out.println();
				}
			}

		}

	}

}
