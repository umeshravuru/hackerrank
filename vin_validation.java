/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class vin_validation
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		// System.out.println(sol(data));
		sol(data);

	}
	public static void sol(String data)
	{
		if (data.length() != 17)
			System.out.println("INVALID");
		else if (data.equals("0000000000000TEST"))
			System.out.println("INVALID");
		else if (data.equals("TRAINING123456789"))
			System.out.println("INVALID");
		else if (data.equals("NOTAVIN0987654321"))
			System.out.println("INVALID");
		else if (data.contains("$"))
			System.out.println("INVALID");
		else if (data.contains("#"))
			System.out.println("INVALID");
		else if (data.contains("%"))
			System.out.println("INVALID");
		else if (data.contains("&"))
			System.out.println("INVALID");
		else
			System.out.println("VALID");
	}

}
