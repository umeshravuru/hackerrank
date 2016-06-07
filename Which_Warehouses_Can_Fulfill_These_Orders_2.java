package hack;

import java.util.Scanner;

public class Which_Warehouses_Can_Fulfill_These_Orders_2
{

	public static void main(String[] args)
	{
		Scanner s =  new Scanner(System.in);
		int w = s.nextInt();
		int b = s.nextInt();
		int p = s.nextInt();
		int data [][] = new int [w][p];
		for(int i =0;i<w;i++)
		{
			for(int j =0;j<p;j++)
			{
				data[i][j]= s.nextInt();
			}
		}
		
		for(int ii =0;ii<b;ii++)
		{
			int query [] = new  int [p];
			for(int jj=0;jj<p;jj++)
			{
				query[jj]=s.nextInt();
			}
			
		
			
		}
		
		
	}

}
