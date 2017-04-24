package practice;

public class Minimum_moves {

	public static void main(String[] args) {

	}

	public static int sol(int a[], int b[]) {
		int ans = 0;

		for (int i = 0; i < a.length; i++) {
			ans = ans + diff(a[i], b[i]);
		}

		return ans;
	}

	public static int diff(int a, int b) {
		int ans = 0;
		String aa = String.valueOf(a);
		String bb = String.valueOf(b);
		for (int i = 0; i < aa.length(); i++) {
			ans = ans + Math.abs(aa.charAt(i) - bb.charAt(i));
		}

		return ans;
	}

}
