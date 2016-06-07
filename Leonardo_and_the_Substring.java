package hack;

import java.util.Scanner;

public class Leonardo_and_the_Substring
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int t =Integer.parseInt(s.nextLine());
		
		for(int  i =0;i<t;i++)
		{
			long ans =0;
			String data = s.nextLine();
			for(int  j =0;j<=data.length()-1;j++)
			{
				for(int  k =j+1;k<=data.length();k++)
				{
					if(data.substring(j, k).contains("00")||data.substring(j, k).contains("11"))
					{
//						System.out.println(data.substring(j,k));
					}
					else
					{
						ans++;
//						System.out.println(data.substring(j,k));
					}
				}
			}
		
			System.out.println(ans);
			
			
		}
	}

}
