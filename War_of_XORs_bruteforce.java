package webScrap.org.webScrap;

import java.util.HashMap;
import java.util.Map;

public class War_of_XORs_bruteforce {

	public static void main(String[] args) {

		int t = 100;
		int n = 10000;
//		System.out.println(t);
		for(int ii =0;ii<t;ii++){
//		System.out.println(n);
		int data[] = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = (int) (Math.random() * 100000) + 1;
//			System.out.print(data[i] + " ");
		}
//		System.out.println();
		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int xor = data[i] ^ data[j];
				if (xor % 2 == 0 && xor >= 4){
					ans++;
//					System.out.println(data[i]+"^"+data[j]+"="+xor);
				} else{
//					System.err.println("---"+data[i]+"^"+data[j]+"="+xor);
				}
			}
		}

//		System.out.println(ans);
		int testAns = test(data, data.length);
//		System.out.println(testAns);
		if(ans == testAns)
			System.out.println("OK");
		else
			System.out.println("NOT OK");
		}

	}
	
	public static int test(int data[], int n){
		
		Map<Integer, Integer> odd = new HashMap<Integer, Integer>();
		Map<Integer, Integer> even = new HashMap<Integer, Integer>();
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < n; i++) {
			if (data[i] % 2 == 0) {
				evenCount++;
				if (even.get(data[i]) == null)
					even.put(data[i], 1);
				else
					even.put(data[i], even.get(data[i]) + 1);
			} else {
				oddCount++;
				if (odd.get(data[i]) == null)
					odd.put(data[i], 1);
				else
					odd.put(data[i], odd.get(data[i]) + 1);
			}

		}
//		System.out.println(odd);
//		System.out.println(even);

		int ans = 0;
		
		for(int key:even.keySet()){
			int now = key;
			int notNeed = now ^ 2;
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
//			System.out.println(ans);
		}
		
		for(int key:odd.keySet()){
			int now = key;
			int notNeed = now ^ 2;
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
//			System.out.println(ans);
		}
		return ans/2;
//		System.out.println(ans/2);

	
		
	}

}
