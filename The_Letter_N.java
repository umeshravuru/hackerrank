package Code_chef;

import java.util.Scanner;

public class The_Letter_N
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

		long final_ans = 0;
		for (int i1 = 0; i1 < n; i1++)
		{
			for (int i2 = 0; i2 < n; i2++)
			{
				if (i1 != i2)
				{

					for (int i3 = 0; i3 < n; i3++)
					{
						if (i3 != i2 && i3 != i2)
						{
							int tem[][] = new int[3][2];
							tem[0][0] = data[i1][0];
							tem[0][1] = data[i1][1];
							tem[1][0] = data[i2][0];
							tem[1][1] = data[i2][1];
							tem[2][0] = data[i3][0];
							tem[2][1] = data[i3][1];
							if (isPointLeftOfRay(tem[2][0], tem[2][1],
									tem[0][0], tem[0][1], tem[1][0],
									tem[1][1]) == -1)
							{
								for (int i4 = 0; i4 < n; i4++)
								{
									if (i4 != i3 && i4 != i3 && i4 != i2)
									{
										int tem1[][] = new int[3][2];
										tem1[0][0] = data[i2][0];
										tem1[0][1] = data[i2][1];
										tem1[1][0] = data[i3][0];
										tem1[1][1] = data[i3][1];
										tem1[2][0] = data[i4][0];
										tem1[2][1] = data[i4][1];

										if (isPointLeftOfRay(tem1[2][0],
												tem1[2][1], tem1[0][0],
												tem1[0][1], tem1[1][0],
												tem1[1][1]) == 1)
											final_ans++;

									}
								}
							}

						}
					}

				}
			}
		}
		System.out.println(final_ans / 2);

	}
	public static int isPointLeftOfRay(double x, double y, double raySx,
			double raySy, double rayEx, double rayEy)
	{
		x = x - raySx;
		y = y - raySy;
		rayEx = rayEx - raySx;
		rayEy = rayEy - raySy;
		raySx = 0;
		raySy = 0;
		double r = (rayEx * rayEx + rayEy * rayEy);
		double r1 = (rayEx * x + rayEy * y);

		if (r >= r1 || rayEx * x + rayEy * y<0)
		{
			if (rayEx * y > rayEy * x)
				return -1; /// left
			if (rayEx * y < rayEy * x)
				return 1; /// right
		}

		return 0;
	}

}
