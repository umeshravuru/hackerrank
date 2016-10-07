/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Two_Characters
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String data = s.nextLine();

		char[] data_arr = data.toCharArray();
		int present = 0;
		char rem = 'A';
		while (present != data_arr.length)
		{
			present = data_arr.length;
			for (int i = 0; i < data_arr.length - 1; i++)
			{
				if (data_arr[i] == data_arr[i + 1])
				{
					rem = data_arr[i];
					break;
				}
			}
			data = "";
			for (int i = 0; i < data_arr.length; i++)
			{
				if (data_arr[i] != rem)
					data = data + String.valueOf(data_arr[i]);
			}
			System.out.println(data);
			data_arr = data.toCharArray();

		}
		System.out.println(data_arr.length);

	}

}
