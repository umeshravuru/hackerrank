package hack;

import java.util.Scanner;

public class bijele
{

	public static void main(String[] args)
	{
		
		Scanner s= new Scanner(System.in);
		int data [] = new int [6];
		for(int i =0;i<6;i++)
		{
			data[i]=s.nextInt();
		}
		System.out.print(1-data[0]+" ");
		System.out.print(1-data[1]+" ");
		System.out.print(2-data[2]+" ");
		System.out.print(2-data[3]+" ");
		System.out.print(2-data[4]+" ");
		System.out.print(8-data[5]+" ");
		
		
	}

}
