package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Better_Maximal_Sum
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n =s.nextInt();
			int data [] = new int [n];
			for(int i=0;i<n;i++)
			{
				data[i]=s.nextInt();
			}
			int total_max =data[0];
			int tem_sum =data[0];
			
			for(int i =1;i<n;i++)
			{
				if(data[i]+tem_sum>=0)
				{
					tem_sum=tem_sum+data[i];
					if(tem_sum>total_max)
						total_max=tem_sum;
				}
				else
				{
					tem_sum=0;
				}
			}
			
			
			
			
			
		}
		
		
	}

}
