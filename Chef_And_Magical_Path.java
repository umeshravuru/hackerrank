package hack;

import java.util.Scanner;

public class Chef_And_Magical_Path
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++)
		{
			long n = s.nextLong();
			long m = s.nextLong();

			long max = Math.max(n, m);
			long min = Math.min(n, m);

			if (min == 1 && max != 2)
				System.out.println("No");
			else
			{
				if (max % 2 == 0 || min%2==0)
					System.out.println("Yes");
				else
					System.out.println("No");
			}

		}

	}

}
