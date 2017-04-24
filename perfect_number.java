package practice;

public class perfect_number {

	public static void main(String[] args) {
		int n = 8129;
		if (isPerfectNumber(n))
			System.out.println(n + " is a perfect number");
		else
			System.out.println(n + " is not a perfect number");
	}

	public static boolean isPerfectNumber(long n) {
		long present_sum = 1;
		for (long i = 2; i < n; i++) {
			if (n % i == 0)
				present_sum += i;
		}

		if (present_sum == n)
			return true;
		else
			return false;
	}

}
