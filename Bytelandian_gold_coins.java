package Code_chef;

import java.util.Scanner;

public class Bytelandian_gold_coins
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		while(s.hasNext())
		{
			long n = s.nextInt();
			System.out.println(bitcoin(n));
		}
		
		
	}
	
	public static long bitcoin(long data)
	{
		if(data<12)
			return data;
		else if(data==12)
			return 13;
		else
			return Math.max(data, bitcoin(data/2)+bitcoin(data/3)+bitcoin(data/4));
	}

}
