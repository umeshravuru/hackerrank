package hack;

import java.util.Scanner;

public class pot
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans =0;
		for (int i = 0; i < n; i++)
		{
			int m = s.nextInt();
			int a = m/10;
			int b = m%10;
			ans = (int) (ans+Math.pow(a, b));
		}
		System.out.println(ans);
	}

}
