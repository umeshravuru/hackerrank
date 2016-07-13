/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Kattis;

import java.util.Scanner;

/**

 */
public class Skocimis
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		
		int ans =0;
		while(true )
		{
			if(a+1==b && b+1==c)
				break;
			if(a==b || a==c || b==c)
				break;
			if(b-a>c-b)
			{
				int tem =b;
				b=a+1;
				c=tem;
			}
			else
			{
				int tem =b;
				b=c-1;
				a=tem;
			}
//			System.out.println(a +" "+b+" "+c);
			ans++;
		}
		System.out.println(ans);

	}

}
