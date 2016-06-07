package hack;

import java.util.Scanner;

public class Expecto_Palindronum_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		int ans=data.length();
		for(int i=0;i<data.length();i++)
		{
			if(!pal(data.substring(0,data.length()-i)))
				ans=data.length()-i-1;
			else
				break;
		}
//		System.out.println(ans);
		System.out.println(2*data.length()-ans);
		
	}
	
	
	public static boolean pal(String data)
	{
//		System.out.println(data);
		for(int i =0;i<data.length()/2;i++)
		{
			if(data.charAt(i)!=data.charAt(data.length()-1-i))
				return false;
		}
		
		
		return true;
	}


}
