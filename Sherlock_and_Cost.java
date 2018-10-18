package webScrap.org.webScrap;

import java.util.Scanner;

public class Sherlock_and_Cost {

	public static void main(String[] args) {
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++) {
			int n = s.nextInt();
			int data[] = new int[n];
			for (int i = 0; i < n; i++) {
				data[i] = s.nextInt();
			}
			int ans = 0;
			int data1[] = new int[n];
			data1[0] = data[0];
			for (int i = 1; i < n; i++) {
				if (Math.abs(data1[i - 1] - data[i]) < Math
						.abs(data1[i - 1] - 1))
					data1[i] = 1;
				else
					data1[i] = data[i];
				ans = ans + Math.abs(data1[i] - data1[i - 1]);

			}
			
			disp(data);
			disp(data1);
			System.out.println(ans);
			
			int ans1 = 0;
			int data2[] = new int[n];
			data2[0] = 1;
			for (int i = 1; i < n; i++) {
				if (Math.abs(data2[i - 1] - data[i]) < Math
						.abs(data2[i - 1] - 1))
					data2[i] = 1;
				else
					data2[i] = data[i];
				ans1 = ans1 + Math.abs(data2[i] - data2[i - 1]);

			}
//			
			disp(data2);
			System.out.println(ans1);
			System.out.println(Math.max(ans1, ans));
		}

	}

	private static void disp(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
