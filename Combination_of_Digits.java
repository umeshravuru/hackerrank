package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Combination_of_Digits {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new FileReader(
				"/Users/UXR08UQ/Desktop/testData.txt"));

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));

		String t = br.readLine();
		String data[] = br.readLine().split(" ");
		long final_ans = 0;
		for(int i =0;i<data.length;i++){
			Long now  = Long.parseLong(data[i]) - (long)1;
			
			long ans1 = mod((long)2 , now , (long)Math.pow(10, 9) + (long)7);
			final_ans = (final_ans + ans1) % ((long)Math.pow(10, 9) + (long)7);
			
		}
		System.out.println(final_ans);

	}
	
	public static long mod(long a, long b, long c)
	{
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
		return now;

	}
	
	public static String conv(long data, int base)
	{
		
		return (Long.toBinaryString(data));
	}

}
