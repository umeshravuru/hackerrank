package webScrap.org.webScrap;

import java.io.BufferedReader;

public class Generate_random_string {

	public static void main(String[] args) {
		System.out.println(rand(100));	
		
	}

	public static String rand(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append((char) ((Math.random() * 6) + 1 + 96));
		}
		return sb.toString();
	}

}
