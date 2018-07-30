package coding;

import java.util.Scanner;

public class Special_Shop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii =0;ii<t;ii++){
			int n = s.nextInt();
			int a = s.nextInt();
			int b = s.nextInt();
			long min = a*n*n;
			
			for(int i =1;i<=b;i++){
				long now = (a*n*n) + (a*i*i) - (2*a*n*i) + (b*i*i);
				if(min < now)
					min = now;
			}			
			System.out.println(min);
		}
		
		
	}

}
