package hack;

import java.util.Scanner;

public class Points_On_a_Line_1
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int data[][] = new int[n][2];
		for (int i = 0; i < n; i++)
		{
			data[i][0] = s.nextInt();
			data[i][1] = s.nextInt();
		}
		if (data[1][0] == data[0][0])
		{
			int che = 0;
			for (int i = 2; i < n; i++)
			{
				if (data[i][0] != data[0][0])
				{
					che = 1;
					break;
				}
			}
			if (che == 1)
				System.out.println("NO");
			else
				System.out.println("YES");

		} else
			
		{
			int che = 0;
			for (int i = 1; i < n; i++)
			{
				if (data[i][1] != data[0][1])
				{
					che = 1;
					break;
				}
			}
			if (che == 1)
				System.out.println("NO");
			else
				System.out.println("YES");
		
		}
		
		
		
		
		
		
	}

}
