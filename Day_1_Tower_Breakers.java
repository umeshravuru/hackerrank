package hack;

import java.util.Scanner;

public class Day_1_Tower_Breakers
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		for (int i = 0; i < t; i++)
		{
			int n = s.nextInt();
			int m = s.nextInt();
			if (n % 2 == 0)
				System.out.println("2");
			else
				System.out.println("1");
		}

	}

}
