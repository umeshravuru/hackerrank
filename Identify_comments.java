package hack;

import java.util.Scanner;

public class Identify_comments
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int che=0;
		while (s.hasNext())
		{
			String data = s.nextLine();

			if(che==1)
			{
				if(data.contains("*/"))
				{
					System.out.println(data);
					che=0;
				}
				else
					System.out.println(data);
			}
			else
			{
			if (data.contains("//"))
			{
				for (int i = 0; i < data.length() - 1; i++)
				{
					if (data.charAt(i) == '/' && data.charAt(i + 1) == '/')
					{
						System.out.println(data.substring(i, data.length()));
					}
				}

			} else if (data.contains("/*"))
			{
				if(data.contains("*/"))
				{
					System.out.println(data.trim());
				}
				else
				{
					System.out.println(data.trim());
					che=1;
				}
			}
			}

		}

	}

}
