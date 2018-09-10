package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class ConvertNumberToString {

	public static void main(String[] args) throws IOException {

		String number = "5732222344";

		String[] s0 = { "" };
		String[] s1 = { "" };
		String[] s2 = { "A", "B", "C" };

		String[] s3 = { "D", "E", "F" };
		String[] s4 = { "G", "H", "I" };
		String[] s5 = { "J", "K", "L" };

		String[] s6 = { "M", "N", "O" };
		String[] s7 = { "P", "Q", "R", "S" };
		String[] s8 = { "T", "U", "V" };

		String[] s9 = { "W", "X", "Y", "Z" };

		String ans = "";
		Map<Character, String[]> mapper = new HashMap<Character, String[]>();
		mapper.put('0', s0);
		mapper.put('1', s1);
		mapper.put('2', s2);

		mapper.put('3', s3);
		mapper.put('4', s4);
		mapper.put('5', s5);

		mapper.put('6', s6);
		mapper.put('7', s7);
		mapper.put('8', s8);

		mapper.put('9', s9);
		File file = new File(
				"/Users/UXR08UQ/Desktop/phoneNumberToString/10LetterWords.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		Set<String> wordsSet = new HashSet<String>();
		while ((st = br.readLine()) != null) {
			// System.out.println(st);
			wordsSet.add(st);
		}

		for (int i0 = 0; i0 < mapper.get(number.charAt(0)).length; i0++) {
			for (int i1 = 0; i1 < mapper.get(number.charAt(1)).length; i1++) {
				for (int i2 = 0; i2 < mapper.get(number.charAt(2)).length; i2++) {
					for (int i3 = 0; i3 < mapper.get(number.charAt(3)).length; i3++) {
						for (int i4 = 0; i4 < mapper.get(number.charAt(4)).length; i4++) {
							for (int i5 = 0; i5 < mapper.get(number.charAt(5)).length; i5++) {
								for (int i6 = 0; i6 < mapper.get(number
										.charAt(6)).length; i6++) {
									for (int i7 = 0; i7 < mapper.get(number
											.charAt(7)).length; i7++) {
										for (int i8 = 0; i8 < mapper.get(number
												.charAt(8)).length; i8++) {
											for (int i9 = 0; i9 < mapper
													.get(number.charAt(9)).length; i9++) {

												ans = mapper.get(number
														.charAt(0))[i0]
														+ mapper.get(number
																.charAt(1))[i1]
														+ mapper.get(number
																.charAt(2))[i2]
														+ mapper.get(number
																.charAt(3))[i3]
														+ mapper.get(number
																.charAt(4))[i4]
														+ mapper.get(number
																.charAt(5))[i5]
														+ mapper.get(number
																.charAt(6))[i6]
														+ mapper.get(number
																.charAt(7))[i7]
														+ mapper.get(number
																.charAt(8))[i8]
														+ mapper.get(number
																.charAt(9))[i9];
//												if (wordsSet.contains(ans))
													System.out.println(ans);
											}
										}
									}
								}
							}
						}
					}
				}

			}

		}
		System.out.println();

	}

}
