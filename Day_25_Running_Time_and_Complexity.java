package hack;

import java.util.Scanner;

public class Day_25_Running_Time_and_Complexity {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int t = s.nextInt();
	for(int i=0;i<t;i++)
	{
		long n=s.nextLong();
		int check=0;
		for(long j=2;j<=Math.sqrt(n)+1;j++)
		{
			if(n%j==0)
			{
				check=1;
				break;
			}
		}
		if(n==1)
			check=1;
		if(check==0)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
	}
	

	}

}
