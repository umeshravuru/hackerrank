package hack;

import java.util.Arrays;
import java.util.Scanner;

public class armystrengtheasy
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());

		for (int i = 0; i < t; i++)
		{
			String breakk = s.nextLine();
			String data1 = s.nextLine();
			String[] data = data1.split(" ");
			int n = Integer.parseInt(data[0]);
			int m = Integer.parseInt(data[1]);

			data1 = s.nextLine();
			String[] data2 = data1.split(" ");
			int[] G = new int[n];
			for (int j = 0; j < n; j++)
			{
				G[j] = Integer.parseInt(data2[j]);
			}
			data1 = s.nextLine();
			String[] data3 = data1.split(" ");
			int[] M = new int[m];
			Arrays.sort(G);
			Arrays.sort(M);
			for (int j = 0; j < m; j++)
			{
				M[j] = Integer.parseInt(data3[j]);
			}
			
			int nn=n;
			int mm=m;
			
			while (n > 0 && m > 0)
			{
				if(G[nn-n]>=M[mm-m])
				{
					m--;
				}
				else
					n--;
			}
			
			if(n==0)
				System.out.println("MechaGodzilla");
			else
				System.out.println("Godzilla");

		}

	}

}
