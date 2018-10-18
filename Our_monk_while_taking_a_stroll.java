package webScrap.org.webScrap;

import java.util.Scanner;

public class Our_monk_while_taking_a_stroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		
		
		for (int ii = 0; ii < t; ii++) {
				int a = s.nextInt();
				int b = s.nextInt();
				int c = s.nextInt();
				int d = s.nextInt();
				
				for(int i =0;i<1000000;i++){
					if((a*i*i) + (b*i) + c >= d){
						System.out.println(i);
						break;
					}
				}
		}
				
	}

}
