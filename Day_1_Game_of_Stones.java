package hack;

import java.util.Scanner;

public class Day_1_Game_of_Stones
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int data[] = new int[101];
		for (int i = 0; i < data.length; i++)
		{
			data[i] = i;
		}

		int ans[] = new int[101];
		ans[1] = 2;
		ans[2] = 1;
		ans[3] = 1;
		ans[4] = 1;
		ans[5] = 1;
//		ans[6] = 1;
//		ans[7] = 2;

		for (int i = 6; i <= 100; i++)
		{
			if (ans[i - 2] == 2 || ans[i - 3] == 2 || ans[i - 5] == 2)
				ans[i] = 1;
			else
				ans[i] = 2;
		}
		int t = s.nextInt();
		for (int i = 0; i < t; i++)
		{
			if (ans[s.nextInt()] == 1)
				System.out.println("First");
			else
				System.out.println("Second");
		}

	}

}
