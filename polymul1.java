package hack;

import java.util.Scanner;

public class polymul1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int ii = 0; ii < t; ii++)
		{
			int m = s.nextInt();
			int[] data1 = new int[m+1];
			for (int i = 0; i <= m; i++)
			{
				data1[i] = s.nextInt();
			}
			int n = s.nextInt();
			int[] data2 = new int[n+1];
			for (int i = 0; i <=n; i++)
			{
				data2[i] = s.nextInt();
			}
			int[] ans = new int[n + m+2];
			System.out.println(m+n);
			for (int i = 0; i <=m + n; i++)
			{

				for (int j = Math.max(0, i-n); j <=Math.min(i, m); j++)
				{
						ans[i] = ans[i] + (data1[j] * data2[i - j]);
				}

				System.out.print(ans[i] + " ");

			}

			System.out.println("");
//			System.out.println("/////////////"+m+" "+n);

		}

	}

}
