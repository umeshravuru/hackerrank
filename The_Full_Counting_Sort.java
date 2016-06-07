package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class The_Full_Counting_Sort
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
		String data_num[] = new String[n];
		String data_str[] = new String[n];

		for (int i = 0; i < n; i++)
		{
			String tem = s.nextLine();
			String temp[] = tem.split(" ");
			data_num[i] = temp[0];
			data_str[i] = temp[1];

		}

		for (int i = 0; i < n; i++)
		{

			int che = 0;
			for (int j = 0; j < ans.size(); j++)
			{
				String now = ans.get(j).get(0);
				if (Integer.parseInt(now) == Integer.parseInt(data_num[i]))
				{
					if (i >= n / 2)
					{
						ans.get(j).add(data_str[i]);
					} else
						ans.get(j).add("-");
					che = 1;
					break;
				}
			}
			if (che == 0)
			{
				ArrayList<String> temmmm = new ArrayList<>();

				temmmm.add(data_num[i]);
				if (i >= n / 2)
					temmmm.add(data_str[i]);
				else
					temmmm.add("-");
				int che1 = 0;
				for (int k = 0; k < ans.size(); k++)
				{
					String noww = ans.get(k).get(0);
					if (Integer.parseInt(noww) > Integer.parseInt(data_num[i]))
					{
						ans.add(k, temmmm);
						che1 = 1;
						break;
					}
				}
				if (che1 == 0)
					ans.add(temmmm);
			}

		}
		for (int i = 0; i < ans.size(); i++)
		{
			for (int k = 1; k < ans.get(i).size(); k++)
			{
				System.out.print(ans.get(i).get(k)+" ");
			}
		}
//		System.out.println(ans);

	}

}
