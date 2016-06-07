package hack;

import java.util.Scanner;

public class Day_28_RegEx_Patterns_and_Intro_to_Databases
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int t =Integer.parseInt(s.nextLine());
		
		for(int ii=0;ii<t;ii++)
		{
			String data = s.nextLine();
			int check1=0;
			int check2=0;
			
			for(int i=0;i<data.length();i++)
			{
				if(data.charAt(i)=='(')
					check1++;
				if(data.charAt(i)==')')
					check1--;
				if(data.charAt(i)=='[')
					check2++;
				if(data.charAt(i)==']')
					check2--;
			}
			
			if(check1==0 && check2==0)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
			
			
		}
		
		
		
		
	}

}
