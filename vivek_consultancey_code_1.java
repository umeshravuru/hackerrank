package practice;

public class vivek_consultancey_code_1 {

	public static void main(String[] args) {

		trim_string t = new trim_string();

		t.trim_string("aaaaz", 1);

	}

}

class trim_string {

	String trim_string(String input, int n) {
		input = input + " ";
		StringBuilder ans = new StringBuilder();
		int tem_len = 1;
		for (int i = 0; i < input.length(); i++) {
			char now = input.charAt(i);
			while (i < input.length() - 1) {
				if (input.charAt(i + 1) == now) {
					tem_len++;
					i++;
				} else {
					System.out.println(tem_len);
					ans = gen_run_length(ans, now, Math.min(n, tem_len));
					System.out.println(ans);
					tem_len = 1;
					break;
				}
			}
			// System.out.println(tem_len);
		}

		return input;
	}

	// public static String gen_run_length1(Character c, int n) {
	// char[] ans = new char[n];
	// for (int i = 0; i < n; i++) {
	// ans[i] = c;
	// }
	// return ans.toString();
	// }

	public static StringBuilder gen_run_length(StringBuilder input, Character c, int n) {
		for (int i = 0; i < n; i++) {
			input.append(c);
		}
		return input;
	}

}
