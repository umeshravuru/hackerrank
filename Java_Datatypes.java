package Hackerrank;

import java.util.Scanner;

public class Java_Datatypes
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		
		for(int ii=0;ii<t;ii++)
		{

			
			
			 try
	            {
	                long now=sc.nextLong();
	                System.out.println(now+" can be fitted in:");
	                if(now<Math.pow(2, 7) && now>=-Math.pow(2, 7))
						System.out.println("* byte");
					if(now<Math.pow(2, 15) && now>=-Math.pow(2, 15))
						System.out.println("* short");
					if(now<Math.pow(2, 31) && now>=-Math.pow(2, 31))
						System.out.println("* int");
					if(now<=Math.pow(2, 63)-1 && now>=-Math.pow(2, 63))
						System.out.println("* long");
	            }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }
			
		}
		
		
		
		
	}

}
