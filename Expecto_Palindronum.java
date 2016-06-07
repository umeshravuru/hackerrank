package hack;

import java.util.Scanner;

public class Expecto_Palindronum
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		int now  = 1;
		int che=0;
		if(data.charAt(0)==data.charAt(1))
		{
			data=data.substring(1,data.length());
			che=1;
		}
		while(!pal(data))
		{
			
			
			data=data.charAt(now)+data;
			now++;
			
			
			
		}
		if(che==0)
		System.out.println(data.length());
		else
		System.out.println(data.length()+1);
	}
	
	public static boolean pal(String data)
	{
		System.out.println(data);
		for(int i =0;i<data.length()/2;i++)
		{
			if(data.charAt(i)!=data.charAt(data.length()-1-i))
				return false;
		}
		
		
		return true;
	}

}
