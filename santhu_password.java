package hack;

import java.util.Scanner;

public class santhu_password
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i=1000;i<=9999;i++)
		{
			
			
		}
		
		
		
		
		
	}

	
	public static int [ ] dec(int data[])
	{
		
		
		for(int i =0;i<data.length;i++)
		{
			for(int j =0;j<data.length-1;j++)
			{
				if(data[j]<data[j+1])
				{
					int tem  = data[j];
					data[j]= data[j+1];
					data[j+1] = tem;
				}

			}
		}
		
		return data;
	}
	
	
	public static int [ ] inc(int data[])
	{
		
		
		for(int i =0;i<data.length;i++)
		{
			for(int j =0;j<data.length-1;j++)
			{
				if(data[j]>data[j+1])
				{
					int tem  = data[j];
					data[j]= data[j+1];
					data[j+1] = tem;
				}

			}
		}
		
		return data;
	}
	
 	
}
