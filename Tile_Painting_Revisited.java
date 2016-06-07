package beer_night;

import java.util.Scanner;

public class Tile_Painting_Revisited
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++)
		{
			long n = s.nextLong();
//			long ans = mod(mod(n) + mod((n * (n - 1)) / 2));
			long ans = mod(n);
			for (long j = 2; j <=n; j++)
			{
				long tem = j - 1;
				while (n - tem > 0)
				{
					ans = mod(ans + mod(n - tem));
					tem = tem +(j-1);
				}
			}
			
			System.out.println(mod(ans));
		}

	}

	public static long mod(long n)
	{

		return (long) (n % (Math.pow(10, 9) + 7));
	}

}
