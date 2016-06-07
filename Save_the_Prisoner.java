package hack;

import java.util.Scanner;

public class Save_the_Prisoner
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i =0;i<t;i++)
		{
			int a =s.nextInt();
			int b =s.nextInt();
			int c =s.nextInt();
			
			b =b+c-1;
			while(b>=a)
			{
				
				b=b-a;
				
			}
			if(b==0)
				b=b+a;
			System.out.println(b);
			

		}
		
		
		
	}

}
