package beer_night;

import java.util.Scanner;

public class Tile_Painting_Revisited_1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++)
		{
			long n = s.nextLong();

			long ans = mod(n);
			for (long j = 2; j <= n; j++)
			{

				long tem = 0;
				if ((j - 1) % 2 == 0)
				{

					tem = ((n * n) / (j - 1));
					tem = tem
							- ((((n ) / (j - 1)) * (((n ) / (j - 1)) + 1))
									/ 2) * (j - 1);

				} else
				{
					tem = ((n * (n-1)) / (j - 1));
					tem = tem
							- ((((n - 1) / (j - 1)) * (((n - 1) / (j - 1)) + 1))
									/ 2) * (j - 1);
					// tem = ((n*(n-1))/(j-1))-
					// (j-1)*(((n-1)/(j-1))*(((n-1)/(j-1))+1)/2);
				}

				ans = ans + mod(tem);
			}

			System.out.println(mod(ans));
		}

	}

	public static long mod(long n)
	{

		return (long) (n % (Math.pow(10, 9) + 7));
	}

}
