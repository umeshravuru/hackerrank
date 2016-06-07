package hack;

import java.util.Scanner;

public class Mr_K_marsh
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
		
		int ans=0;
//		int [][] matrix = new int [n][m];
		for(int i =1;i<n;i++)
		{
			for(int j =1;j<m;j++)
			{
				int temp_max=0;
				if(data[i][j]!=-1)
				{
				int temp1 =0;
				int temp2 =0;
				//System.out.println(i+" "+j);
				for(int ii =i-1;ii>=0;ii--)
				{
					if(data[ii][j]!=-1)
						temp1++;
					else
						break;
				}
				for(int jj =j-1;jj>=0;jj--)
				{
					if(data[i][jj]!=-1)
						temp2++;
					else
						break;
				}
				if(temp1!=0 && temp2!=0)
					data[i][j]=2*(temp1+temp2);
				
				if(data[i][j]>ans)
				{
					ans=data[i][j];
				}
//				if(data[i][])
				}

				
				
				for(int i1 =0;i1<n;i1++)
				{
					for(int j1=0;j1<m;j1++)
					{
						System.out.print(data[i1][j1]+" ");
					}
					System.out.println(" ");
				}
				System.out.println("--------------------------");
				
				
				
				
			}
		}
		if(ans!=0)
		System.out.println(ans);
		else
			System.out.println("impossible");
//		for(int i =0;i<n;i++)
//		{
//			for(int j=0;j<m;j++)
//			{
//				System.out.print(data[i][j]);
//			}
//			System.out.println(" ");
//		}

	}

}
