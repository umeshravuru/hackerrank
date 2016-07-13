package Code_chef;

import java.util.Scanner;

public class Point_left_or_right_of_ray ///// input is 1st point is starting of
										///// a ray
										///// second point is end point of ray
										//// 3rd point is point to find left or
										///// right
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		double data[][] = new double[3][2];
		for (int i = 0; i < 3; i++)
		{
			data[i][0] = s.nextDouble();
			data[i][1] = s.nextDouble();
		}
		System.out.println(isPointLeftOfRay(data[2][0], data[2][1], data[0][0],
				data[0][1], data[1][0], data[1][1]));
		

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

		if (r >= r1 || rayEx * x + rayEy * y<=0)
		{
			if (rayEx * y > rayEy * x)
				return -1; /// left
			if (rayEx * y < rayEy * x)
				return 1; /// right
		}

		return 0;
	}
}
