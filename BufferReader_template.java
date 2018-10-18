package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader_template {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader br = new BufferedReader(new FileReader(
				"/Users/UXR08UQ/Desktop/testData.txt"));

		int t = Integer.parseInt(br.readLine());

		for (int ii = 0; ii < t; ii++) {
			int n = Integer.parseInt(br.readLine());
			int data[] = new int[n];
			for (int i = 0; i < n; i++) {
				data[i] = Integer.parseInt(br.readLine());
			}
			disp(data);
		}

	}

	public static void disp(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
