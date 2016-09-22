/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.ArrayList;
import java.util.Scanner;

/**

 */
public class Braces_prakash
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
			ArrayList<Character> stac = new ArrayList<>();
			int che = 0;
			for (int i = 0; i < data.length(); i++)
			{
				if (data.charAt(i) == '(' || data.charAt(i) == '['
						|| data.charAt(i) == '{')
					stac.add(data.charAt(i));
				else
				{
					if (data.charAt(i) == ')')
					{

						if (stac.size() == 0)
						{
							che = 1;
							break;
						}
						if (stac.get(stac.size() - 1) != '(')
						{
							che = 1;
							break;
						} else
							stac.remove(stac.size() - 1);
					} else if (data.charAt(i) == '}')
					{
						if (che != 1)
						{
							if (stac.size() == 0)
							{
								che = 1;
								break;
							}
							// System.out.println(data.charAt(i));
							if (data.charAt(i) == '}')
							{

								// System.out.println(stac.size() + " kj ");
								if (stac.get(stac.size() - 1) != '{')
								{
									che = 1;
									break;
								}
							else
								stac.remove(stac.size() - 1);
							}
							// System.out.println("lj");
						}
					} else if (data.charAt(i) == ']')
					{
						if (che != 1)
						{
							if (stac.size() == 0)
							{
								che = 1;
								break;
							}
							if (data.charAt(i) == ']')
							{
								if (stac.get(stac.size() - 1) != '[')
								{
									che = 1;
									break;
								} else
									stac.remove(stac.size() - 1);
							}
						}
					}
				}
//				System.out.println(stac);
			}
//			System.out.println(stac.size());

			if (che == 0)
			{
				if (stac.size() == 0)
					System.out.println("YES");
				else
					System.out.println("NO");
			} else
				System.out.println("NO");

		}

	}

}
