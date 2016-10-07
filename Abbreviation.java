/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Abbreviation
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
			String data11 = s.nextLine();
			String data22 = s.nextLine();
			String data1 = data11.toLowerCase();
			String data2 = data22.toLowerCase();
			// System.out.println(data1);
			// System.out.println(data2);
			int che = 0;
			for (int i = 0; i < data1.length() - data2.length(); i++)
			{
				int now = 0;
				if (data1.charAt(i) == data2.charAt(now))
				{
					now++;
					for (int j = i + 1; j < data1.length()
							&& now < data2.length(); j++)
					{
						// System.out.println(data1.charAt(j)+"
						// "+data2.charAt(now));
						if (data1.charAt(j) == data2.charAt(now))
						{
							now++;
						} else if ((int) data1.charAt(j) < 96)////
						{
							break;
						}
					}
					// System.out.println(now);
					if (now == data2.length())
					{
						che = 1;
						break;
					}
				}
			}
			if (data1.equals(data2))
				che = 1;
			if (che == 1)
			{
				// for(int i =0;i<data1.length();i++)
				// {
				//// if(data11.charAt(i))
				// }
				System.out.println("YES");
			} else
				System.out.println("NO");

		}

	}

}
