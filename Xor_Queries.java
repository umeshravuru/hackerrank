package webScrap.org.webScrap;

import java.util.Scanner;

public class Xor_Queries {

	public static void main(String[] args) {
		System.out.println();
		Scanner s = new Scanner(System.in);
		// System.out.println(conv(1100,2));
		long t = s.nextLong();
		for (int ii = 0; ii < t; ii++) {
			long a = s.nextLong();
			long b = s.nextLong();
			long c = s.nextLong();

			int max_len = conv(Math.max(a, Math.max(c, b)), 2).length();
			long ans = (long) (Math.pow(2, max_len) - 1);
//			System.out.println(ans);
			while (true) {
				long now = a ^ ans;
				if (now <= c && now >= b) {
					System.out.println(ans);
					break;
				}
				ans--;
			}

		}

	}

	public static String conv(long data, int base) {

		String ans = "";
		int pow = 0;
		for (int i = 0; i < 1000; i++) {
			if (data >= Math.pow(base, i) && data < Math.pow(base, i + 1)) {
				pow = i;
				break;
			}
		}
		while (pow >= 0) {
			if (data >= Math.pow(base, pow)) {
				ans = ans + String.valueOf((int) (data / Math.pow(base, pow)));
				data = (long) (data - (int) (data / Math.pow(base, pow))
						* Math.pow(base, pow));
			} else
				ans = ans + "0";
			pow--;
		}
		return ans;
	}
}
