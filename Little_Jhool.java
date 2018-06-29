package coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Little_Jhool {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for (int i = 0; i < t; i++) {
			String now = s.nextLine();
			Map<Character, Integer> mapper = new HashMap<Character, Integer>();
			for (int j = 0; j < now.length(); j++) {
				if (mapper.get(now.charAt(j)) == null)
					mapper.put(now.charAt(j), 1);
				else
					mapper.put(now.charAt(j), mapper.get(now.charAt(j)) + 1);
			}
			int ans = 0;
			try {
				ans = Math.min(mapper.get('r'), mapper.get('u'));
				ans = Math.min(ans, mapper.get('b'));
				ans = Math.min(ans, mapper.get('y'));
				System.out.println(ans);
			} catch (Exception e) {
				System.out.println("0");
			}

		}

	}

}
