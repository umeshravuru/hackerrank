/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.math.BigInteger;
import java.util.Scanner;

/**

 */
public class Catalan_Numbers
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String ans [] = new String[5001];
		ans[0]="1";
		ans[1]="1";
		
		for(int i =2;i<=5000;i++)
		{
			BigInteger aa = new BigInteger(ans[i-1]);
			BigInteger a2 = new BigInteger("2");
			BigInteger a1 = new BigInteger("1");
			BigInteger tem = new BigInteger(String.valueOf(i));
			aa = aa.multiply(a2.multiply(tem));
			aa = aa.multiply((a2.multiply(tem)).subtract(a1));
			aa = aa.divide(tem.multiply(tem.add(a1)));
			ans[i]= String.valueOf(aa);
		}
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(ans[s.nextInt()]);
		}
		
		
		
	}

}
