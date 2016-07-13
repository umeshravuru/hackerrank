package Hackerrank;

import java.util.Scanner;

public class The_Bomberman_Game
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		
		String data0 = s.nextLine();
		String data1[]= data0.split(" ");
		
		int n = Integer.parseInt(data1[0]);
		int m = Integer.parseInt(data1[1]);
		
		
		int data [][ ] = new int [n+2][m+2];
		int data2 [][ ] = new int [n+2][m+2];
		for(int i =0;i<n;i++)
		{
			String tem =  s.nextLine();
			for(int j =0;j<m;j++)
			{
				if(tem.charAt(j)=='O')
				{
//					System.out.println("g");
					data[i+1][j+1]=0;
					data2[i+1][j+1]=1;
					data2[i+1][j+2]=1;
					data2[i+2][j+1]=1;
					data2[i][j+1]=1;
					data2[i+1][j]=1;
				}
				if(tem.charAt(j)=='.')
				{
//					System.out.println("g");
					data[i+1][j+1]=1;
				}
			}

		}
		
		
		
		int p = Integer.parseInt(s.nextLine());
		
		if(p%2==0)
		{
//			System.err.println("2");
			for(int i =0;i<n;i++)
			{
				for(int j =0;j<m;j++)
				{
					System.out.print("O");
				}
				System.out.println();
			}
			
		}
		else if(p%4==1)
		{
//			System.out.println("41");
			for(int i =0;i<n;i++)
			{
				for(int j =0;j<m;j++)
				{
					if(data[i+1][j+1]==0)
						System.out.print("O");
					else
						System.out.print(".");
				}
				System.out.println();
			}
		}
		else if(p%4==3)
		{
//			System.out.println("43");
			for(int i =0;i<n;i++)
			{
				for(int j =0;j<m;j++)
				{
					if(data2[i+1][j+1]==0)
						System.out.print("O");
						else
							System.out.print(".");
				}
				System.out.println();
			}	
		}
		
		
	}

}
