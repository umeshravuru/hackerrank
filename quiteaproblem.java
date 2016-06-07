package hack;

import java.util.Scanner;

public class quiteaproblem
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		while (s.hasNext())
		{
			int check = 0;
			String data = s.nextLine();

			char[] data_Arr = data.toCharArray();
			String ans = "";
			for (int i = 0; i < data_Arr.length; i++)
			{
				if (((int) data.charAt(i) >= 65 && (int) data.charAt(i) <= 90)
						|| ((int) data.charAt(i) >= 97
								&& (int) data.charAt(i) <= 122))
				{
					ans = ans + data_Arr[i];
				}
			}
			data = ans;

			for (int i = 0; i < data.length() - 7; i++)
			{

				if (data.charAt(i) == 'P' || data.charAt(i) == 'p')
				{
					if (data.charAt(i + 1) == 'R' || data.charAt(i + 1) == 'r')
					{
						if (data.charAt(i + 2) == 'O'
								|| data.charAt(i + 2) == 'o')
						{
							if (data.charAt(i + 3) == 'B'
									|| data.charAt(i + 3) == 'b')
							{
								if (data.charAt(i + 4) == 'L'
										|| data.charAt(i + 4) == 'l')
								{
									if (data.charAt(i + 5) == 'E'
											|| data.charAt(i + 5) == 'e')
									{
										if (data.charAt(i + 6) == 'M'
												|| data.charAt(i + 6) == 'm')
										{
											System.out.println("yes");
											check = 1;
											break;
										}
									}
								}
							}
						}
					}
				}

			}

			if (check == 0)
				System.out.println("no");

		}

	}

}
