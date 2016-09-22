/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Bonetrousle
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i =0;i<t;i++)
		{
			long n = s.nextLong();
			long k = s.nextLong();
			long b = s.nextLong();
			
			long min = (b*(b+1))/2;
			long max =0;
			if(k>Math.pow(10, 9))
				max = (long) Math.pow(10, 18);
			else
			{
//				max = 
			}
			
		}
		
		
		
	}

}
