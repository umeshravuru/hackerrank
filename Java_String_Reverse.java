package Hackerrank;

import java.util.Scanner;

public class Java_String_Reverse
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data  = s.nextLine();
		
		int che =0;
		for(int i =0;i<data.length()/2;i++)
		{
			if(data.charAt(i)!=data.charAt(data.length()-1-i))
			{
				che=1;
				break;
			}
		}
		
		if(che==1)
			System.out.println("No");
		else
			System.out.println("Yes");
		
		
		
	}

}
