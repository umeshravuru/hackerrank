package hack;

import java.util.Scanner;

public class Project_Euler_14_Longest_Collatz_sequence_3
{

	public static void main(String[] args)
	{
		int n =51;
		int ans=0;
		System.out.print(n+" - "); 
		
		while(n!=1)
		{	
			if(n%2==0)
				n=n/2;
			else
				n=3*n+1;
			System.out.print(n+" - ");
				ans++;
		}
		ans++;
		System.out.println(" ");
		System.out.println(ans);
		
	}

}
