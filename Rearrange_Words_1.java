/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Arrays;
import java.util.Scanner;

/**

 */
public class Rearrange_Words_1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		if (data.equals(reverse(data)))
			System.out.println("no answer");
		else
		{
			char[] tem_data = data.toCharArray();
			String now = "";
			String ans = "";
			for (int i = tem_data.length - 1; i > 0; i--)
			{
				if (tem_data[i - 1] < tem_data[i])
				{
					now = data.substring(i - 1, data.length());
					ans = data.substring(0, i - 1);
					break;
				}
			}
			System.out.println(now);
			System.out.println(ans);
			char now_first = now.charAt(0);
			int freq[] = new int[26];
			for (int i = 0; i < now.length(); i++)
			{
				freq[(int) now.charAt(i) - 97]++;
			}
			disp(freq);
			int num_now_first = (int) now_first - 97;
			for (int i = num_now_first + 1; i < 26; i++)
			{
				if (freq[i] > 0)
				{
					freq[i]--;
					ans = ans + (char) (i + 97);
					break;
				}
			}
			System.out.println(ans);
			disp(freq);
			for (int i = 0; i < 26; i++)
			{
				for (int j = 0; j < freq[i]; j++)
				{
					ans = ans + (char) (i + 97);
				}
			}
			System.out.println(ans);

		}

	}

	public static String reverse(String data)
	{
		char[] tem = data.toCharArray();
		Arrays.sort(tem);
		char[] ans_tem = new char[tem.length];
		for (int i = 0; i < tem.length; i++)
		{
			ans_tem[i] = tem[tem.length - 1 - i];
		}
		return new String(ans_tem);
	}
	public static void disp(int data[])
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
