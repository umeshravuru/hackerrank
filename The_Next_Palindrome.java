package Code_chef;

import java.util.Scanner;

public class The_Next_Palindrome
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < n; ii++)
		{
			String data = s.nextLine();

			if (data.length() % 2 == 0)
			{
				int tem = 1;
				int che = 0;
				for (int i = data.length() / 2 - 1; i >= 0; i--)
				{
					if (data.charAt(i) < data.charAt(i + tem))
					{
						int now = Integer
								.parseInt(String.valueOf(data.charAt(i)));
						if (now != 9)
						{
							now++;
							data = data.substring(0, i) + String.valueOf(now)
									+ data.substring(i + 1, data.length());
						} else
						{
							if (i != 0)
								data = data.substring(0, i - 1)
										+ String.valueOf(Integer.parseInt(String
												.valueOf(data.charAt(i - 1))))
										+ "0"
										+ data.substring(i + 1, data.length());
							else
								data = data.substring(0, i - 1) + "10"
										+ data.substring(i + 1, data.length());
						}
					}
				}

			}
			System.out.println(data);

		}

	}

}
