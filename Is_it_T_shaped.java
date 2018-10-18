package webScrap.org.webScrap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Is_it_T_shaped {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++) {
			Map<Integer, Integer> x = new HashMap<Integer, Integer>();
			Map<Integer, Integer> y = new HashMap<Integer, Integer>();
			int data[][] = new int[5][2];
			data[0][0] = s.nextInt();
			data[0][1] = s.nextInt();

			data[1][0] = s.nextInt();
			data[1][1] = s.nextInt();

			data[2][0] = s.nextInt();
			data[2][1] = s.nextInt();

			data[3][0] = s.nextInt();
			data[3][1] = s.nextInt();

			data[4][0] = s.nextInt();
			data[4][1] = s.nextInt();

			for (int i = 0; i < 5; i++) {
				if (x.get(data[i][0]) == null)
					x.put(data[i][0], 1);
				else
					x.put(data[i][0], x.get(data[i][0]) + 1);
			}

			for (int i = 0; i < 5; i++) {
				if (y.get(data[i][1]) == null)
					y.put(data[i][1], 1);
				else
					y.put(data[i][1], y.get(data[i][1]) + 1);
			}
			// System.out.println(x);
			// System.out.println(y);
			int che = 0;
			for (int i = 0; i < 5; i++) {
				// System.out.println(i);
				int xx = data[i][0];
				int yy = data[i][1];
				// System.out.println(xx + " " + yy);
				try {

					if (x.get(xx) == 1 && x.get(xx - 1) == 1
							&& x.get(xx + 1) == 3 && y.get(yy) == 3
							&& y.get(yy - 1) == 1 && y.get(yy + 1) == 1) {
						che = 1;
					} else if (x.get(xx) == 3 && x.get(xx - 1) == 1
							&& x.get(xx + 1) == 1 && y.get(yy) == 1
							&& y.get(yy - 1) == 3 && y.get(yy + 1) == 1) {
						che = 1;
					} else if (x.get(xx) == 1 && x.get(xx - 1) == 3
							&& x.get(xx + 1) == 1 && y.get(yy) == 3
							&& y.get(yy - 1) == 1 && y.get(yy + 1) == 1) {
						che = 1;
					} else if (x.get(xx) == 3 && x.get(xx - 1) == 1
							&& x.get(xx + 1) == 1 && y.get(yy) == 1
							&& y.get(yy - 1) == 1 && y.get(yy + 1) == 3) {
						che = 1;
					}

				} catch (Exception e) {

				}

			}
			if (che == 0)
				System.out.println("No");
			else
				System.out.println("Yes");

		}
	}

}
