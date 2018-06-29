package coding;

import java.util.Scanner;

public class Which_Section {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii=0;ii<t;ii++){
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int data[] = new int [c];
			for(int i=0;i<c;i++){
				data[i] = s.nextInt();
			}
			int start = 1;
			int last = data[0];
			int ans = 1;
			int now = 1;
			while(true){
				if(start<=b && b<=last)
					break;
				start = last+1;
				last = start + data[now] -1;
//				System.out.println(start);
//				System.out.println(last);
				now++;
			}
			System.out.println(now);
		}
		
	}

}
