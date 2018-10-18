package webScrap.org.webScrap;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		System.out.println();
		Scanner s = new Scanner(System.in);
//		String data = s.nextLine();
		System.out.println(sol("11001"));

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
