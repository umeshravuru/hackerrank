package practice;

public class Binary_number_or_not {

	public static void main(String[] args) {

		long n = 101;
		System.out.println(isBinary(n));

	}

	public static boolean isBinary(long n) {
		while (n > 0) {
			if (n % 10 != 0 && n % 10 != 1)
				return false;
			n = n / 10;
		}
		return true;
	}

}
