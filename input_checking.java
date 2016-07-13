/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Kattis;

import java.util.Scanner;

/**

 */
public class input_checking
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for(int ii=0;ii<t;ii++)
		{
			int n  = Integer.parseInt(s.nextLine());
			String data[] = new String[n];
//			int data[] = new int[n];
			for(int i =0;i<n;i++)
			{
				data[i]= s.nextLine();
			}
			
		}
		
		System.out.println("sdf");
		
	}

}
