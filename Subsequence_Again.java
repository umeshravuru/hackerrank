package webScrap.org.webScrap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Subsequence_Again {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String data = s.next();
		int k = Integer.parseInt(s.next());

		Map<Character, Integer> mapper = new HashMap<Character, Integer>();
		for (int i = 0; i < data.length(); i++) {
			char currentChar = data.charAt(i);
			if (mapper.get(currentChar) == null)
				mapper.put(currentChar, 1);
			else
				mapper.put(currentChar, mapper.get(currentChar) + 1);
		}
		// ArrayList<Character> charArr = new ArrayList<Character>();
		// for(Character key : mapper.keySet()){
		// charArr.add(e)
		// }
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < data.length(); i++) {
			if (mapper.get(data.charAt(i)) != null && mapper.get(data.charAt(i)) >= k)
				sb.append(data.charAt(i));
		}
		System.out.println(sb.toString());

	}

}
