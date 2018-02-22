package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Counting_binary_substring {

	/*
	 * Complete the function below.
	 */
	static int counting(String s) {
		ArrayList<Integer> _contCount = new ArrayList();
		int _temCount = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				_temCount++;
			} else {
				_contCount.add(_temCount);
				_temCount = 1;
			}
		}
		_contCount.add(_temCount);
//		System.out.println(_contCount);
		int ans = 0;
		for (int i = 0; i < _contCount.size() - 1; i++) {
			ans = ans + Math.min(_contCount.get(i), _contCount.get(i+1));
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = null;
		if (fileName != null) {
			bw = new BufferedWriter(new FileWriter(fileName));
		} else {
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		int res;
		String s;
		try {
			s = in.nextLine();
		} catch (Exception e) {
			s = null;
		}

		res = counting(s);
		bw.write(String.valueOf(res));
		bw.newLine();

		bw.close();
	}
}
