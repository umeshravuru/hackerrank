package hack;

import java.util.Scanner;

public class Project_Euler_11_Largest_product_in_a_grid
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int [][] data = new int [20][20];
		for(int i =0;i<20;i++)
		{
			for(int j =0;j<20;j++)
			{
				data[i][j]=s.nextInt();
			}
		
		}
		long ans=0;
		for(int i =0;i<20;i++)
		{
			for(int j =0;j<17;j++)
			{
					if(data[i][j]*data[i][j+1]*data[i][j+2]*data[i][j+3]>ans)
					{
						ans=data[i][j]*data[i][j+1]*data[i][j+2]*data[i][j+3];
					}
				
			}
		
		}
		
		for(int i =0;i<17;i++)
		{
			for(int j =0;j<20;j++)
			{
					if(data[i][j]*data[i+1][j]*data[i+2][j]*data[i+3][j]>ans)
					{
						ans=data[i][j]*data[i+1][j]*data[i+2][j]*data[i+3][j];
					}
			}
		}
		
		for(int i =0;i<17;i++)
		{
			for(int j =0;j<17;j++)
			{
					if(data[i][j]*data[i+1][j+1]*data[i+2][j+2]*data[i+3][j+3]>ans)
					{
						ans=data[i][j]*data[i+1][j+1]*data[i+2][j+2]*data[i+3][j+3];
					}
			}
		}
		for(int i =0;i<17;i++)
		{
			for(int j =3;j<20;j++)
			{
					if(data[i][j]*data[i+1][j-1]*data[i+2][j-2]*data[i+3][j-3]>ans)
					{
						ans=data[i][j]*data[i+1][j-1]*data[i+2][j-2]*data[i+3][j-3];
					}
			}
		}
		
		System.out.println(ans);
	}

}
