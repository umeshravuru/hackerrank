package webScrap.org.webScrap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Cube_loving_Numbers_testing {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<Long> temp = new ArrayList<Long>();
		TreeSet<Long> numbers = new TreeSet();

		for (long a = 2; a <= 1000; a++) {
			for (long b = 1; b <= Math.pow(10, 6) * 125; b++) {
				if (a > 100)
					System.out.println(a);
				long now = a * a * a * b;
				if (now <= Math.pow(10, 9))
					numbers.add(now);
				else
					break;

			}
		}

		System.out.println(numbers.last());

		// for (long i = 1; i <= Math.pow(10, 18); i++) {
		// Iterator<Long> ite = numbers.iterator();
		// while(ite.hasNext()){
		// if()
		// }
		//
		// }

	}

}
