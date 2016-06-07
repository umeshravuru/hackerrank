package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Log_analysi
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		String data = "";
		int ans1 = 0;
		int ans2 = 0;
		int ans3 = 0;
		int ans4 = 0;
		int ans5 = -10000000;
		// String [] ans33= new String [1000];
		// String [] ans44= new String [1000];
		Map<String, Integer> ans33 = new HashMap<String, Integer>();
		Map<String, Integer> ans44 = new HashMap<String, Integer>();

		while (s.hasNext())
		{
			data = s.nextLine();
			if (data.contains("INFO") || data.contains("WARN"))
			{

			} else
			{
				data = s.nextLine();
			}
			if (data.substring(0, 4).equals("INFO"))
				ans1++;
			else
				ans2++;
			String temp = "";
			int temp1 = 0;
			for (int i = 0; i < data.length() - 1; i++)
			{
				if (data.charAt(i) == 's' && data.charAt(i + 1) == 'n')
				{
					temp1 = i;
					break;
				}
			}

			for (int i = temp1 + 6; i < temp1 + 38; i++)
			{
				temp = temp + data.charAt(i);
			}
			// ans33[ans3]=temp;
			ans33.put(temp, 1);
			// ans3++;

			temp = "";
			temp1 = 0;

			for (int i = 0; i < data.length() - 1; i++)
			{
				if (data.charAt(i) == 's' && data.charAt(i + 1) == 'i')
				{
					temp1 = i;
					break;
				}
			}

			for (int i = temp1 + 6; i < temp1 + 22; i++)
			{
				temp = temp + data.charAt(i);
			}
			// ans44[ans4] = temp;
			// ans4++;
			ans44.put(temp, 1);

			temp = "";
			temp1 = 0;

			for (int i = 0; i < data.length() - 1; i++)
			{
				if (data.charAt(i) == 's' && data.charAt(i + 1) == 's')
				{
					temp1 = i;
					break;
				}
			}

			for (int i = temp1 + 5; i < data.length(); i++)
			{
				if (data.charAt(i) == ',')
					break;
				temp = temp + data.charAt(i);
			}
			if (ans5 < Integer.parseInt(temp))
				ans5 = Integer.parseInt(temp);

			System.out.println(ans1);
			System.out.println(ans2);
			System.out.println(ans33.size());
			System.out.println(ans44.size());
			System.out.println(ans5);

		}

	}

}
