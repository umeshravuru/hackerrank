package webScrap.org.webScrap;

import java.util.Scanner;

public class Exceeding_the_Speed_Limit {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int speed = s.nextInt();
		
		if(speed <= 90)
			System.out.println("0 No punishment");
		else if(speed <= 110 && speed >= 91)
			System.out.println( (speed - 90)*300+" Warning");
		else
			System.out.println((speed - 90)*500+" License removed");
		
	}

}
