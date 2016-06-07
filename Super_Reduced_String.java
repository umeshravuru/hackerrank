package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Super_Reduced_String
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		String data1 = s.nextLine();
		ArrayList<Character> data = new ArrayList<Character>();
		for (int i = 0; i < data1.length(); i++)
		{
			data.add(data1.charAt(i));
		}
		int len2 = 0;
		while (data.size() != len2)
		{

			len2 = data.size();
			for (int i = 0; i < data.size() - 1; i++)
			{
				if (data.get(i) == data.get(i + 1))
				{
					data.remove(i + 1);
					data.remove(i);
				}
			}

		}
		data1 = "";
		for (int i = 0; i < data.size(); i++)
		{
			data1 = data1 + data.get(i);
		}
		if (data1.length() == 0)
			System.out.println("Empty String");
		else
			System.out.println(data1);

	}

}
