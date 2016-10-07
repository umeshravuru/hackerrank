/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class rolling_string
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		int k = Integer.parseInt(s.nextLine());
		String[] q = new String[k];
		for (int i = 0; i < k; i++)
		{
			q[i] = s.nextLine();
		}
		System.out.println(sol(data, q));

	}
	public static String sol(String data1, String[] q)
	{
		char data[] = data1.toCharArray();
		for (int i = 0; i < q.length; i++)
		{
			String now = q[i];
			String[] now1 = now.split(" ");
			int x = Integer.parseInt(now1[0]);
			int y = Integer.parseInt(now1[1]);
			if (now1[2].equals("R"))
			{
				for (int j = x; j <= y; j++)
				{
					int cha = (int) data[j];
					cha = cha + 1;
					if (cha > 122)
						cha = cha - 26;
					data[j] = (char) cha;
				}
			} else
			{

				for (int j = x; j <= y; j++)
				{
					int cha = (int) data[j];
					cha = cha - 1;
					if (cha < 97)
						cha = cha + 26;
					data[j] = (char) cha;
				}

			}

		}
		String ans = new String(data);
		return ans;
	}

}
