package webScrap.org.webScrap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ugly_or_Beautiful {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++) {
			int n = s.nextInt();
			int data[] = new int[n];
			Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				data[i] = s.nextInt();
				mapper.put(data[i], 1);
			}
			int che1 = 1;
			int che2 = 0;
			int che3 = 1;
			if (mapper.size() != n)
				che1 = 0;
			for (int i = 1; i < n; i++) {
				if (data[i - 1] >= data[i]) {
					che2 = 1;
					break;
				}
			}

			for (int i = 0; i < n; i++) {
				if (data[i] <= 0 || data[i] > n) {
					che3 = 0;
					break;
				}
			}
			if (che1 == 0 || che2 == 0 || che3 == 0)
				System.out.println("Ugly");
			else
				System.out.println("Beautiful");

		}

	}

}
