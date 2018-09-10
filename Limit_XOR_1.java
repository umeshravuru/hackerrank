package webScrap.org.webScrap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Limit_XOR_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = s.nextInt();
		}
		long final_ans = 0;
//		for (int i = 0; i <= k; i++)
//			final_ans = final_ans + subarrayXor(data, data.length, i);

		System.out.println(subarrayXor(data, data.length, k));
	}

	public static long subarrayXor(int arr[], int n, int m) {
		long ans = 0; // Initialize answer to be returned

		// Create a prefix xor-sum array such that
		// xorArr[i] has value equal to XOR
		// of all elements in arr[0 ..... i]
		int xorArr[] = new int[n];

		// Create map that stores number of prefix array
		// elements corresponding to a XOR value

		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

		// Initialize first element of prefix array
		xorArr[0] = arr[0];

		// Computing the prefix array.
		for (int i = 1; i < n; i++)
			xorArr[i] = xorArr[i - 1] ^ arr[i];

		// Calculate the answer
		for (int i = 0; i < n; i++) {
			// Find XOR of current prefix with m.
			int tmp = m ^ xorArr[i];

			// If above XOR exists in map, then there
			// is another previous prefix with same
			// XOR, i.e., there is a subarray ending
			// at i with XOR equal to m.
			if (mp.get(tmp) != null)
				ans = ans + ((long) mp.get(tmp));

			// If this subarray has XOR equal to m itself.
			if (xorArr[i] < m)
				ans++;

			// Add the XOR of this subarray to the map
			if (mp.get(xorArr[i]) == null)
				mp.put(xorArr[i], 1);
			else
				mp.put(xorArr[i], mp.get(xorArr[i]) + 1);

		}

		// Return total count of subarrays having XOR of
		// elements as given value m
		return ans;
	}

}
