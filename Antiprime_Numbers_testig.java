/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Antiprime_Numbers_testig
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("{");
		for(int i =0;i<48;i++)
		{
			String tem = s.nextLine();
			String [] tem1 = tem.split(" ");
			System.out.print(tem1[1]+",");
		}
		
		System.out.println("}");
		
		
	}

}
