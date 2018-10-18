package webScrap.org.webScrap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class City_Travel {

	public static void main(String[] args) {
		System.out.println();
		Scanner s = new Scanner(System.in);
		int totalDis = s.nextInt();
		int x = s.nextInt();
		int n = s.nextInt();
		int data[] = new int[1000000001];
		// Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();

		// for (int i = 0; i < n; i++) {
		// mapper.put(s.nextInt(), s.nextInt());
		// }
		for (int i = 0; i < n; i++) {
			data[s.nextInt()] = s.nextInt();
		}
		int currentDistance = 0;
		int currentDay = 1;
		while (currentDistance < totalDis) {
			if (data[currentDay] == 0) {
				currentDistance = currentDistance + x;
			} else {
				currentDistance = currentDistance + data[currentDay];
			}
			currentDay++;
			// System.out.println(currentDistance);
		}
		// System.out.println(currentDay-1);

	}

}
