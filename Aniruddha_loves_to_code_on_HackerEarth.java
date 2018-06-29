package coding;

import java.util.Scanner;

public class Aniruddha_loves_to_code_on_HackerEarth {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i =0;i<n;i++){
			int data = s.nextInt();
			int c = (int)Math.pow(10, 9)+ 7;
			System.out.println(mod(2,data,c) +1);
			
		}
		
	}
	public static int mod(int a, int b, int c)
	{
//		Scanner s = new Scanner(System.in);
//		long a = s.nextLong();
//		long b = s.nextLong();
//		long c = mod;
		
		a = a % c;
		String b_binary = conv(b, 2);
		long now = 1;
//		System.out.println(b_binary);
		for (int i = 0; i < b_binary.length(); i++)
		{
			if (b_binary.charAt(i) == '1')
			{
				now = now * now;
				now = now % c;
				now = now * a;
				now = now % c;
			} else
			{
				now = now * now;
				now = now % c;
			}
		}
		return (int) now;

	}
	public static String conv(long data, int base)
	{
		return (Long.toBinaryString(data));
	}

}
