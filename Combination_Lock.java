/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Combination_Lock
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int data1 []= new int [5];
		int data2 []= new int [5];
		
		for(int i =0;i<5;i++)
		{
			data1[i]= s.nextInt();
		}
		for(int i =0;i<5;i++)
		{
			data2[i]= s.nextInt();
		}
		int ans =0;
		
		for(int i =0;i<5;i++)
		{
			int tem = Math.abs(data1[i]-data2[i]);
			if(tem>5)
				tem = tem -10;
			System.out.println(tem);
			ans = ans + tem;
		}
		System.out.println(ans);
				
		
		
	}

}
