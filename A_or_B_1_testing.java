package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class A_or_B_1_testing
{

	public static void main(String[] args)
	{
		
		Scanner s  = new Scanner(System.in);
		
		
		for(int i=0;i<16;i++)
		{
			for(int i1=0;i1<16-1;i1++)
			{
				for(int i2=i1;i2<16;i2++)
				{
					if((i1|i2 )== i)
					{
						System.out.println(i +" -- "+ i1+"|"+i2);
					}
				}
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
