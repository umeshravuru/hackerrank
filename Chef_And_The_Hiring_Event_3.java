package hack;

import java.util.Scanner;

public class Chef_And_The_Hiring_Event_3
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();
		for (long i = 0; i < t; i++)
		{
			long n = s.nextLong();
			long main_1 = n;
			long len = 0;
			for (long j = 0; j < 100; j++)
			{
				if (Math.pow(5, j) < n && Math.pow(5, j + 1) >= n)
				{
					len = j + 1;
					break;
				}
			}
			// System.out.prlongln(len);
			String ans = "";

			n = (long) (n - Math.pow(5, len - 1));
			// System.out.prlongln(n);
			long tem1 = 2;
			while (n > 0)
			{
//				System.out.println(n);
				if (Math.pow(5, len - 1) < n)
				{
					n = (long) (n - Math.pow(5, len - 1));
					tem1 = tem1 + 2;
					if (tem1 == 8)
					{
						break;
					}
				} else
					break;
			}
			ans = ans + String.valueOf(tem1);
			len--;
			long tem2 = 0;
			while (n > 0)
			{
//				System.out.println(n);

				if (Math.pow(5, len - 1) < n)
				{

					n = (long) (n - Math.pow(5, len - 1));
					tem2 = tem2 + 2;
					if (tem2 == 8)
					{
						len--;
						ans = ans + String.valueOf(tem2);
						tem2 = 0;
					}
				} else
				{
					len--;
					ans = ans + String.valueOf(tem2);
					tem2 = 0;
					// System.out.prlongln(n);
				}
			}
			if (main_1 == 1)
				System.out.println("0");
			else
				System.out.println(ans);

		}

	}

}
