package hack;

import java.util.Scanner;

public class Compare_the_Triplets
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		
		int a1=s.nextInt();
		int a2=s.nextInt();
		int a3=s.nextInt();
		
		int b1=s.nextInt();
		int b2=s.nextInt();
		int b3=s.nextInt();
		
		int ans1 =0;
		int ans2 =0;
		
		
		if(a1>b1)
			ans1++;
		else if(a1<b1)
			ans2++;
		
		
		if(a2>b2)
			ans1++;
		else if(a2<b2)
			ans2++;
		
		if(a3>b3)
			ans1++;
		else if(a3<b3)
			ans2++;
		
		
		System.out.println(ans1+" "+ans2);
	}

}
