package hack;

import java.util.Scanner;

public class Sum_of_first_n_numbers
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s .nextInt(); 
				
		long ans =0;
		for(int i =1;i<=n;i++)
		{
			ans=ans+i;
			System.out.println(i+" - "+ans);
		}
		
	}

}
