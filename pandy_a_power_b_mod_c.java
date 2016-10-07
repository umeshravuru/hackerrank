/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class pandy_a_power_b_mod_c
{

	/**
	 * @param args
	 */
	public static long mod = (long) (Math.pow(10, 9) + 7);
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long c = mod;
		a = a % c;
		String b_binary = conv(b, 2);
		long now = 1;
//		System.out.println(b_binary);
		for (int i = 0; i < b_binary.length(); i++)
		{
			if (b_binary.charAt(i) == '1')
			{
				now = now * now;
				now = now % c;
				now = now * a;
				now = now % c;
			} else
			{
				now = now * now;
				now = now % c;
			}
		}
		System.out.println(now);

	}

	public static String conv(long data, int base)
	{
		
		return (Long.toBinaryString(data));
//		String ans = "";
//		long pow = 0;
//		for (long i = 0; i < 1000; i++)
//		{
//			if (data >= Math.pow(base, i) && data < Math.pow(base, i + 1))
//			{
//				pow = i;
//				break;
//			}
//		}
//		System.out.println(pow);
//		while (pow >= 0)
//		{
//			if (data >= Math.pow(base, pow))
//
//			{
//				ans = ans + String.valueOf((int) (data / Math.pow(base, pow)));;
//
//				data = (long) (data - (int) (data / Math.pow(base, pow))
//						* Math.pow(base, pow));
//			} else
//				ans = ans + "0";
//
//			pow--;
//
//		}
////		System.out.println(ans);
////		ans ="101100011010001010111100001011101100010011111111111111111";
//	
//		System.out.println(ans);
//		return ans;
	}

}
