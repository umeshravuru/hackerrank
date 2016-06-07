package hack;

import java.util.Scanner;

public class Which_Warehouses_Can_Fulfill_These_Orders
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
			int min =20;
			for(int i =1;i<Math.pow(2, w);i++)
			{
				String binary_string = Integer.toBinaryString(i);
				binary_string = make_full(binary_string,w);
				System.out.println(binary_string);
				int che =0;
				for(int j = 0;j<p;j++)
				{
					int tem =0;
					for(int k =0;k<binary_string.length();k++)
					{
						if(binary_string.charAt(k)=='1')
							tem = tem  + data[k][j];
					}
					if(tem < query[j])
					{
						che=1;
						break;
					}
				}
				if(che==0)
				{
					int ans_tem =0;
					for(int j = 0;j<binary_string.length();j++)
					{
						if(binary_string.charAt(j)=='1')
							ans_tem++;
					}
					if(min<ans_tem)
						min = ans_tem;
					
				}
			}
			
			
			System.out.println(min);
			
			
		}
		
		
		
	}
	
	public static String make_full(String data,int n )
	{
		for(int i =1;i<=n-data.length();i++)
		{
			data= "0"+data;
		}
		
		
		
		return data;
	}


}
