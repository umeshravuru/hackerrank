package hack;

import java.util.Scanner;

public class Chef_And_Coloring
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < t; ii++)
		{
			int k = Integer.parseInt(s.nextLine());
			String data = s.nextLine();
			int []freq = new int [3];
			for (int i = 0; i < k; i++)
			{
				if(data.charAt(i)=='R')
					freq[0]++;
				else if(data.charAt(i)=='G')
					freq[1]++;
				else
					freq[2]++;
			}
			
			int ans1 =0;
			int ans2 =0;
			int ans3 =0;
			
			ans1 = freq[1]+freq[2];
			ans2 = freq[0]+freq[2];
			ans3 = freq[0]+freq[1];
			
			System.out.println(Math.min(ans1, Math.min(ans2, ans3)));
			
			

		}

	}

}
