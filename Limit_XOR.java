package webScrap.org.webScrap;

import java.util.Scanner;

public class Limit_XOR {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int data[]= new int [n];
		for(int i =0;i<n;i++){
			data[i] = s.nextInt();
		}
		int final_ans = 0;
		
		for(int i =0;i<n-1;i++){
			int now = 0;
			for(int j =i;j<n;j++){
				now = now ^ data[j];
				if(now < k)
					final_ans++;
			}
		}
		
		System.out.println(final_ans);
		
	}

}
