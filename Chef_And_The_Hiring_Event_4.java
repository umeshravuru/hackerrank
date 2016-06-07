package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Chef_And_The_Hiring_Event_4
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		ArrayList<Long> ans = new ArrayList<>();

		ans.add((long) 0);
		ans.add((long) 2);
		ans.add((long) 4);
		ans.add((long) 6);
		ans.add((long) 8);
		
		long add = 0;
		for (long i = 1; i < (long) Math.pow(10, 12); i++)
		{
			if (ans.size() > 100)
				break;
			for (int j = 0; j < 6; j++)
			{
				long tem = ans.get(ans.size() - 1);
				String tem_str = String.valueOf(tem);
				String ones = "";
				for(int ii=0;ii<tem_str.length();ii++)
				{
					ones = ones + "1";
				}
				long tem_div = Long.parseLong(ones);
				if (tem % Long.parseLong(ones) == 0)
				{
					add++;
					tem = (long) (tem + (long) Math.pow(10, add) + (long) 2);
					ans.add(tem);
					break;
				} else
				{
					if (tem % 10 == 8)
					{
						tem = tem + ((long) Math.pow(10, add) + (long) 2);
						ans.add(tem);
						break;
					} else
					{
						tem = tem + 2;
						ans.add(tem);
					}
				}
			}

		}
		System.out.println(ans);

	}

}
