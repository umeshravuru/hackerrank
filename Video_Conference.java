package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Video_Conference {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new FileReader(
				"/Users/UXR08UQ/Desktop/testData.txt"));

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		Map<String, Integer> mapper = new HashMap<String, Integer>();
		Map<String, Integer> freq = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String data = br.readLine();
			if (freq.containsKey(data)) {
				freq.put(data, freq.get(data) + 1);
				System.out.println(data + " " + freq.get(data));
			} else {
				freq.put(data, 1);

				int index = 0;
				for (int j = 0; j < data.length(); j++) {
					if (mapper.get(data.substring(0, j + 1)) == null) {
						System.out.println(data.substring(0, j + 1));
						index = j;
						break;
					}
					// System.out.println(data.substring(0,j+1));
				}

				for (int j = index; j < data.length(); j++) {
					mapper.put(data.substring(0, j + 1), 1);
				}

//				System.out.println(mapper);
			}
		}

	}

}
