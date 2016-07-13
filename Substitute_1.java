/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Top_Coder;

import java.util.Scanner;

/**

 */
public class Substitute_1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String key = s.nextLine();
		String code = s.nextLine();
		Substitute obj  = new Substitute();
		System.out.println(obj.getValue(key, code));
	
	}

}

class Substitute
{

	public int getValue(String key, String code)
	{

		String ans = "";
		for (int i = 0; i < code.length(); i++)
		{
			for (int j = 0; j < key.length(); j++)
			{
				if(code.charAt(i)==key.charAt(j))
				{
					int tem = 0;
					if(j==9)
						tem=-1;
					else
						tem  = j;
					ans = ans +String.valueOf(tem+1);
				}
				
			}
		}

		return Integer.parseInt(ans);
	}

}
