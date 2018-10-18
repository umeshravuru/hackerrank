package webScrap.org.webScrap;

import java.util.Scanner;

public class Dexter_Problem {

	public static void main(String[] args) {
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int data[][] = new int[n][3];
		for (int i = 0; i < n; i++) {
			String now[] = s.nextLine().split(" ");
			if (now[0].charAt(0) == 'M')
				data[i][0] = 1;
			else
				data[i][0] = 0;
			data[i][1] = Integer.parseInt(now[1]);
			data[i][2] = Integer.parseInt(now[2]);
		}
		int ans = 0;
		for (int i = 1; i <= 366; i++) {
			int m = 0;
			int f = 0;
			for (int j = 0; j < n; j++) {
				if (data[j][1] <= i && data[j][2] >= i) {
					if (data[j][0] == 1)
						m++;
					else
						f++;
				}
			}
			if(Math.min(m, f)>ans)
				ans = Math.min(m, f);
		}
		System.out.println(ans);

	}

}
