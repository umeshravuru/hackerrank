package webScrap.org.webScrap;

import java.util.Scanner;

public class LongestPalindtome_brute_force {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String data = rand(100);
		System.out.println(data);
		int maxLen = 0;
		String ans = "";
		for (int i = 0; i < data.length(); i++) {
			for (int j = i; j < data.length(); j++) {
				if (isPalind(data.substring(i, j + 1))) {
//					System.out.println(data.substring(i, j + 1));
					if (data.substring(i, j + 1).length() > maxLen) {
						maxLen = data.substring(i, j + 1).length();
						ans = data.substring(i, j + 1);
					}
				}
				// else
				// System.err.println(data.substring(i,j+1));

			}
		}
		System.out.println(ans);
		
		
		
		int maxLen1 = 0;
		String ans1 = "";
		for (int i = 0; i < data.length(); i++) {
			int j1 = i, j2 = i, che = 0;
			int len = -1;
			while (j1 >= 0 && j2 < data.length()) {
				if (data.charAt(j1) != data.charAt(j2)) {
					che = 1;
					break;
				} else{
					len = len + 2; 
				}
				j1--;
				j2++;
			}
//			System.out.println(len);
			if(len > maxLen1){
				maxLen1 = len;
				ans1 = data.substring(i-len/2, i + len/2 + 1);
			}
//			System.out.println(ans);
				
		}
		
		for (int i = 0; i < data.length(); i++) {
			int j1 = i, j2 = i+1, che = 0;
			int len = 0;
			while (j1 >= 0 && j2 < data.length()) {
				if (data.charAt(j1) != data.charAt(j2)) {
					che = 1;
					break;
				} else{
					len = len + 2; 
				}
				j1--;
				j2++;
			}
//			System.out.println(len);
//			System.out.println(data.substring(i-len/2+1, i+ len/2+1));
			if(len > maxLen1){
				maxLen1 = len;
				ans1 = data.substring(i-len/2 +1, i + len/2 + 1);
			}
//			System.out.println(ans);
				
		}
		System.out.println(ans1);
		if(ans1.equals(ans))
			System.out.println("OK");
		else
			System.out.println("NO");
		
	}

	public static String rand(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append((char) ((Math.random() * 2) + 1 + 96));
		}
		return sb.toString();
	}

	public static boolean isPalind(String data) {
		if (data.length() % 2 == 0) {
			for (int i = 0; i < data.length() / 2; i++) {
				if (data.charAt(i) != data.charAt(data.length() - 1 - i))
					return false;
			}
			return true;
		} else {
			for (int i = 0; i < data.length() / 2; i++) {
				if (data.charAt(i) != data.charAt(data.length() - 1 - i))
					return false;
			}
			return true;
		}
	}

}
