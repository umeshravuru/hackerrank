package webScrap.org.webScrap;

import java.util.Scanner;
import java.util.TreeSet;

public class kth_largest_element_in_a_stream {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int K = s.nextInt();
		int ans = -1;
		int now = s.nextInt();
		TreeSet<Integer> sorted = new TreeSet<Integer>();
		while (now != 0) {
			sorted.add(now);
			if (sorted.size() < K)
				ans = -1;
			else if(sorted.size() == K){
				ans = sorted.last();
			} else{
				sorted.remove(sorted.last());
				ans = sorted.last();
			}
				System.out.println(sorted);
			System.out.println(ans);
			now = s.nextInt();
		}

	}

}
