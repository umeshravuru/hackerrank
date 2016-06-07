package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class sub_palindrome
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		ArrayList<String> ans = new ArrayList<String>(); 
		for(int i =0;i<data.length();i++)
		{
			for(int j =i+1;j<data.length()+1;j++)
			{
				int che=0;
				for(int k=0;k<ans.size();k++)
				{
					if(ans.get(k).equals(data.substring(i,j)))
					{
						che=1;
						break;
					}
					
				}
				if(che==0)
				{
				if(palin(data.substring(i,j)))
				{
					ans.add(data.substring(i,j));
				}
				}
			}
		}
		System.out.println(ans.size());
//		System.out.println(palin("abc"));
		
		
	}
	
	public static boolean palin(String data)
	{
		int chec = 0;
		for (int i = 0; i < data.length() / 2; i++)
		{
			if (data.charAt(i) != data.charAt(data.length() - 1 - i))
			{
				return false;
			}
		}

		return true;

	}

}
