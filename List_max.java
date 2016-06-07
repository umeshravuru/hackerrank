package hack;

import java.util.Scanner;

public class List_max
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		long n = s.nextInt();
		long m = s.nextInt();
		long data [] = new long [(int) (n+1)];
		
		for(int i =0;i<m;i++)
		{
			long a= s.nextInt()-1;
			long b= s.nextInt()-1;
			long c= s.nextInt();
			data[(int) a]=data[(int) a]+c;
			data[(int) (b+1)]=data[(int) (b+1)]-c;
			
		}
		
		long max =-1;
		for(int i =1;i<n+1;i++)
		{
			data[i]=data[i]+data[i-1];
			if(data[i]>max)
				max = data[i];
		}
		
		System.out.println(max);
		
	}

}
