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
public class Non_repeated_char
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		
		Map<Character, Integer> freq= new HashMap<>();
		for(int i =0;i<data.length();i++)
		{
			if(freq.get(data.charAt(i))==null)
				freq.put(data.charAt(i),1);
			else
				freq.put(data.charAt(i), freq.get(data.charAt(i))+1);
		}
		for(int i =0;i<data.length();i++)
		{
			if(freq.get(data.charAt(i))==1)
			{
				System.out.println(data.charAt(i));
				break;
			}
		}
		
	}

}
