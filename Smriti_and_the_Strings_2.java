package beer_night;

import java.util.ArrayList;
import java.util.Scanner;

public class Smriti_and_the_Strings_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < t; ii++)
		{
			String tem = s.nextLine();
			String temm[] = tem.split(" ");
			String data = temm[0];
			int n = Integer.parseInt(temm[1]);
			ArrayList<Character> char_array = new ArrayList<Character>();
			for (int i = 0; i < data.length(); i++)
			{
				char_array.add(data.charAt(i));
			}
			int sizee = 0;
			for (int i = 0; i < char_array.size() - 1; i++)
			{
				if (char_array.get(i) < char_array.get(i + 1) && n > 0)
				{
					char_array.remove(i);
					n--;
					i = i - 2;
					if (i < -1)
						i = -1;
					if(n==0)
					 break;
				}
			}

			for (int i = 0; i < char_array.size()-n; i++)
			{
				System.out.print(char_array.get(i) + "");
			}
			System.out.println();
			// System.out.println(char_array);
			// System.out.println(n);

		}

	}

}
