package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Finding_the_first_non_repeating_char {

	/*
	 * Complete the function below.
	 */
	static String nonRepeated(String s) {
		Map<Character, Integer> mapper = new HashMap();
		for(int i =0;i<s.length();i++) {
			if(mapper.get(s.charAt(i))==null)
				mapper.put(s.charAt(i), 1);
			else
				mapper.put(s.charAt(i), mapper.get(s.charAt(i))+1);
		}
		System.out.println(mapper);
		for(int i =0;i<s.length();i++) {
			if(mapper.get(s.charAt(i))==1) {
				return String.valueOf(s.charAt(i));
			}
		}
		
		return "";
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

		String res;
		String s;
		try {
			s = in.nextLine();
		} catch (Exception e) {
			s = null;
		}

		res = nonRepeated(s);
		bw.write(res);
		bw.newLine();

		bw.close();
	}
}
