/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Birthday_Cake_Candles
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int max =0;
		int count =0;
		int n = s.nextInt();
		for(int i =0;i<n;i++)
		{
			int tem = s.nextInt();
			if(tem>max)
			{
				max = tem;
				count =1;
			}
			else if(tem== max)
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
