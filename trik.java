package hack;

import java.util.Scanner;

public class trik
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int ans = 1;
		String data = s.nextLine();
		for (int i = 0; i < data.length(); i++)
		{
			if (data.charAt(i) == 'A')
			{
				if (ans == 1)
					ans = 2;
				else if (ans == 2)
					ans = 1;
			}

			if (data.charAt(i) == 'B')
			{
				if (ans == 2)
					ans = 3;
				else if (ans == 3)
					ans = 2;
			}

			if (data.charAt(i) == 'C')
			{
				if (ans == 1)
					ans = 3;
				else if (ans == 3)
					ans = 1;
			}

		}
		System.out.println(ans);
		

	}

}
