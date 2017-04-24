package practice;

import java.util.Scanner;

public class Jail_break_in_bhopal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int data[] = new int [c];
		long ans =0;
		for(int i =0;i<c;i++)
		{
			data[i] = s.nextInt();
			
			while(true)
			{
				if(data[i]>0)
					ans = ans +1;
				data[i] = data[i]-a;
				if(data[i]<=0)
					break;
				data[i] = data[i] + b;
			}
		}
		System.out.println(ans);
		
		
	}

}
