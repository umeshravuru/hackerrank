package hack;

import java.util.Scanner;

public class Tanya_ans_lassy
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++)
		{
			int m = s.nextInt();
			int[][] data = new int[m + 2][m + 1];

			for (int i = 0; i < m; i++)
			{
				data[1][i + 1] = s.nextInt();
				data[0][i + 1] = i + 1;
			}

			for (int i = 1; i <= m; i++)
			{
				data[i + 1][0] = i;
				data[i+1][1]=data[1][1]*data[i+1][0];
			}

			for (int i = 2; i < m+2; i++)
			{
				for (int j = 2; j < m+1; j++)
				{
					int temp =0;
					if(data[0][j]>data[i][0])
					{
						temp=0;
					}
					else if(data[0][j]==data[i][0])
					{
						temp = data[1][j];
					}
					else
					{
						if(data[i][0]%data[0][j]!=0)
						temp = ((data[i][0]/data[0][j])*data[1][j])+data[(data[i][0]%data[0][j])+1][m];
						else
							temp =((data[i][0]/data[0][j])*data[1][j]);
					}
					
//						System.out.println(temp);
							
					data[i][j]=Math.max(data[i][j-1], temp);
				}
			}
			
			
			for (int i = 0; i < m+2; i++)
			{
				for (int j = 0; j < m+1; j++)
				{
					System.out.print(data[i][j]+" ");
					
				}
				
				System.out.println("");
			}

		}

	}

}
