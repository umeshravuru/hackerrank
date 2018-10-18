package webScrap.org.webScrap;

import java.util.Scanner;

public class Buying_Everything {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = s.nextInt();
		}

	}

	public static int sol(int data[], int startIndex, int itemsMoretoBuy,
			int speedFactor, int alreadyItems) {
		if (startIndex >= data.length - 1)
			return 0;
		if (itemsMoretoBuy == 0)
			return 0;
		int NextOne = getNextOne(data, startIndex);
		if (NextOne == -1)
			return 0;
		return (NextOne - startIndex) +Math.min(
				sol(data, speedFactor, itemsMoretoBuy, speedFactor,
						alreadyItems),
				sol(data, speedFactor, itemsMoretoBuy, speedFactor,
						alreadyItems));
	}

	public static int getNextOne(int data[], int currentIndex) {
		for (int i = currentIndex + 1; i < data.length; i++) {
			if (data[i] == 1)
				return i;
		}
		return -1;
	}

}
