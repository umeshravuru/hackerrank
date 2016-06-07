package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Chef_And_The_Hiring_Event_1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int index =1;
		int n = 10000;
		for (int ii = 0; ii < n; ii++)
		{
			int now = ii;
			String now_string = String.valueOf(now);
			int total_number = (int) (Math.pow(2, now_string.length()));
			long sum = 0;
			for (int i = 1; i < total_number; i++)
			{
				ArrayList<Character> temp = new ArrayList<Character>();
				String binary_string = Integer.toBinaryString(i);
				for (int j = binary_string.length() - 1; j >= 0; j--)
				{
					if (binary_string.charAt(j) == '1')
					{
						// System.out.print(j+" ");
						temp.add(now_string
								.charAt(binary_string.length() - 1 - j));
					}
				}

//				System.out.println(temp);
				long prod = 1;
				for (int k = 0; k < temp.size(); k++)
				{
					prod = prod * Integer.parseInt(String.valueOf(temp.get(k)));
				}
				sum = sum + prod;
			}

			if (sum % 2 == 0)
			{
				System.out.print(now+" ");
//				System.out.println(index+" "+now);
				index++;
			}

		}

	}

}
