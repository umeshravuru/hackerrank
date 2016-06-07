package hack;

import java.util.Scanner;

public class Mr_K_marsh_3
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int m =s.nextInt();
		String breaker= s.nextLine();
		int [][] data = new int [n][m];
		for(int i =0;i<n;i++)
		{
			String tem = s.nextLine();
			for(int j=0;j<m;j++)
			{
				if(tem.charAt(j)=='x')
					data[i][j]=-1;
			}
		}
		
		int [][] matrix_hor = new int [n+1][m+1];
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				if(data[i][j]==0)
				{
					matrix_hor[i+1][j+1]=matrix_hor[i+1][j]+1;
				}
			}
		}
		
		int [][] matrix_ver = new int [n+1][m+1];
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				if(data[i][j]==0)
				{
					matrix_ver[i+1][j+1]=matrix_ver[i][j+1]+1;
				}
			}
		}
		
		
		for (int i = 0; i < n+1; i++)
		{
			for (int j = 0; j < m+1; j++)
			{
				System.out.print(matrix_hor[i][j]+" ");
			}
			System.out.println("");
		}
System.out.println("" );
		for (int i = 0; i < n+1; i++)
		{
			for (int j = 0; j < m+1; j++)
			{
				System.out.print(matrix_ver[i][j]+" ");
			}
			System.out.println("");
		}
		
		

	}

}
