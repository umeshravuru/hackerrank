package hack;

import java.util.Scanner;

public class The_Ultimate_Question {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a+b+c==42)
			System.out.println(a+"+"+b+"+"+c);
		else if(a+b*c==42)
			System.out.println(a+"+"+b+"*"+c);
		else if(a*b*c==42)
			System.out.println(a+"*"+b+"*"+c);
		else if(a*b+c==42)
			System.out.println(a+"*"+b+"+"+c);
		else
			System.out.println("This is not the ultimate question");
		
		
		s.close();
		

	}

}
