package Hackerrank;

import java.util.Scanner;

public class Luck_Balance
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int data1[] = new int[n];
		int data2[] = new int[n];
		int total_luck = 0;
		int number_of_1 = 0;
		for (int i = 0; i < n; i++)
		{
			data1[i] = s.nextInt();
			data2[i] = s.nextInt();
			total_luck = total_luck + data1[i];
			if (data2[i] == 1)
				number_of_1++;
		}

		if (number_of_1 > k)
		{
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n - 1; j++)
				{
					if (data2[j] < data2[j+1] )
					{
						data2[j]=1;
						data2[j+1]=0;
						
						int tem = data1[j];
						data1[j]= data1[j+1];
						data1[j+1]= tem;
					}
//					else if(data1[j]<data1[j+1])
//					{
//						int tem = data1[j];
//						data1[j]= data1[j+1];
//						data1[j+1]= tem;
//						
//						tem = data2[j];
//						data2[j]= data2[j+1];
//						data2[j+1]= tem;
//						
//					}
				}
			}
			
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n - 1; j++)
				{
					if(data2[j]==1 && data2[j+1]==1)
					{
						if(data1[j]<data1[j+1])
							{
								int tem = data1[j];
								data1[j]= data1[j+1];
								data1[j+1]= tem;
								
								tem = data2[j];
								data2[j]= data2[j+1];
								data2[j+1]= tem;
								
							}
					}
				}
			}
			
			for(int i =k;i<=k;i++)
			{
//				System.out.println(data1[i]);
				total_luck = total_luck - 2*data1[i];
			}
			System.out.println(total_luck);
			
			
			for (int i = 0; i < n; i++)
			{
//				System.out.println(data1[i]+" "+data2[i]);
			}
			
		} else
			System.out.println(total_luck);

	}

}
