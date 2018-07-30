package coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Coins {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int data[] = new int[t];
		int sum = 0;
		Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();
		TreeSet<Integer> sorted = new TreeSet<Integer>();
		TreeSet<Integer> sorted1 = new TreeSet<Integer>();
		for (int i = 0; i < t; i++) {
			data[i] = s.nextInt();
			sum = sum + data[i];
			if (mapper.get(data[i]) == null)
				mapper.put(data[i], 1);
			else
				mapper.put(data[i], mapper.get(data[i]) + 1);

			sorted.add(data[i]);
			sorted1.add(data[i]);
		}
//		System.out.println(mapper);
//		System.out.println(sorted);
		Arrays.sort(data);
		sorted.pollFirst();
		sorted.pollLast();
//		System.out.println(sorted);
//		System.out.println(sorted1);
		Iterator<Integer> ite = sorted.iterator();
		int che = 0;
		while (ite.hasNext()) {
			int now = ite.next();
			int sum1 = 0;
			int sum2 = 0;
//			System.out.println("ite "+now);
			Iterator<Integer> ite1 = sorted1.iterator();
			while (ite1.hasNext()) {
				int now1 = ite1.next();
				if (now1 == now)
					break;
//				System.out.println("ite1 "+now1);
				sum1 = sum1 + (mapper.get(now1) * now1);
//				System.out.println(sum1);

			}
			sum2 = sum - (mapper.get(now)* now) - (sum1);
			if(sum2 == sum1){
				che = 1;
				break;
			}
				

		}
		
		if(che == 1)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
