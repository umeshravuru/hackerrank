package Code_chef;

import java.util.Arrays;
import java.util.Scanner;

public class Racing_Horses
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n = s.nextInt();
			int data [] = new int [n];
			
			int min =1000000000;
			for(int i=0;i<n;i++ )
			{
				data[i]= s.nextInt();
			}
			Arrays.sort(data);
			for(int i=0;i<n-1;i++ )
			{
				if(data[i+1]-data[i]<min)
					min = data[i+1]-data[i];
			}
			System.out.println(min);
		}
		
		
	}

}
