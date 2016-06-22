package hack;

import java.util.Scanner;

public class Points_On_a_Line
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

			int num =  (data[1][1] - data[0][1])/gcd_Cal( (data[1][1] - data[0][1]),  (data[1][0] - data[0][0]));
			int den =  (data[1][0] - data[0][0])/gcd_Cal( (data[1][1] - data[0][1]),  (data[1][0] - data[0][0]));
			
			int che = 0;
			for (int i = 2; i < n; i++)
			{
				int num1 =  (data[i][1] - data[0][1])/gcd_Cal( (data[i][1] - data[0][1]),  (data[i][0] - data[0][0]));
				int den1 =  (data[i][0] - data[0][0])/gcd_Cal( (data[i][1] - data[0][1]),  (data[i][0] - data[0][0]));	

				if (num != num1 || den !=den1)
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
	public static int gcd_Cal(int a,int b)
	{
		if(b==0)
			return a;
		else
			return gcd_Cal(b, a%b);
		
	}

}
