package hack;

import java.util.Scanner;

public class String_Diff
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		String a = data.split(" ")[0];
		String b = data.split(" ")[1];
		int ans=0;
		for(int i =0;i<a.length()-b.length()+1;i++)
		{
//			iSystem.out.println(a.substring(i,i+b.length()));
			if(compare(a.substring(i,b.length()+i), b))
				ans++;
		}
		
		System.out.println(ans);
		
	}
	
	public static boolean compare(String a, String b)
	{
		int che=0;
		for(int i =0;i<a.length();i++)
		{
			if(che==2)
				return false;
			if(a.charAt(i)!=b.charAt(i))
				che++;
		}
		
		if (che==1)
			return true;
		else
			return false;
		
		
		
	}

}
