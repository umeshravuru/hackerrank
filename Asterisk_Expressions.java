/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Asterisk_Expressions
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
//					System.out.println(power_str);
//					System.out.println(power(power_str));
					data = data.replace(power_str, power(power_str));
//					Thread.sleep(1000);
//					System.out.println(data);
				}
				String data_final[] = data.split("\\*");
				long finla_ans = 1;
				for (int i = 0; i < data_final.length; i++)
				{
					finla_ans = finla_ans * Long.parseLong(data_final[i]);
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
		int n = data.length();

		for (int i = 1; i < n - 1; i++)
		{
			if (data.charAt(i) == '*')
			{
				if (i + 2 < n)
					if (data.charAt(i + 2) == '*' && data.charAt(i + 1) == '*')
						return false;
			}
		}

		return true;
	}
	public static String power(String data)
	{
		String str_a = "";
		String str_b = "";
		for (int i = 0; i < data.length(); i++)
		{
			if (data.charAt(i) == '*')
				break;
			else
				str_a = str_a + data.charAt(i);
		}
		for (int i = data.length() - 1; i >= 0; i--)
		{
			if (data.charAt(i) == '*')
				break;
			else
				str_b = data.charAt(i) + str_b;
		}

		long a = Long.parseLong(str_a);
		long b = Long.parseLong(str_b);
		long ans = 1;
		for (int i = 0; i < b; i++)
		{
			ans = ans * a;
			ans = ans % mod;
		}
		return String.valueOf(ans);
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
		// System.out.println(ans);
		ans = "**" + ans;
		for (int i = now - 1; i >= 0; i++)
		{
			if (data.charAt(i) == '*')
				break;
			else
				ans = data.charAt(i) + ans;
		}

		return ans;
	}

}
