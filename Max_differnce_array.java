package hack;

import java.util.Scanner;

public class Max_differnce_array
{

	public static void main(String[] args)
	{

		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int [] data = new int [t];
		
		for(int i =0;i<t;i++)
		{
			data[i]=s.nextInt();
		}
		
		
		System.out.println(maxxx(data));
		
		
	}
	
	public static int maxxx (int[]a)
	{
		int min =1000001;
		int max = -1000001;
		int ind=0;
		for(int i =0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max = a[i];
				ind=i;
			}
		}
		for(int i =0;i<ind;i++)
		{
			if(min>a[i])
				min = a[i];
		}
		
		return (max-min);
	}

}
