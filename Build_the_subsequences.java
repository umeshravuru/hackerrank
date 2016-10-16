/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Arrays;
import java.util.Scanner;

/**

 */
public class Build_the_subsequences
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		int n = data.length();
		String ans[] = new String[(int) (Math.pow(2, n) - 1)];
		for (int now = 1; now < Math.pow(2, n); now++)
		{
			String now_binary = Integer.toBinaryString(now);
			now_binary = make_equal_length(now_binary, n);
			System.out.println(now_binary);
			ans[now - 1] = get_a_substring(data, now_binary);
		}
		Arrays.sort(ans);
		for (int now = 1; now < Math.pow(2, n); now++)
		{
			if (ans[now - 1].length() == n)
				System.out.println(ans[now - 1]);
		}

	}

	public static String make_equal_length(String data, int n)
	{
		int now = data.length();
		for (int i = 0; i < n - now; i++)
		{
			data = "0" + data;
		}
		return data;
	}
	public static String get_a_substring(String data, String binary)
	{
		String ans = "";
		for (int i = 0; i < binary.length(); i++)
		{
			if (binary.charAt(i) == '1')
				ans = ans + data.charAt(i);
		}
		return ans;
	}

}
