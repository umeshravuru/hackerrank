package hack;

import java.util.Scanner;

public class Super_Humble_Matrix
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		int min = Math.min(n, m);
		int max = Math.max(n, m);
		
//		int data [] = new int [];
		
		
		

	}
	
	public static long mod(long data)
	{
		return (long) (data%(Math.pow(10, 9)+7));
	}

}
