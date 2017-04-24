package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class hackerrank_election {

	public static void main(String[] args) {

	}

	public static String sol(String[] data) {
		Map<String, Integer> mapper = new HashMap<>();
		int max = -1;
		for (int i = 0; i < data.length; i++) {
			if (mapper.get(data[i]) == null)
				mapper.put(data[i], 1);
			else
				mapper.put(data[i], mapper.get(data[i]) + 1);

			if (mapper.get(data[i]) > max)
				max = mapper.get(data[i]);
		}

		TreeSet<String> final_sort = new TreeSet<>();
		for (String key : mapper.keySet()) {
			if (mapper.get(key) == max) {
				final_sort.add(key);
			}
		}

		return final_sort.last();

	}

}
