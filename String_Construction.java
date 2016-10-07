/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class String_Construction
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
			String tem = String.valueOf(data.charAt(0));

			int ans = 1;

			while (tem.length() < data.length())
			{
				// System.out.println(tem);
				int che = 0;
				for (int i = 0; i < tem.length(); i++)
				{
					if (tem.length() + i < data.length() - 1)
					{
						if (tem.charAt(i) != data.charAt(tem.length() + i))
						{
							che = 1;
							break;
						}
					} else
					{
						che = 1;
						break;

					}
				}
				if (che == 1)
				{
					tem = tem + data.charAt(tem.length());
					ans++;
				} else
				{
					tem = tem + tem;
				}
			}
			System.out.println(ans);

		}

	}

}