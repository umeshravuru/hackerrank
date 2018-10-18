package webScrap.org.webScrap;

import java.util.Scanner;

public class Halloween_Sale {

	public static void main(String[] args) {
		System.out.println();
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int ans = 0;
		int current_items = 0;
		while (d > 0) {
//			System.out.println(d);
			d = d - (a - current_items * b);
			if(current_items * b <= c)
				current_items++;
			ans++;
		}
		System.out.println(ans);

	}

}
