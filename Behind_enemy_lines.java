package practice;

import java.util.HashMap;
import java.util.Map;

public class Behind_enemy_lines {

	public static void main(String[] args) {

	}

	public static int sol(int n, int m, String data1, String data2) {
		int ans = 0;
		HashMap<Integer, Integer> data1_map = new HashMap<>();
		HashMap<Integer, Integer> data2_map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int now = (int) data1.charAt(i);
			if (data1_map.get(now) == null)
				data1_map.put(now, 1);
			else
				data1_map.put(now, data1_map.get(now) + 1);

			now = (int) data2.charAt(i);
			if (data2_map.get(now) == null)
				data2_map.put(now, 1);
			else
				data2_map.put(now, data2_map.get(now) + 1);

		}
		if (check(data1_map, data2_map))
			ans++;

		for (int i = n; i < m; i++) {
			int now = (int) data2.charAt(i);
			if (data2_map.get(now) == null)
				data2_map.put(now, 1);
			else
				data2_map.put(now, data2_map.get(now) + 1);

			now = (int) data2.charAt(i - n);
			data2_map.put(now, data2_map.get(now) - 1);

			if (check(data1_map, data2_map))
				ans++;
		}

		return ans;
	}

	public static boolean check(HashMap<Integer, Integer> data1, HashMap<Integer, Integer> data2) {
		for (int key : data1.keySet()) {
			if (data1.get(key) != data2.get(key))
				return false;
		}
		return true;

	}

}
