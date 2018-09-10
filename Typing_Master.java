package webScrap.org.webScrap;

import java.util.Scanner;

public class Typing_Master {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int n = Integer.parseInt(s.nextLine());
		
		String ans = "";
		for(int i =0;i<n;i++){
			String now = s.nextLine();
			int k = Integer.parseInt(s.nextLine());
			for(int j =0;j<k;j++){
				ans = ans + now;
			}
			sum = sum + (int)now.charAt(0);
		}
		
		System.out.print(ans+String.valueOf(sum));
		
		
		
	}

}
