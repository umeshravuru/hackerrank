package webScrap.org.webScrap;

import java.util.Scanner;

public class max_sum_of_a_sub_sequence_of_a_array_brute_force {

	public static void main(String[] args) {

		int data[] = rand(20);
		int max = 0;
		disp(data);
		
		int ii = 0;
		int jj = 0;
		for (int i = 0; i < data.length; i++) {
			int sum = 0;
			for (int j = i; j < data.length; j++) {
				sum = sum + data[j];
				if (sum > max) {
					max = sum;
					ii = i + 1;
					jj = j + 1;
				}
			}

		}
		System.out.println(max);
//		System.out.println(ii + " " + jj);
		
		int max_ending_here = 0, max_so_far = 0;
		for (int x : data) {
			max_ending_here = Math.max(x, max_ending_here + x);
			max_so_far = Math.max(max_so_far, max_ending_here);
		}
		System.out.println(max_so_far);

//		int Cdata[] = new int[data.length];
//		Cdata[0] = data[0];
//		int maxX = Cdata[0];
//		int minN = Cdata[0];
//		for (int i = 1; i < data.length; i++) {
//			Cdata[i] = Cdata[i - 1] + data[i];
//			if (maxX < Cdata[i])
//				maxX = Cdata[i];
//
//			if (minN > Cdata[i])
//				minN = Cdata[i];
//		}
//
//		disp(Cdata);
//		System.out.println(minN + " " + maxX + " == " + (maxX - minN));

	}

	public static int[] rand(int n) {
		int data[] = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = ((int) (Math.random() * 1000) - 50);
			System.out.print(data[i] + " ");
		}
		System.out.println();
		return data;
	}

	public static void disp(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
