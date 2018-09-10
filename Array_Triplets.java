package webScrap.org.webScrap;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_Triplets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long data[] = new long[n];
		long sum = 0;
		for (int i = 0; i < data.length; i++) {
			data[i] = s.nextLong();
			sum = sum + data[i];
		}
		long final_ans = 0;
		if (sum % 3 == 0) {
			sum = sum / 3;
			for (int i = 0; i < Math.pow(2, data.length); i++) {

				String now = makeFull(Integer.toBinaryString(i), data.length);
				long temSUm = 0;
				for (int j = 0; j < now.length(); j++) {
					if (now.charAt(j) == '1')
						temSUm = temSUm + data[j];
					if(temSUm > sum)
						break;
				}
				if (temSUm == sum) {

					ArrayList<Long> remDig = new ArrayList();
					ArrayList<Integer> remDigMapper = new ArrayList();
					for (int j = 0; j < now.length(); j++) {
						if (now.charAt(j) == '0') {
							remDig.add(data[j]);
							remDigMapper.add(j);
						}
					}

					for (int k = 0; k < Math.pow(2, remDig.size()); k++) {

						String restNow = makeFull(Integer.toBinaryString(k),
								remDig.size());
						// System.out.println(restNow);
						long temSUm1 = 0;
						for (int j = 0; j < restNow.length(); j++) {
							if (restNow.charAt(j) == '1')
								temSUm1 = temSUm1 + remDig.get(j);
							if(temSUm1 > sum)
								break;
						}
						if (temSUm1 == sum) {
							final_ans++;
						}

					}

				}

			}
			System.out.println(final_ans);

		} else
			System.out.println("0");

	}

	public static String makeFull(String now, int n) {
		int nowL = now.length();
		for (int i = 0; i < n - nowL; i++) {
			now = "0" + now;
		}
		return now;
	}

}
