/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Number_Complement
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sol(n));

	}

	public static int sol(int data)
	{
		int final_ans = 0;
		int base = 2;
		String ans = "";
		int pow = 0;
		for (int i = 0; i < 1000; i++)
		{
			if (data >= Math.pow(base, i) && data < Math.pow(base, i + 1))
			{
				pow = i;
				break;
			}
		}
		while (pow >= 0)
		{
			if (data >= Math.pow(base, pow))

			{
				ans = ans + String.valueOf((int) (data / Math.pow(base, pow)));;

				data = (int) (data - (int) (data / Math.pow(base, pow))
						* Math.pow(base, pow));
			} else
				ans = ans + "0";

			pow--;

		}
//		System.out.println(ans);
		String ans2="";
		for(int i =0;i<ans.length();i++)
		{
			if(ans.charAt(i)=='0')
				ans2= ans2+"1";
			else
				ans2= ans2+"0";
		}
		final_ans = Integer.parseInt(ans2,2);
		return final_ans;
	}

}
