package hack;

import java.util.Scanner;

public class Ciel_and_A_B_Problem
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int ans = a-b;
		
		if(ans%10==9)
			ans=ans-1;
		else
			ans = ans+1;
		System.out.println(ans);
		
		
		
		
	}

}
