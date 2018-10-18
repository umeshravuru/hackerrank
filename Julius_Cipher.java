package webScrap.org.webScrap;

import java.util.Scanner;

public class Julius_Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println();
		Scanner s = new Scanner(System.in);

		int t = Integer.parseInt(s.nextLine());
		
		for (int i = 0; i < t; i++) {
				String data = s.nextLine();
				if(isPalind(data)){
					System.out.println("Palindrome");
				} else{
					Long ans = (long)1;
					for(int j =0;j<data.length();j++){
						ans = ans * (int)(data.charAt(j)-96);
					}
					System.out.println(ans);
				}
				
				
		}
	}
	
	public static boolean isPalind(String data) {
//		System.out.println(data);
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
