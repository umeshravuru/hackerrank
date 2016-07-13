/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Hackerrank;

import java.util.Scanner;

/**

 */
public class Beautiful_Binary_String
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String data = s.nextLine();
		
		char [] data_char = data.toCharArray();
		int i =0;
		int ans =0;
		while(i<n-2)
		{
			if(data_char[i]=='0' && data_char[i+1]=='1' &&  data_char[i+2]=='0' )
			{
				data_char[i+2]='1';
				i++;
				ans ++;
			}
			i++;
		}
		
		System.out.println(ans);
		
	}

}
