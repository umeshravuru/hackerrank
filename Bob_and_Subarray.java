package webScrap.org.webScrap;

import java.util.Scanner;

public class Bob_and_Subarray {

	public static void main(String[] args) {
		System.out.println();
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		long data[] = new long[t];
		for (int i = 0; i < t; i++) {
			data[i] = s.nextLong();
		}
		long ans = 0;
		for (int i = 0; i < t; i++) {
			long tem_ans = 0;
			for (int j = i; j < t; j++) {
				tem_ans = tem_ans | data[j];
				ans = ans + tem_ans;
//				System.out.println(tem_ans);
			}
//			System.out.println(tem_ans);
			
		}
		System.out.println(ans);

	}

	
}
