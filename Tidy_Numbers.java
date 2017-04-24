package practice;

import java.util.Scanner;

public class Tidy_Numbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			long data = s.nextLong();
			if (test(data)) {
				System.out.println("Case #" + i + ": " + data);
			} else if (reduce_len(data)) {
				System.out.println("Case #" + i + ": " + reduce_val(data));
			} else {

				// System.out.println(part_ok(data)[0] + " " +
				// part_ok(data)[1]);
				while (true) {
					if (part_ok(data)[0] != 0) {
						String ans = String.valueOf(part_ok(data)[0] + String.valueOf(part_ok(data)[1] - 1));
						int rem_len = String.valueOf(data).length() - ans.length();
						ans = ans + get_9(rem_len);
						if (test(Long.parseLong(ans))) {
							System.out.println("Case #" + i + ": " + ans);
							break;
						}
						data = Long.valueOf(ans);

					} else {
						String ans = String.valueOf(part_ok(data)[1] - 1);
						int rem_len = String.valueOf(data).length() - ans.length();
						ans = ans + get_9(rem_len);
						if (test(Long.parseLong(ans))) {
							System.out.println("Case #" + i + ": " + ans);
							break;
						}
						data = Long.valueOf(ans);
					}
				}

			}

		}

	}

	public static boolean test(long data) {
		String now = String.valueOf(data);
		for (int i = 1; i < now.length(); i++) {
			if ((int) now.charAt(i - 1) > (int) now.charAt(i))
				return false;
		}
		return true;
	}

	public static long[] part_ok(long data) {
		String now = String.valueOf(data);
		int last = 0;
		for (int i = 1; i < now.length(); i++) {
			if ((int) now.charAt(i - 1) > (int) now.charAt(i)) {
				last = i;
				break;
			}
		}
		String send = now.substring(0, last - 1);
		long s[] = new long[2];
		if (last == 1)
			s[0] = 0;
		else
			s[0] = Long.parseLong(send);
		s[1] = Long.parseLong(now.substring(last - 1, last));
		return s;
	}

	public static boolean reduce_len(long data) {
		long ans = 0;
		int len = String.valueOf(data).length();
		long min = (long) Math.pow(10, len - 1);
		String max_str = "";

		for (int i = 0; i < len; i++) {
			max_str = max_str + "1";
		}
		// System.out.println(max_str);
		long max = Long.parseLong(max_str) - 1;
		if (data >= min && data <= max) {
			return true;
		} else
			return false;

	}

	public static long reduce_val(long data) {
		String tem = "";
		int len = String.valueOf(data).length();
		for (int i = 0; i < len - 1; i++) {
			tem = tem + "9";
		}
		return Long.parseLong(tem);
	}

	public static String get_9(int n) {
		String send = "";
		for (int i = 0; i < n; i++) {
			send = send + "9";
		}
		return send;
	}

}
