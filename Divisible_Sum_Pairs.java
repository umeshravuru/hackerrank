package hack;

import java.util.Scanner;

public class Divisible_Sum_Pairs
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int  n = s.nextInt();
		int  m = s.nextInt();
		int[] data = new int [n];
		for(int i =0;i<n;i++)
		{
			data[i]=s.nextInt();
		}
		int final_ans = 0;
		for(int i =0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((data[i]+data[j])%m==0)
					final_ans++;
			}
		}
		
		System.out.println(final_ans);
		
	}

}
