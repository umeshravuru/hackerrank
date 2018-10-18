package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class A_puzzle_game {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		// BufferedReader br = new BufferedReader(new
		// // InputStreamReader(System.in));

		BufferedReader br = new BufferedReader(new FileReader(
				"/Users/UXR08UQ/Desktop/testData.txt"));

		// int t = Integer.parseInt(br.readLine());
		Set<Integer> prime = new HashSet<Integer>();
		prime.add(2);
		prime.add(3);
		prime.add(5);
		prime.add(7);
		prime.add(11);
		prime.add(13);
		prime.add(17);
		
		
		for (int i = 1; i < 9; i++) {
			for (int j = i+1; j < 10; j++) {
				if(prime.contains(i+j)){
					System.out.println(i+" "+j +"="+(i+j));
				}
			}
		}

	}
	
}
