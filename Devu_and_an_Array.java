package hack;

import java.util.Scanner;

public class Devu_and_an_Array
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int q = s.nextInt();
		int data [] = new int [n];
		int max = 0;
		int min = 2000000001;
		for(int i =0;i<n;i++)
		{
			data[i]=s.nextInt();
			if(max<data[i])
				max = data[i];
			if(min>data[i])
				min = data[i];
		}
		for(int i =0;i<q;i++)
		{
			int now = s.nextInt();
			if(now<=max && min<=now)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		
	}

}
