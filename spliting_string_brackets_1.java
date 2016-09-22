/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class spliting_string_brackets_1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		System.out.println(sol(data));

	}
	public static int sol(String data1)
	{
		int ans = 0;
		char[] data = data1.toCharArray();
		int open =0;
		int close =0;
		for(int i =0;i<data.length;i++)
		{
			if(data[i]=='(')
				open++;
			if(data[i]==')')
				close++;
		}
		int tem_open =0;
		int tem_close =close;
		for(int i =0;i<data.length;i++)
		{
			if(data[i]=='(')
			{
				tem_open++;
			}
			if(data[i]==')')
			{
				tem_close--;
			}
			if(tem_open==tem_close)
			{
				return i+1;
			}
		}
		
		
		return ans;
	}
}
