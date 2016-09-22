/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Circular_Array_Rotation
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int q = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
		}
		for (int i = 0; i < q; i++)
		{
			int now = s.nextInt();
			if ((now - k + n)%n < 0)
				System.out.println(data[((now - k + n) % n)+n]);
			else
				System.out.println(data[(now - k + n) % n]);
		}

	}

}
