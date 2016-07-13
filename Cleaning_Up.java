package Code_chef;

import java.util.Scanner;

public class Cleaning_Up
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n = s.nextInt();
			int m = s.nextInt();
			int data [] = new int [n];
			for(int i =0;i<m;i++)
			{
				data[s.nextInt()-1]=1;
			}
			
			int che =0;
			for(int i = 0;i<n;i++)
			{
				if(data[i]==0)
				{
					if(che==0)
					{
					System.out.print((i+1)+" ");
				data[i]=1;
				che=1;
					}
					else
						che=0;
				
				}
			}
			System.out.println(); 
		
			for(int i = 0;i<n;i++)
			{
				if(data[i]==0)
				{
				System.out.print((i+1)+" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
