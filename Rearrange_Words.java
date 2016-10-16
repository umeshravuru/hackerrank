/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class Rearrange_Words
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
			ArrayList<Character> ans = new ArrayList<>();
			for (int i = 0; i < tem_data.length; i++)
			{
				ans.add(tem_data[i]);
			}
			int che = 0;
			for (int i = tem_data.length - 1; i > 0; i--)
			{
				for (int j = tem_data.length - 2; j >= 0; j--)
				{
					if (tem_data[i] > tem_data[j])
					{
						che = 1;
						char adder = ans.get(i);
						ans.remove(i);
						ans.add(j, adder);
						break;
					}
					if (che == 1)
						break;

				}
			}
//			System.out.println(ans);
			char[] tem_data1 = new char[tem_data.length];
			for (int i = 0; i < tem_data.length; i++)
			{
				tem_data1[i] = ans.get(i);
			}
			System.out.println(new String(tem_data1));
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

}
