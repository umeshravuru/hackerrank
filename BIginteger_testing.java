/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.math.BigInteger;
import java.util.Scanner;

/**

 */
public class BIginteger_testing
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		String a = s.nextLine();
		String b = s.nextLine();
		
		BigInteger aa = new BigInteger(a);
		BigInteger bb = new BigInteger(b);
		
		
		
		System.out.println(aa.divide(bb));
		
		
		
		
	}

}
