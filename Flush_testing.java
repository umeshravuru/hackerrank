package hack;

import java.util.Scanner;

public class Flush_testing
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		System.out.println(a);
		System.out.flush();
		System.out.println(b);
		
	}

}
