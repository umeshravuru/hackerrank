/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Arrays;
import java.util.Scanner;

/**

 */
public class Small_Risk_Trading
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		double p[] = new double[n];
		double x[] = new double[n];
		double y[] = new double[n];
		double data[] = new double[n];
		for (int i = 0; i < n; i++)
		{
			p[i] = s.nextDouble();
		}
		for (int i = 0; i < n; i++)
		{
			x[i] = s.nextDouble();
		}
		for (int i = 0; i < n; i++)
		{
			y[i] = s.nextDouble();
			data[i] = p[i] * x[i] - ((double) 1 - p[i]) * y[i];
		}

		Arrays.sort(data);
		disp(data);
		double ans = 0;
		int tem = 0;
		for (int i = n - 1; i >= 0; i--)
		{
			if (data[i] > (double) 0)
			{
				if (tem < m)
					ans = ans + data[i];
				else
					break;
			} else
				break;
			tem++;
		}
		// System.out.println(ans);
		ans = (double) Math.round(ans * 100d) / 100d;
		String ans_tem = String.valueOf(ans);
		String ans_tem_arr[] = ans_tem.split("\\.");
		System.out.println(ans_tem_arr.length);
		if (ans_tem_arr[1].length() == 1)
			System.out.println(ans + "0");
		else
			System.out.println(ans);

	}
	public static void disp(double data[])
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
