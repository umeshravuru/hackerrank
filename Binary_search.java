/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Hackerrank;

import java.util.Scanner;

/**

 */
public class Binary_search
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data [] = new int [n];
		for(int i =0;i<n;i++)
		{
			data[i]= s.nextInt();
		}
		int k = s.nextInt();
		System.out.println(bin_search(data, k));
		
	}

	public static int bin_search(int[] data, int k)
	{
		for (int i = 0; i < data.length; i++)
		{
			if (data[i] == k)
				return i;
		}
		return -1;
	}

}
