package webScrap.org.webScrap;

import java.util.Scanner;

public class Chef_and_Adventures {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++) {
			int n = s.nextInt() - 1;
			int m = s.nextInt() - 1;
			int x = s.nextInt();
			int y = s.nextInt();

			int check = 0;

			if (n % x == 0 && m % y == 0 && n >=0 && m >= 0) {
//				System.out.println("1");
				check = 1;
			} else if ((n - 1) % x == 0 && (m - 1) % y == 0 && (n-1) >=0 && (m-1) >= 0) {
				check = 1;
//				System.out.println("2");
			}

			if (check == 1)
				System.out.println("Chefirnemo");
			else
				System.out.println("Pofik");

		}

	}
}
