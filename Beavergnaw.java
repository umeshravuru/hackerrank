/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Kattis;

import java.util.Scanner;

/**

 */
public class Beavergnaw
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		String data = s.nextLine();
		
		while(true)
		{
			if(data.equals("0 0"))
				break;
			String data1 []= data.split(" ");
			
		int D = Integer.parseInt(data1[0]);
		int V = Integer.parseInt(data1[1]);
		
		double a = (double)D * (double)D * (double)D;
		double b = ((double)6 * (double)V) / (double)Math.PI;
		
		double c = a-b;
		double ans = (double)Math.cbrt(c);
		System.out.println((double)Math.round(ans * 1000000000d) / 1000000000d);
		
		data= s.nextLine();
		
		}
		
	}

}
