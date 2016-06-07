package hack;

import java.util.Scanner;

public class herman
{

	public static void main(String[] args)
	{
		
		Scanner  s = new Scanner(System.in);
		int r = s.nextInt();
		System.out.println((double)Math.round(Math.PI*r*r * 1000000d) / 1000000d);
		System.out.println(2*r*r+".000000");
		
		
		
	}

}
