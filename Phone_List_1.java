/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

/**

 */
public class Phone_List_1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for (int iii = 0; iii < t; iii++)
		{
			int n = Integer.parseInt(s.nextLine());

			ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
			for (int i = 0; i < 10; i++)
			{
				ArrayList<String> tem = new ArrayList<>();
				tem.add("1");
				data.add(tem);
			}

			for (int i = 0; i < n; i++)
			{
				String tem = s.nextLine();
				data.get(tem.length() - 1).add(tem);
			}
			int che = 0;
			int big = 10;
			for (int i = 9; i >= 0; i--)
			{
				if (data.get(i).size() != 1)
				{
					big = i;
					break;
				}
			}
//			System.out.println(data);
			for (int i = 0; i < big; i++)
			{
				if (data.get(i).size() != 1)
				{
					for (int j = i + 1; j <= big; j++)
					{
						if (data.get(j).size() != 1)
						{
							for (int ii = 1; ii < data.get(i).size(); ii++)
							{
								for (int jj = 1; jj < data.get(j).size(); jj++)
								{

									if (data.get(i).get(ii)
											.equals(data.get(j).get(jj)
													.substring(0, data.get(i)
															.get(ii).length())))
									{
										che = 1;
										break;
									}

								}
							}
							if (che == 1)
								break;
						}
					}
					if (che == 1)
						break;
				}
				if (che == 1)
					break;
			}
			if (che == 1)
				System.out.println("NO");
			else
				System.out.println("YES");

			// System.out.println(data);

		}

	}

}
