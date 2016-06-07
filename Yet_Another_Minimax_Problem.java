package hack;

import java.util.Scanner;

public class Yet_Another_Minimax_Problem
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data [] = new int [n];
		int max =-1;
		for(int i=0;i<n;i++)
		{
			data[i]=s.nextInt();
			if(data[i]>max)
				max = data[i];
		}
		
		long ans = max^data[0];
		for(int i =1;i<n;i++)
		{
			if((max^data[i])<ans && (max^data[i])!=0)
				ans = max^data[i];
		}
		
		System.out.println(ans);
	}

}
