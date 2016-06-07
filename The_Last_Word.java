package hack;

import java.util.Scanner;

public class The_Last_Word
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for(int i =0;i<t;i++)
		{
			String data = s.nextLine();
			String ans = String.valueOf(data.charAt(0));
			for(int j =1;j<data.length();j++)
			{
				if(data.charAt(j)>=ans.charAt(0))
					ans=data.charAt(j)+ans;
				else
					ans = ans+data.charAt(j);
			}
			
			System.out.println("Case #"+(i+1)+": "+ans);
			
		}
		
		
	}

}
