package hack;

import java.util.Scanner;

public class Java_Loops
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		
		for(int ii=0;ii<t;ii++)
		{
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		long tem =a;
		for(int i =0;i<c;i++)
		{
			tem = (long) (tem + Math.pow(2, i)*b);
			System.out.print(tem+" ");
		}
		
		System.out.println();
		}
		
	}

}
