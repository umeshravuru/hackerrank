package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Crossword_Puzzle {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new FileReader(
				"/Users/UXR08UQ/Desktop/testData.txt"));

		char[][] data = new char[10][10];
		for (int i = 0; i < 10; i++) {
			String now = br.readLine();
			for (int j = 0; j < 10; j++) {
				data[i][j] = now.charAt(j);
			}

		}
		String list = br.readLine();

		disp(data);

		ArrayList<String> lists = new ArrayList<String>();
		String[] listlist = list.split(";");
		for (int i = 0; i < listlist.length; i++) {
			lists.add(listlist[i]);
		}
		System.out.println(lists);

		//
		Map<String, Integer> mapperHOR = new HashMap<String, Integer>();
		Map<String, Integer> mapperVER = new HashMap<String, Integer>();

		for (int i = 0; i < 10; i++) {
			int cou = 0;
			for (int j = 0; j < 10; j++) {
				if (data[i][j] == '-') {
					cou++;
				} else {
					String tem = String.valueOf(i) + ","
							+ String.valueOf(j - cou);
					if (cou != 0)
						mapperHOR.put(tem, cou);
					cou = 0;
				}

			}
			if (cou != 0) {
				String tem = String.valueOf(i) + "," + String.valueOf(9 - cou);
				mapperVER.put(tem, cou);
			}

		}

		for (int i = 0; i < 10; i++) {
			int cou = 0;
			for (int j = 0; j < 10; j++) {
				if (data[j][i] == '-') {
					cou++;
				} else {
					String tem = String.valueOf(j - cou) + ","
							+ String.valueOf(i);
					if (cou != 0)
						mapperVER.put(tem, cou);
					cou = 0;
				}

			}
			if (cou != 0) {
				String tem = String.valueOf(10 - cou) + "," + String.valueOf(i);
				mapperVER.put(tem, cou);
			}

		}
		System.out.println(mapperHOR);
		System.out.println(mapperVER);

		disp(helper(data, lists, mapperHOR, mapperVER));
	}

	private static char[][] helper(char[][] data, ArrayList<String> list,
			Map<String, Integer> mapperHOR, Map<String, Integer> mapperVER) {

		if (list.size() == 0)
			return data;
		else {
			int initialLen = list.size();

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (data[i][j] == '-') {
						int now = mapperHOR.get(String.valueOf(i) + ","
								+ String.valueOf(j));

						for (int k = 0; k < list.size(); k++) {
							String listNow = list.get(k);
							if (listNow.length() <= now) {
								int che = 0;
								for (int l = 0; l < now; l++) {
									if (data[i][j + l] == '-')
										data[i][j + l] = listNow.charAt(l);
									else {
										che = 1;
									}
								}
								if (che == 0) {
									list.remove(k);
									mapperHOR.remove(String.valueOf(i) + ","
											+ String.valueOf(j));
									if (listNow.length() < now) {
										int diff = now - listNow.length();
										mapperHOR
												.put(String.valueOf(i)
														+ ","
														+ String.valueOf(j
																+ listNow
																		.length()),
														diff);
									}
									list.remove(k);
									break;
								}
							}

						}

					}
				}
			}
			System.out.println("--------------");
			disp(data);
			System.out.println(list);
			System.out.println(mapperHOR);
			System.out.println(mapperVER);
			System.out.println("--------------");
			if (initialLen != list.size())
				return helper(data, list, mapperHOR, mapperVER);
			else
				return data;

		}

		// return null;
	}

	private static void disp(char[][] data) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}

}
