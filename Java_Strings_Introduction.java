package Hackerrank;

import java.util.Scanner;

public class Java_Strings_Introduction
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();
		String data2 = s.nextLine();
		
		System.out.println(data1.length()+data2.length());
		int che=0;
		for(int i =0;i<Math.min(data1.length(), data2.length());i++)
		{
			if(data1.charAt(i)>data2.charAt(i))
			{
				System.out.println("Yes");
				che=1;
				break;
			}
			else if (data1.charAt(i)<data2.charAt(i))
			{
				System.out.println("No");
				che=1;
				break;
			}
		}
		
		if(che==0)
		{
			if(data1.length()>data2.length())
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		
		
		System.out.println(data1.substring(0,1).toUpperCase()+data1.substring(1,data1.length())+" "+data2.substring(0,1).toUpperCase()+data2.substring(1,data2.length()));
		
		
		
		
	}

}
