/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Arrays;
import java.util.Scanner;

/**

 */
public class Turbo_Sort
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		int data [] = new int [n];
		for(int i =0;i<n;i++)
		{
			data[i] = s.nextInt();
		}
		Arrays.sort(data);
		for(int i =0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		
		
		
	}

}
