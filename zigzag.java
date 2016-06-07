package hack;

import java.util.Scanner;

public class zigzag
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int length = (n / 25) + 2;
		char[] ans = new char[length];
		// System.out.println(ans.length);
		int excess = n % 25;
		ans[0] = 'a';
		for (int i = 1; i < length - 1; i++)
		{
			if (ans[i - 1] == 'a')
				ans[i] = 'z';
			else
				ans[i] = 'a';
		}

		if (ans[length - 2] == 'a')
		{
			ans[length - 1] = (char) (excess + 97);
		} else
		{
			ans[length - 1] = (char) (25 - excess + 97);
		}
//		prin(ans);
//		System.out.println();
		int tem = (int) ans[length - 1] - 96;
		if (length % 2 == 1 && length > 2)
		{
			
			if (tem % 2 == 0)
			{
				tem = (tem - 2) / 2;
			} else
			{
				tem = (tem - 1) / 2;
			}
		} else if (length % 2 == 0 && length > 2)
		{
			
			if (tem % 2 == 0)
			{
				tem = (26-tem ) / 2;
			} else
			{
				tem = (25-tem ) / 2;
			}
		}

		if (ans[1] == 'z')
		{
			ans[1] = (char) ((int) ans[1] - tem);
		} else if (ans[1] == 'a')
		{
			ans[1] = (char) ((int) ans[1] + tem);
		}
		if (length % 2 == 0 && length > 2)
		{
			ans[length - 1] = (char) ((int) ans[length - 1] + (2 * tem));
		} else if (length % 2 == 1 && length > 2)
		{
			ans[length - 1] = (char) ((int) ans[length - 1] - (2 * tem));
		}

		prin(ans);
	}

	public static void prin(char[] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + "");
		}
	}
}
