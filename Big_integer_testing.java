package hack;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Big_integer_testing
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		ArrayList<Integer> ans = new ArrayList<>();

		BigInteger a =  new BigInteger("1");
		BigInteger b =  new BigInteger("1");
		int now = 2;
		int len_now = 1;
		while (ans.size() < 5000)
		{

			BigInteger c =  a.add(b);
			a = b;
			b = c;
			now++;
			if (String.valueOf(c).length() > len_now)
			{
				len_now++;
				ans.add(now);
			}
//			if(now ==200)
//				System.out.println(tem);
			// System.out.println(tem);

		}
		for (int i = 0; i < n; i++)
		{
			System.out.println(ans.get(s.nextInt() - 2));
		}
		
		
		
		
	}

}
