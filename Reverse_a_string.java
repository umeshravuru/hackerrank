package practice;

public class Reverse_a_string {

	public static void main(String[] args) {
		String s = "umesh";
		System.out.println(reverseString(s));
	}

	public static String reverseString(String s) {
		if ((s == null) || (s.length() <= 1))
			return s;
		return reverseString(s.substring(1, s.length())) + s.charAt(0);
	}

}
