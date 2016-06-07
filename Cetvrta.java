package hack;

import java.util.Scanner;

public class Cetvrta
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int data[][] = new int[3][2];
		for (int i = 0; i < 3; i++)
		{
			data[i][0] = s.nextInt();
			data[i][1] = s.nextInt();
		}
		int x = 0;
		int y = 0;

		if (data[0][0] == data[1][0])
			x = data[2][0];
		else if (data[0][0] == data[2][0])
			x = data[1][0];
		else
			x = data[0][0];

		if (data[0][1] == data[1][1])
			y = data[2][1];
		else if (data[0][1] == data[2][1])
			y = data[1][1];
		else
			y = data[0][1];

		
		System.out.println(x+" "+y);
	}

}
