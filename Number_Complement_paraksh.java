/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Number_Complement_paraksh
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		System.out.println(sol(data));
	}

	public static int sol(int data)
	{
		int ans = 0;
		String data_binary = conv(data, 2);
		String new_data = "";
		for (int i = 0; i < data_binary.length(); i++)
		{
			if (data_binary.charAt(i) == '1')
				new_data = new_data + "0";
			else
				new_data = new_data + "1";
		}
		int now = 0;
		for (int i = 0; i < new_data.length(); i++)
		{
			if (new_data.charAt(new_data.length()-1-i) == '1')
				ans = (int) (ans + Math.pow(2, now));
			now++;
		}

		return ans;
	}

	public static String conv(long data, int base)
	{

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

				data = (long) (data - (int) (data / Math.pow(base, pow))
						* Math.pow(base, pow));
			} else
				ans = ans + "0";

			pow--;

		}
		return ans;
	}

}
