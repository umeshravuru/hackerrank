package beer_night;

import java.util.ArrayList;
import java.util.Scanner;

public class All_permutaions_of_a_string_in_inc_order
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();

		char[] data = data1.toCharArray();

		permute(data, 0, data.length - 1);

	}

	public static void permute(char[] data, int x, int y)
	{
		
		if (x == y)
		{
			String tem = new String(data);
			System.out.print(tem+",");
		} else
		{
			for (int i = x; i <= y; i++)
			{
				char tem = data[i];
				data[i] = data[x];
				data[x] = tem;
				permute(data, x + 1, y);
				tem = data[i];
				data[i] = data[x];
				data[x] = tem;
			}
		}

	}
	

}
