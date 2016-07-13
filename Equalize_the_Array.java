/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class Equalize_the_Array
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner  s = new Scanner(System.in);
		Map<Integer, Integer> freq = new HashMap<>();
		int n = s.nextInt();
		int data []= new int [n];
		for(int i =0;i<n;i++)
		{
			data[i]= s.nextInt();
			if(freq.get(data[i])==null)
				freq.put(data[i], 1);
			else
				freq.put(data[i], freq.get(data[i])+1);
		}
		int max =0;
		for(int key:freq.keySet())
		{
			if(freq.get(key)>max)
				max = freq.get(key);
		}
		System.out.println(Math.min(n, n-max));
		
		
	}

}
