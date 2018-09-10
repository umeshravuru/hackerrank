package webScrap.org.webScrap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class War_of_XORs {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
//		System.out.println();
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++) {
			int n = s.nextInt();
			long data[] = new long[n];
			Map<Long, Long> odd = new HashMap<Long, Long>();
			Map<Long, Long> even = new HashMap<Long, Long>();
			Long evenCount = (long) 0;
			Long oddCount = (long) 0;
			for (int i = 0; i < n; i++) {
				data[i] = s.nextLong();
				if (data[i] % 2 == 0) {
					evenCount++;
					if (even.get(data[i]) == null)
						even.put(data[i], (long) 1);
					else
						even.put(data[i], even.get(data[i]) + 1);
				} else {
					oddCount++;
					if (odd.get(data[i]) == null)
						odd.put(data[i], (long) 1);
					else
						odd.put(data[i], odd.get(data[i]) + 1);
				}

			}
//			System.out.println(odd);
//			System.out.println(even);

			Long ans = (long) 0;
			
			for(Long key:even.keySet()){
				Long now = key;
				Long notNeed = now ^ 2;
				if (now % 2 == 0) {
					if (even.get(notNeed) != null) {
						ans = ans
								+ ((evenCount - even.get(notNeed) - even
										.get(now)) * even.get(now));
					} else {
						ans = ans
								+ ((evenCount - even.get(now)) * even.get(now));
					}
				} else {
					if (odd.get(notNeed) != null) {
						ans = ans
								+ ((oddCount - odd.get(notNeed) - odd.get(now)) * odd
										.get(now));
					} else {
						ans = ans + ((oddCount - odd.get(now)) * odd.get(now));
					}
				}
//				System.out.println(ans);
			}
			
			for(Long key:odd.keySet()){
				Long now = key;
				Long notNeed = now ^ 2;
				if (now % 2 == 0) {
					if (even.get(notNeed) != null) {
						ans = ans
								+ ((evenCount - even.get(notNeed) - even
										.get(now)) * even.get(now));
					} else {
						ans = ans
								+ ((evenCount - even.get(now)) * even.get(now));
					}
				} else {
					if (odd.get(notNeed) != null) {
						ans = ans
								+ ((oddCount - odd.get(notNeed) - odd.get(now)) * odd
										.get(now));
					} else {
						ans = ans + ((oddCount - odd.get(now)) * odd.get(now));
					}
				}
//				System.out.println(ans);
			}
			System.out.println(ans/2);

		}

	}
}
