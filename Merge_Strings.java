/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Merge_Strings
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = s.nextLine();
		String ans ="";
		for(int i =0;i<Math.min(a.length(), b.length());i++)
		{
			ans = ans + a.charAt(i);
			ans = ans + b.charAt(i);
		}
		if(a.length()>b.length())
		{
			for(int i =b.length();i<a.length();i++)
			{
				ans = ans + a.charAt(i);
			}
		}
		else if(a.length()<b.length())
		{
			for(int i =a.length();i<b.length();i++)
			{
				ans = ans + b.charAt(i);
			}
		}
	
		System.out.println(ans);
		
	}

}
