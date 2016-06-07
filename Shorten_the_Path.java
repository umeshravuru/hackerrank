package hack;

import java.util.Scanner;

public class Shorten_the_Path
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		int x = 0;
		int y = 0;
		for (int i = 0; i < data.length(); i++)
		{
			if (data.charAt(i) == 'N')
				y++;
			if (data.charAt(i) == 'S')
				y--;
			if (data.charAt(i) == 'E')
				x++;
			if (data.charAt(i) == 'W')
				x--;
		}

		String ans = "";
		if (x > 0)
		{
			for (int i = 0; i < x; i++)
			{
				ans = ans + 'E';
			}
		}
		
		if (y > 0)
		{
			for (int i = 0; i < y; i++)
			{
				ans = ans + 'N';
			}
		}
		if (y < 0)
		{
			for (int i = 0; i < -y; i++)
			{
				ans = ans + 'S';
			}
		}
		if (x < 0)
		{
			for (int i = 0; i < -x; i++)
			{
				ans = ans + 'W';
			}
		}

		System.out.println(ans);

	}

}
