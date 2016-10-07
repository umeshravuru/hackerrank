/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class CamelCase
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		int ans =1;
		for(int i =0;i<data.length();i++)
		{
			if((int)data.charAt(i)<94)
				ans++;
		}
		System.out.println(ans);
		
	}

}
