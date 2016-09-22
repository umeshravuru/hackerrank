/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class spliting_string_brackets
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

		int left = 0;
		int right = data.length - 1;
		int left_count = 0;
		int right_count = 0;
		while (left < right)
		{
			System.out.println(left+" "+right+" "+ left_count+" "+right_count);
			if (left_count == right_count)
			{
				if (data[left] == '(')
				{
					left_count++;
					left++;
				}
				else
					left++;

			}
			else if(left_count<right_count)
			{
				if (data[left] == '(')
				{
					left_count++;
					left++;
				}
				else
					left++;
			}
			else if(left_count>right_count)
			{
				if (data[right] == ')')
				{
					right_count++;
					right--;
				}
				else
					right--;
			}
		}

		return right;
	}

}
