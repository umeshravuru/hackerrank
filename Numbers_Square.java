package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers_Square {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new FileReader(
				"/Users/UXR08UQ/Desktop/testData.txt"));

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));

		String data = br.readLine();

		int a = Integer.parseInt(data.split(" ")[0]);
		int b = Integer.parseInt(data.split(" ")[1]);

		int ans[][] = new int[a][a];

		ans[0][0] = b;

		for (int i = 1; i < a; i++) {
			for (int j = 0; j < i; j++) {
				b++;
				ans[j][i] = b;
			}
			for (int k = i; k >= 0; k--) {
				b++;
				ans[i][k] = b;
			}
			System.out.println();
		}

		disp(ans);

	}

	public static void disp(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if(data[i][j] < 10)
				System.out.print(" "+data[i][j] + " ");
				else
					System.out.print(data[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}

}
