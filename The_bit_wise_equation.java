package practice;

public class The_bit_wise_equation {

	public static void main(String[] args) {

	}

	static long[] bitwiseEquations(long[] a, long[] b) {
		long[] ans = new long[a.length];

		for (int i = 0; i < a.length; i++) {
			for (long x = 0; x <= a[i]; x++) {
//				if ((x ^ (a[i] - x)) == b[i]) {
//					ans[i] = 3 * a[i] - x;
//					break;
				}
			}
//		}

		return ans;
	}

}
