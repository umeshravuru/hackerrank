package hack;

import java.util.Scanner;

public class Bear_and_Finding_Criminals_1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt() - 1;
		int data[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
		}

		int x = m;
		int y = m;

		int ans = 0;

		while (x >= 0 && y < n)
		{
			if (x == y)
			{
				if (data[x] == 1)
				{
					ans++;
				}
				x--;
				y++;
			} else
			{
				
			}
		}
	}

}
