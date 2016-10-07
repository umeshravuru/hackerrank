/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class Two_Characters_1
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
		Map<Character, Integer> freq = new HashMap<>();
		for (int i = 0; i < data.length(); i++)
		{
			freq.put(data.charAt(i), 1);
		}
		int max =0;
		for (char key1 : freq.keySet())
		{
			for (char key2 : freq.keySet())
			{
				if(key1 != key2)
				{
					String tem ="";
					for(int i =0;i<data.length();i++)
					{
						if(data.charAt(i)==key1 || data.charAt(i)== key2)
						tem = tem + data.charAt(i);
					}
					if(valid(tem))
					{
						if(tem.length()>max)
							max  = tem.length();
					}
				}
			}
		}
		System.out.println(max);

	}
	public static boolean valid(String data)
	{
		for (int i = 0; i < data.length() - 1; i++)
		{
			if (data.charAt(i) == data.charAt(i + 1))
				return false;
		}
		return true;
	}

}
