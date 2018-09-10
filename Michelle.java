package webScrap.org.webScrap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Michelle {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		int k = Integer.parseInt(s.nextLine());
		
		System.out.println(subStringsKDist(data, k));
//		List<String> ans = new ArrayList<String>();
//		String first = data.substring(0, k);
//		Set<String> setter = new HashSet<String>();
//		Map<Character, Integer> mapper = new HashMap<Character, Integer>();
//		for (int i = 0; i < k; i++) {
//			if (mapper.get(data.charAt(i)) == null)
//				mapper.put(data.charAt(i), 1);
//			else
//				mapper.put(data.charAt(i), mapper.get(data.charAt(i)) + 1);
//		}
//
//		if (mapper.size() == k){
//			ans.add(first);
//			setter.add(first);
//		}
//
//		for (int i = 1; i < data.length() - k + 1; i++) {
//			// System.out.println(data.charAt(i + k - 1));
//			String now = data.substring(i, i + k);
//			System.out.println(now);
//			Character noww = data.charAt(i + k - 1);
//			Character firstChar = data.charAt(i - 1);
//			if (mapper.get(noww) == null) {
//				mapper.put(noww, 1);
//			} else {
//				mapper.put(noww, mapper.get(noww) + 1);
//			}
//			mapper.put(firstChar, mapper.get(firstChar) - 1);
//			if (mapper.get(firstChar) == 0)
//				mapper.remove(firstChar);
//
//			if (mapper.size() == k){
//				if(!setter.contains(now)){
//					ans.add(now);
//					setter.add(now);
//				}
//				
//			}
//			System.out.println(mapper);
//
//		}
//
//		System.out.println(ans);

	}
	
	public static List<String> subStringsKDist(String data, int k)
	{
      
		List<String> ans = new ArrayList<String>();
		String first = data.substring(0, k);
		Set<String> setter = new HashSet<String>();
		Map<Character, Integer> mapper = new HashMap<Character, Integer>();
		for (int i = 0; i < k; i++) {
			if (mapper.get(data.charAt(i)) == null)
				mapper.put(data.charAt(i), 1);
			else
				mapper.put(data.charAt(i), mapper.get(data.charAt(i)) + 1);
		}

		if (mapper.size() == k){
			ans.add(first);
			setter.add(first);
		}

		for (int i = 1; i < data.length() - k + 1; i++) {
			// System.out.println(data.charAt(i + k - 1));
			String now = data.substring(i, i + k);
		//	System.out.println(now);
			Character noww = data.charAt(i + k - 1);
			Character firstChar = data.charAt(i - 1);
			if (mapper.get(noww) == null) {
				mapper.put(noww, 1);
			} else {
				mapper.put(noww, mapper.get(noww) + 1);
			}
			mapper.put(firstChar, mapper.get(firstChar) - 1);
			if (mapper.get(firstChar) == 0)
				mapper.remove(firstChar);

			if (mapper.size() == k){
				if(!setter.contains(now)){
					ans.add(now);
					setter.add(now);
				}
				
			}
		//	System.out.println(mapper);

		}
	        return ans;		
	//	System.out.println(ans);
    }

}
