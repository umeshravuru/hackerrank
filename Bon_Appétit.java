package webScrap.org.webScrap;

import java.util.Scanner;

public class Bon_Appétit {

	public static void main(String[] args) {
		System.out.println();
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++) {
			int v = s.nextInt();
			int w = s.nextInt();
			System.out.println(Math.min(w+1, v+1));
		}

	}

}
