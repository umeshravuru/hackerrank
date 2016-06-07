package hack;

import java.util.Scanner;

public class Day_26_Testing_Part_Implementations
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int d1=s.nextInt();
		int m1=s.nextInt();
		int y1=s.nextInt();
		
		int d2=s.nextInt();
		int m2=s.nextInt();
		int y2=s.nextInt();
		
		if(y1-y2>0)
			System.out.println((y1-y2)*1000);
		else if(m1-m2>0)
			System.out.println((m1-m2)*500);
		else if(d1-d2>0)
			System.out.println((d1-d2)*15);
		

	}

}
