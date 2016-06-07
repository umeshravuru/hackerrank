package hack;

import java.util.Scanner;

public class Sandwitch_sharing
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		for(int i =0;i<t;i++)
		{
			
			int m = s.nextInt();
			int n = s.nextInt();
			
				
			while(m>3 && n>0)
			{
				if(m%2==0)
					m=(m/2)+1;
				else
					m=((m+1)/2)+1;
				
				
				n--;
			}
			System.out.println(m);
			
			
			
		}
		
		
		
	}

}
