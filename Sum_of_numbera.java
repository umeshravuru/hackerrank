package practice;

public class Sum_of_numbera {

	public static void main(String[] args) {

		int n = 1235;
		System.out.println(sum(n));
	}

	public static int sum(int n) {
		if (n <= 0)
			return 0;
		else
			return sum(n / 10) + n % 10;
	}

}
