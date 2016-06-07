package hack;

import java.util.Scanner;

public class detaileddifferences
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for(int i =0;i<t;i++)
		{
			String data1 = s.nextLine();
			String data2 = s.nextLine();
			String ans ="";
			for(int j=0;j<data1.length();j++)
			{
				if(data1.charAt(j)==data2.charAt(j))
					ans=ans+".";
				else
					ans= ans+"*";
			}
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(ans);
			
		}
		
		
	}

}
