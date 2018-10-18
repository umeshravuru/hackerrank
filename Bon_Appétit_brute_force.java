package webScrap.org.webScrap;

import java.util.Scanner;

public class Bon_Appétit_brute_force {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		int v = 0, w = 0;
		for (int ii = 0; ii < t; ii++) {
			v = s.nextInt();
			w = s.nextInt();
		}
		char[] ans = new char[v];
		for (int i = 0; i < v; i++) {
			ans[i] = 'A';
		}
			disp(ans);
		for (int i = v - 1; i >= 0; i--) {
			if (w == 0)
				break;
			ans[i] = 'B';
			disp(ans);
			w--;
			
		}

	}

	public static void disp(char[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "");
		}
		System.out.println("");
	}

}
