package webScrap.org.webScrap;

import java.util.Scanner;

public class max_sum_of_a_sub_sequence_of_a_array_sub_array_O_of_N {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = s.nextInt();
		}

		int max_ending_here = 0, max_so_far = 0;
		for (int x : data) {
			max_ending_here = Math.max(x, max_ending_here + x);
			max_so_far = Math.max(max_so_far, max_ending_here);
		}
		System.out.println(max_so_far);

	}
}
