package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Common_Anagrams {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));

		BufferedReader br = new BufferedReader(new FileReader(
				"/Users/UXR08UQ/Desktop/testData.txt"));

		int t = Integer.parseInt(br.readLine());

		for (int ii = 0; ii < t; ii++) {
			int n = Integer.parseInt(br.readLine());
			// for (int jj = 0; jj < 2; jj++) {
			String a = br.readLine();
			String b = br.readLine();
			// System.out.println(a + " a");
			// System.out.println(b+ " b");
			// System.out.println(getMapper(a));
			// System.out.println(getMapper(b));
			Map<String, Integer> aa = getMapper(a);
			Map<String, Integer> bb = getMapper(b);
//			System.out.println(aa);
//			System.out.println(bb);
			int ans = 0;
			for (String key : aa.keySet()) {
				if (bb.containsKey(key))
					ans = ans + aa.get(key);
			}
			System.out.println("Case #"+(ii+1)+": "+ans);
			// }
		}

	}

	private static Map<String, Integer> getMapper(String data) {
		Map<String, Integer> mapper = new HashMap<>();
		for (int i = 0; i < data.length(); i++) {
			Map<Character, Integer> temp = new HashMap<Character, Integer>();
			for (int j = i + 1; j < data.length() + 1; j++) {
				char now = data.charAt(j - 1);
				if (temp.containsKey(now))
					temp.put(now, temp.get(now) + 1);
				else
					temp.put(now, 1);
//				 System.out.println(data.substring(i, j));
//				 System.out.println(temp);
				// System.out.println(helperMapper(temp));
				String helper = helperMapper(temp);
				if (mapper.containsKey(helper))
					mapper.put(helper, mapper.get(helper)+1);
				else
					mapper.put(helper, 1);
			}

		}

		return mapper;
	}

	private static String helperMapper(Map<Character, Integer> data) {
		String ans = "";
		for (int i = 65; i <= 90; i++) {
			if (data.get((char) i) != null)
				ans = ans + String.valueOf((char) i)
						+ String.valueOf(data.get((char) i));
		}

		return ans;
	}

}
