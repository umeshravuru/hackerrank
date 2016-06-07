package hack;

import java.util.Scanner;

public class Minimal_Wrapping_Surface_Area
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long a = s.nextLong();
		long b = s.nextLong();
		long c = s.nextLong();

		long min = 2 * n * (a*b + b*c + c*a);
		for (long i1 = 1; i1 <= n; i1++)
		{
			for (long i2 = 1; i2 <= n; i2++)
			{
				for (long i3 = 1; i3 <= n; i3++)
				{
					System.out.println(i1+" "+i2+" "+i3 );
					if (i1 * i2 * i3 >= n)
					{
						if (min > 2 * (i1 * a * i2 * b + i2 * b * i3 * c
								+ i3 * c * i1 * a))
						{
							min = 2  * (i1 * a * i2 * b + i2 * b * i3 * c
									+ i3 * c * i1 * a);
//							System.out.print(i1 + " " + i2 + " " + i3);
						}
					}
				}
			}
		}

		System.out.println(min);

	}

}
