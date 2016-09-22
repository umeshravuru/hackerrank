/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Aria_s_Loops
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		
		
	}
	public static long makePower(long n, long p)
	{
		long mod = (long) (Math.pow(10, 9) + 7);
		if (p == 0)
			return 1;
		if (p == 1)
			return n;
		if (p % 2 == 0)
		{
			long x = makePower(n, p / 2);
			return (x * x) % mod;
		} else
		{
			long x = makePower(n, p - 1);
			return (x * n) % mod;
		}
	}

}
