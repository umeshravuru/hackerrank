	package hack;

import java.util.Scanner;

public class server
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int ans = 0;
		int[] data = new int[n];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
		}
int ans1=0;
		for (int i = 0; i < n; i++)

		{
				ans =ans+data[i];
				ans1++;
				if(ans>=m)
					break;
		}
		System.out.println(ans1-1);

	}

}
