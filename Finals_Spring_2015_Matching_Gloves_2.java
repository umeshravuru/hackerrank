package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Finals_Spring_2015_Matching_Gloves_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());

		Map<String, Integer> data1 = new HashMap<String, Integer>();
		Map<String, Integer> data2 = new HashMap<String, Integer>();
		ArrayList<String> data = new ArrayList<String>();
		for (int i = 0; i < n; i++)
		{
			String tem = s.nextLine();
			if (!palin(tem))
			{
				data.add(tem);
				if (data1.get(tem) != null)
				{
					data1.put(tem, data1.get(tem) + 1);
					data2.put(rever(tem), data2.get(rever(tem)) + 1);
				} else
				{
					data1.put(tem, 1);
					data2.put(rever(tem), 1);
				}

			}
//			System.out.println(data);
//			System.out.println(data1);
//			System.out.println(data2);
		}

		if (data1.size() == 0)
		{
			System.out.println("0");
		} else
		{
			int final_ans = 0;
			int check = 0;
//			System.out.println(data);
//			System.out.println(data1);
//			System.out.println(data2);
			for (int i = 0; i < data1.size(); i++)
			{
				if (data.size() == 0)
					break;
				if (data1.get(data.get(i)) == null
						|| data1.get(rever(data.get(i))) == null)
				{
					check = 1;
					break;
				} else
				{
					// String temppp = data1.g

					data1.put(data.get(i), data1.get(data.get(i)) - 1);
					data1.put(rever(data.get(i)), data1.get(rever(data.get(i))) - 1);
					if(data1.get(data.get(i))==0)
					{
					data1.remove(data.get(i));
					data2.remove(rever(data.get(i)));
					}
					if(data1.get(rever(data.get(i)))==0)
					{
					data1.remove(rever(data.get(i)));
					data2.remove(rever(data.get(i)));
					}
					data.remove(i);
					i--;
					final_ans++;
				}
				
				
//				System.out.println(data);
//				System.out.println(data1);
//				System.out.println(data2);
//				
			}
//System.out.println(data);
//			System.out.println(data1);
//			System.out.println(data2);

			if (data1.size() > 0)
				System.out.println("-1");
			else
				System.out.println(final_ans );
		}

	}

	public static String rever(String data1)
	{

		String tem = "";
		for (int i = 0; i < data1.length(); i++)
		{
			tem = tem + data1.charAt(data1.length() - 1 - i);
		}
		return tem;

	}
	public static boolean palin(String data)
	{
		// System.out.println(data);
		int chec = 0;
		for (int i = 0; i < data.length() / 2; i++)
		{
			if (data.charAt(i) != data.charAt(data.length() - 1 - i))
			{
				return false;
			}
		}

		return true;

	}

}
