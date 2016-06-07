package hack;

import java.util.Scanner;

public class Mars_Exploration
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		String data = s.nextLine();
		int ans=0;
		for(int i=0;i<data.length();i=i+3)
		{
//			System.out.println("");
			if(data.charAt(i)!='S')
				ans++;
			if(data.charAt(i+1)!='O')
				ans++;
			if(data.charAt(i+2)!='S')
				ans++;
		}
		
		System.out.println(ans);

	}

}
