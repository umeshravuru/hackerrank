package webScrap.org.webScrap;

import java.util.Scanner;

public class Array_Partition_brute_force {

	public static void main(String[] args) {

//		int data[] = rand(10);
//		int n = data.length;
			
		Scanner  s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii =0;ii<t;ii++){
			int n = s.nextInt();
			int data[] = new int [n];
			for(int i =0;i<n;i++){
				data[i] = s.nextInt();
			}
			
			
			
		}
		
		
	}

	public static int[] rand(int n) {
		int data[] = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = ((int) (Math.random() * 10));
			// System.out.print(((int)(Math.random()*10) )+" ");
		}
		return data;

	}

}
