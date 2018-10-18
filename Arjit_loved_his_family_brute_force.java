package webScrap.org.webScrap;

import java.util.Scanner;

public class Arjit_loved_his_family_brute_force {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		long data[] = new long[n];

		for (int i = 0; i < n; i++) {
			data[i] = s.nextLong();
		}

		long count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					if(isPSq(data[i]* data[j]))
						count++;
				}
			}
		}
		System.out.println(count);
		long den  = n *(n-1);
		double value =(double) count/(double)den;
		System.out.println(den);
		System.out.println(value);
		System.out.println((double)Math.round(value * 100000d) / 100000d);
		
		double ans = (double)Math.round(value * 100000d) / 100000d;
		System.out.println(make6Cha(ans));
		

	}
	private static boolean isPSq(long data){
		long now = (long)Math.sqrt(data);
		if(now * now == data)
			return true;
		else 
			return false;
		
	}
	
	private static String make6Cha(Double data){
		String ans = "";
		System.out.println(String.valueOf(data));
		ans = ans + String.valueOf(data);
		int len = String.valueOf(data).split("\\.")[1].length();
		for(int i =0;i<6-len;i++){
			ans = ans + "0";
		}
				
		
		return ans;
	}
	

}
