package hack;

import java.util.Scanner;

public class pauleigon
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		long a= s.nextLong();
		long b= s.nextLong()+s.nextLong();
		
		if((b/a)%2==0)
			System.out.println("paul");
		else
			System.out.println("opponent");
		
	}

}
