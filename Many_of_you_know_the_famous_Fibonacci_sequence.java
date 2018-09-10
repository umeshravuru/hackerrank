package webScrap.org.webScrap;

import java.util.Scanner;

public class Many_of_you_know_the_famous_Fibonacci_sequence {

	public static void main(String[] args) {
		
		Scanner s =  new Scanner(System.in);
		int  a = s.nextInt();
		int  b = s.nextInt();
		int  c = s.nextInt();
		
		if(c == 1)
			System.out.println(a);
		else if(c == 2)
			System.out.println(b);
		else{
		int ans =0;
		for(int i =3;i<=c;i++){
			ans =a + b;
			a = b;
			b = ans;
		
		}
		System.out.println(ans);
		}
	}

}
