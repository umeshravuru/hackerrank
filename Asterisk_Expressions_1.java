/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.math.BigInteger;
import java.util.Scanner;

/**

 */
public class Asterisk_Expressions_1
{

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static long mod = (long) (Math.pow(10, 9) + 7);
	public static void main(String[] args) throws InterruptedException
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < n; ii++)
		{
			String data = s.nextLine();
			if (isValid(data))
			{
				while (data.contains("**"))
				{

					String power_str = sub_string_power(data);
//					 System.out.println(power_str);
//					 System.out.println(power(power_str));
					data = data.replace(power_str, power(power_str));
					// Thread.sleep(1000);
					// System.out.println(data);
				}
				String data_final[] = data.split("\\*");
				long finla_ans = 1;
				BigInteger bi1, bi2, bi3;
				bi3 = new BigInteger("1000000007");

				for (int i = 0; i < data_final.length; i++)
				{
					bi1 = new BigInteger(data_final[i]);
					bi2 = bi1.mod(bi3);
					long now_mult = bi2.longValue();
					finla_ans = finla_ans * now_mult;
					finla_ans = finla_ans % mod;
				}
				System.out.println(finla_ans);
			} else
				System.out.println("Syntax Error");
		}

	}
	public static boolean isValid(String data)
	{
		if (data.charAt(0) == '*' || data.charAt(data.length() - 1) == '*')
			return false;
		if (data.contains("***") || data.contains("0**0"))
			return false;
		return true;
	}

	public static long power_1(long a, long b)
	{
		// System.out.println(a+"--" + b);
		if (b == 0)
			return 1;
		String b_binary = conv(b, 2);
		long now = 1;
		a = a % mod;
		for (int i = 0; i < b_binary.length(); i++)
		{
			if (b_binary.charAt(i) == '1')
			{
				now = now * now;
				now = now % mod;
				now = now * a;
				now = now % mod;
			} else
			{
				now = now * now;
				now = now % mod;
			}
		}
		// System.out.println(now);
		return now % mod;
	}

	public static String power(String data)
	{
//		System.err.println(data);
		String data1[] = data.split("\\*\\*");
		BigInteger bi1, bi2, bi3;
		bi3 = new BigInteger("1000000007");
//		System.out.println(data1[1]);
		bi1 = new BigInteger(data1[0]);
		bi2 = bi1.mod(bi3);
		long a = bi2.longValue();
		
		bi1 = new BigInteger(data1[1]);
		bi2 = bi1.mod(bi3);
		long b = bi2.longValue();
		long tem_ab = power_1(a, b)% mod;
		return String.valueOf(tem_ab);
	}
	public static String sub_string_power(String data)
	{
		int now = 0;
		for (int i = 0; i < data.length() - 1; i++)
		{
			if (data.charAt(i) == '*' && data.charAt(i + 1) == '*')
			{
				now = i;
				break;
			}
		}
		String ans = "";
		for (int i = now + 2; i < data.length(); i++)
		{
			if (data.charAt(i) == '*')
				break;
			else
				ans = ans + data.charAt(i);
		}
		// System.out.println(ans+"ans");
		ans = "**" + ans;
		for (int i = now - 1; i >= 0; i--)
		{
			if (data.charAt(i) == '*')
				break;
			else
				ans = data.charAt(i) + ans;
		}
		// System.out.println(ans);
		return ans;
	}
	public static String conv(long data, int base)
	{
		System.out.println(Long.toBinaryString((long)data));
		return Long.toBinaryString((long)data);
	}

}
