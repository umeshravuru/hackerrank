package hack;

import java.util.Scanner;

public class Ann_and_Jimmy
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		
		int n=s.nextInt();
		int a=(n-(n%3))/3;
		int b=(n-(n%3))/3;
		int c=(n-(n%3))/3;
		
		if(n%3==1)
		{
			a++;
		}
		if(n%3==2)
		{
			a++;
			b++;
		}
		
		
		System.out.println(a*b*c);
		
		

	}

}
