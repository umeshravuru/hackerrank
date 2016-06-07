package hack;

import java.util.Scanner;

public class Mr_K_marsh_2
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
		
		int [][] matrix = new int [n][m];
		
		for(int i =1;i<n;i++)
		{
			for(int j =1;j<m;j++)
			{
				if(data[i][j]!=-1)
				{
				if(data[i-1][j]==-1 || data[i][j-1]==-1 || data[i-1][j-1]==-1)
				{
					matrix[i][j]=Math.max(matrix[i-1][j], matrix[i][j-1]);	
				
				}
				else
				{	
					
					matrix[i][j]=Math.max(matrix[i-1][j], matrix[i][j-1])+2;
					if(matrix[i][j]==2)
						matrix[i][j]=matrix[i][j]+2;
				}
				}
				else
				{
					matrix[i][j]=Math.max(matrix[i-1][j], matrix[i][j-1]);
				}
				
				for(int i1 =0;i1<n;i1++)
				{
					for(int j1=0;j1<m;j1++)
					{
						System.out.print(matrix[i1][j1]+" ");
					}
					System.out.println(" ");
				}
				System.out.println("--------------------------");
				
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		for(int i1 =0;i1<n;i1++)
		{
			for(int j1=0;j1<m;j1++)
			{
				System.out.print(matrix[i1][j1]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("--------------------------");
		
		
		
		

	}

}
