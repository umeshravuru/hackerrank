package Hackerrank;

import java.util.Scanner;

public class Java_Output_Formatting
{

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=s.next();
            int x=s.nextInt();
            System.out.print(s1);
            for(int j =0;j<15-s1.length();j++)
            {
            	System.out.print(" ");
            }
            String s2 = String.valueOf(x);
            for(int j =0;j<3-s2.length();j++)
            {
            	System.out.print("0");
            }
            System.out.print(x);
        System.out.println();
        
        }
        System.out.println("================================");
		
		
	}

}
