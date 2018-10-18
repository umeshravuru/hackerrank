package webScrap.org.webScrap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _2N_participants {

	public static void main(String[] args) {

		System.out.println();
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int len = (int) (Math.pow(2, n) - 1);
		int data[][] = new int[len][len];
		for (int i = 0; i < len; i++) {
			String now[] = s.nextLine().split(" ");
			for (int j = 0; j < now.length; j++) {
				data[i][j] = Integer.parseInt(now[j]);
			}

		}
		disp(data);
		ArrayList<Integer> rem = new ArrayList<Integer>();
		for (int j = 1; j <= Math.pow(2, n); j = j + 1) {
			rem.add(j);
		}
		HashMap<Integer, Integer> done = new HashMap<Integer, Integer>();
		done.put(1, 1);
		for (int i = n; i > 0; i--) {
			ArrayList<Integer> rem1 = new ArrayList<Integer>();
			for (int j = 0; j < rem.size(); j = j + 2) {
				int a = rem.get(j);
				int b = rem.get(j + 1);
				System.out.println(a+" "+b+" "+data[a - 1][b - 2]);
				if (data[a - 1][b - 2] == 1)
					rem1.add(b);
				else
					rem1.add(a);

			}
			dispA(rem1);
			rem = new ArrayList<Integer>(rem1);
		}

	}

	public static void disp(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("");
	}
	public static void dispA(ArrayList<Integer> tem) {
		for (int j = 0; j < tem.size(); j = j + 1) {
			System.out.print(tem.get(j)+" ");
		}
		System.out.println();
	}

}
