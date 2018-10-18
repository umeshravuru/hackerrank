package webScrap.org.webScrap;

import java.util.Scanner;

public class Xor_Queries_1 {

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

			String aa = makeSameLen(conv(a, 2), max_len);
			String bb = makeSameLen(conv(b, 2), max_len);
			String cc = makeSameLen(conv(c, 2), max_len);
//			System.out.println("aa " + aa);
//			System.out.println("bb " + bb);
//			System.out.println("cc " + cc);
			String ans = "";
			int che = 0;
			int che1 = 0;
			for (int i = 0; i < aa.length(); i++) {
				if (che == 0) {
					if (cc.charAt(i) == '1' && bb.charAt(i) == '1') {
						ans = ans + "1";
					} else if (cc.charAt(i) == '0' && bb.charAt(i) == '1') {
						ans = ans + "1";
					} else {

						if (aa.charAt(i) == '0') {
							ans = ans + "1";
							che = 1;
						} else
							ans = ans + "0";

					}
				} else {
					if (che1 == 0) {
						if (cc.charAt(i) == '1') {
							if (aa.charAt(i) == '0')
								ans = ans + "1";
							else {
								ans = ans + "0";
								che1 = 1;
							}

						} else {
							ans = ans + "0";
						}
					} else {

						if (aa.charAt(i) == '0')
							ans = ans + "1";
						else {
							ans = ans + "0";
						}
					}
				}
//				System.out.println(che + " " + che1);
//				System.out.println(ans);
			}
//			System.out.println(ans);
//			System.out.println(sol(ans));
			Long ansBfr = sol(ans);
			System.out.println(ansBfr ^ a);

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

	public static String makeSameLen(String data, int n) {
		int len = data.length();
		for (int i = 0; i < n - len; i++) {
			data = "0" + data;
		}
		return data;
	}

	public static long sol(String data) {
		long ans = 0;
		int pow = 0;
		for (int i = data.length() - 1; i >= 0; i--) {
			ans = (long) (ans + (Math.pow(2, pow) * Integer.parseInt(String
					.valueOf(data.charAt(i)))));
			pow++;
		}
		return ans;
	}

}
