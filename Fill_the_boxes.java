package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fill_the_boxes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++) {
			int n = s.nextInt();
			int m = s.nextInt();
			int k = s.nextInt();
			int box[] = new int[n];
			int boll[] = new int[m];
			for (int i = 0; i < n; i++) {
				box[i] = s.nextInt();
			}
			Arrays.sort(box);
			for (int i = 0; i < m; i++) {
				boll[i] = s.nextInt();
			}
			Arrays.sort(boll);
			ArrayList<Integer> box1 = new ArrayList<Integer>();
			ArrayList<Integer> boll1 = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				box1.add(box[i]);
			}
			for (int i = 0; i < m; i++) {
				boll1.add(boll[i]);
			}
			int ans = 0;
			while (box1.size() > 0 && boll1.size() > 0) {
				int now1 = box1.get(0);
				int now2 = boll1.get(0);
				if (now2 <= now1+k && now2>=now1) {
					ans++;
					box1.remove(0);
					boll1.remove(0);
				}else {
					box1.remove(0);
				}
				

			}
			
			System.out.println(ans);

		}

	}

}
