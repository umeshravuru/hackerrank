/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Strange_Counter
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		long data = s.nextLong();
		int now =0;
		int later =3;
//		while(data>now)
//		{
//			now = now+later;
//			later = 2*later;
//		}
		double tem = (double)data/(double)3;
		tem = (double)Math.log(tem)/(double)Math.log(2);
		System.out.println(tem);
		
		
		
		System.out.println(now-data+1);
		
		
	}

}
