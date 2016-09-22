/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Counting_Valleys
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String data = s.nextLine();
//		String tem =s " ";
		System.out.print("-");
		for (int i = 0; i < data.length(); i++)
		{
			if (data.charAt(i) == 'U')
				System.out.print("/");
			else
				System.out.print("\\");
		}
		
		

	}

}
