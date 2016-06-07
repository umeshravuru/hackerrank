package hack;

import java.util.Scanner;

public class Maximum_Perimeter_Triangle
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
		}
		long max = -1;
		int a = -1;
		int b = -1;
		int c = -1;
		for (int i1 = 0; i1 < n - 2; i1++)
		{
			for (int i2 = i1 + 1; i2 < n - 1; i2++)
			{
				for (int i3 = i2 + 1; i3 < n; i3++)
				{
					if (data[i1] + data[i2] > data[i3]
							&& data[i1] + data[i3] > data[i2]
							&& data[i3] + data[i2] > data[i1])
					{
						if (data[i1] + data[i2] + data[i3] > max)
						{
							max = data[i1] + data[i2] + data[i3];
							a = data[i1];
							b = data[i2];
							c = data[i3];
						}
					}
				}
			}

		}
		if (max == -1)
			System.out.println("-1");
		else
		{
			
			System.out.print(Math.min(a, Math.min(c, b))+" ");
			System.out.print(a+b+c-Math.max(a, Math.max(b, c))-Math.min(a, Math.min(b, c))+" ");
			System.out.println(Math.max(a, Math.max(b, c)));
		}

	}

}
