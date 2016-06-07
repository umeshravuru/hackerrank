package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Hidden_Password
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		String a = data.split(" ")[0];
		String b = data.split(" ")[1];
		
		int current_j=0;
		int fail = 0;
		while(current_j<b.length() && a.length()>0)
		{
			if(a.contains(String.valueOf(b.charAt(current_j))))
			{
				if(a.charAt(0)==b.charAt(current_j))
				{
					if(a.length()==1)
						a="";
					else
						a=a.substring(1,a.length());
					current_j++;
				}
				else
				{
					fail =1;
					break;
				}
			}
			else
			{
				current_j++;
			}
			
//			System.out.println(a+" "+current_j);
//			
		}
		if(a.length()>0)
			fail=1;
		
		if(fail==1)
			System.out.println("FAIL");
		else
			System.out.println("PASS");
		
		
	}

}
