package coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Friends_Meeting {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++) {
			int n = s.nextInt();
			int data[] = new int[n];
			Boolean exits_1 = false;
			int min = 1000;
			int count_1 = 0;
			for (int i = 0; i < n; i++) {
				data[i] = s.nextInt();
				if (data[i] == 1) {
					exits_1 = true;
					count_1++;
				} else {
					if (data[i] < min)
						min = data[i];
				}
			}
			if (exits_1) {
				if (min == 1000)
					System.out.println("-1");
				else
					System.out.println(min);
			} else {
				System.out.println("-1");
			}

		}

	}

}
