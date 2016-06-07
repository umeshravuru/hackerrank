package hack;

import java.math.BigInteger;
import java.util.Scanner;

public class big_integer
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		BigInteger t1  =new BigInteger(s.nextLine());
		BigInteger t2  =new BigInteger(s.nextLine());
		System.out.println(t1.mod(t2));
		
	}

}
