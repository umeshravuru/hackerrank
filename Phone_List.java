/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Kattis;

import java.util.Scanner;

/**

 */
public class Phone_List
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < t; ii++)
		{
			int n = Integer.parseInt(s.nextLine());
			String data[] = new String[n];
			for (int i = 0; i < n; i++)
			{
				data[i] = s.nextLine();
			}
			
			int che=0;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (i != j && data[i].length() < data[j].length())
					{
						if (data[i]
								.equals(data[j].substring(0, data[i].length())))
						{
							che = 1;
							break;
						}
					}
				}
				if(che==1)
					break;
			}
			if(che==1)
				System.out.println("NO");
			else
				System.out.println("YES");

		}
		s.close();

	}

}
