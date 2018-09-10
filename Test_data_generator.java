package webScrap.org.webScrap;

import java.util.Scanner;

public class Test_data_generator {

	public static void main(String[] args) {
		
		int t = 1;
		int n = 6;
		System.out.println(t);
		System.out.println(n);
		for(int i =0;i<n;i++){
			System.out.print(((int)(Math.random()*10) +1)+" ");
		}
		
	}

}
