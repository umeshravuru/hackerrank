package beer_night;

import java.util.Scanner;

public class Project_Euler_25_N_digit_Fibonacci_number
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt(); 
		long [] data = new long [5003];
		data[0]=1;
		data[1]=1;
		for(int i =2;i<data.length;i++)
		{
			data[i]=data[i-1]+data[i-2];
		}
		
		disp(data);
		for(int i =0;i<t;i++)
		{
			System.out.println(data[s.nextInt()-1]);
		}
		
	}
	
	public static void disp(long[] data)
	{
		
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		
	}
	

}



