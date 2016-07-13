package Hackerrank;

import java.util.Scanner;

public class Jumping_on_the_Clouds_Revisited
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int data [] = new int [n];
		int che=0;
		int i =0;
		long ans =100;
		for(int j =0;j<n;j++)
		{
			data[j]= s.nextInt();
		}
		i = (i+k)%n;
		while(i !=0)
		{
//			System.err.println(i+" "+ans);
			if(data[i]==1)
				ans= ans-3;
			else
				ans--;
			
			i = (i+k)%n;
		}
		if(data[i]==1)
			ans= ans-3;
		else
			ans--;
		System.out.println(ans);
		
	}

}
