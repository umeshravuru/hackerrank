/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class pranitha_ibm_1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		while (s.hasNext())
		{
			String ss = s.nextLine();

			String data1[] = ss.split(" ");
			int N = Integer.parseInt(data1[0]);
			int p = Integer.parseInt(data1[1]);
			int q = Integer.parseInt(data1[2]);

			for (int i = 1; i <= N; i++)
			{
				int che = 0;
				if (i % p == 0 || i % q == 0)
				{
					System.out.print("OUT");
					che = 1;
				}
				if (String.valueOf(i).contains(String.valueOf(p))
						|| String.valueOf(i).contains(String.valueOf(q)))
				{
					System.out.print("THINK");
					che = 1;
				}
				if (che == 0)
					System.out.print(i);
				if (i != N)
					System.out.print(",");
			}

		}

	}

}
