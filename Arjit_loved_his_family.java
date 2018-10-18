package webScrap.org.webScrap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Arjit_loved_his_family {

	public static void main(String[] args) {
		System.out.println();

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		Long data[] = new Long[n];
		Map<Long, Integer> mapper = new HashMap<Long, Integer>();
		for (int i = 0; i < n; i++) {
			data[i] = s.nextLong();
			if (mapper.containsKey(data[i]))
				mapper.put(data[i], mapper.get(data[i]) + 1);
			else
				mapper.put(data[i], 1);
		}

		long den = n * (n - 1);

		long num = 0;

		for (Long key : mapper.keySet()) {
			int now = mapper.get(key);
			num = num + (now * (now - 1));
		}

		ArrayList<Long> uniq = new ArrayList<Long>();
		for (Long key : mapper.keySet()) {
			uniq.add(key);
		}
			System.out.println(mapper);
		for (int i = 0; i < uniq.size()-1; i++) {
			for (int j = i+1; j < uniq.size(); j++) {
				if (i != j) {
					
					if (isPSq(uniq.get(i) * uniq.get(j))) {
						System.out.println(uniq.get(i)+" "+uniq.get(j));
						num = num
								+ (2 * mapper.get(uniq.get(i))
										* mapper.get(uniq.get(j)));

					}
				}
			}
		}
		
		double value =(double) num/(double)den;
		System.out.println(den);
		System.out.println(num);
		System.out.println(value);
		System.out.println((double)Math.round(value * 100000d) / 100000d);
		
		double ans = (double)Math.round(value * 100000d) / 100000d;
		System.out.println(make6Cha(ans));

	}

	private static boolean isPSq(long data) {
//		if(data == 8){
//			System.out.println("adsfljhasd"); 
//			
//			System.out.println((long) Math.sqrt(data));
//		}
		long now = (long) Math.sqrt(data);
		if (now * now == data)
			return true;
		else
			return false;

	}

	private static String make6Cha(Double data) {
		String ans = "";
		// System.out.println(String.valueOf(data));
		ans = ans + String.valueOf(data);
		int len = String.valueOf(data).split("\\.")[1].length();
		for (int i = 0; i < 6 - len; i++) {
			ans = ans + "0";
		}

		return ans;
	}

}
