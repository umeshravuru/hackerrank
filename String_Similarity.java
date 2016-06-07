package beer_night;

import java.util.Scanner;

public class String_Similarity
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		String data = s.nextLine();
		int ans =data.length();
		for(int i =1;i<=data.length()-1;i++)
		{
			for(int j =0;i+j<data.length();j++)
			{
//				System.out.println(data.substring(beginIndex));
				
				if(data.charAt(j)==data.charAt(j+i))
				{
					ans++;
//					System.out.println(j+" "+(j+i)+ "-"+i);
				}
				else
					break;
			}
		}
		System.out.println(ans);

	}

}
