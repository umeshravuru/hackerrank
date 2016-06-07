package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Detect_the_domain_name
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		String[] data = new String[t];
		for (int i = 0; i < t; i++)
		{
			data[i]=s.nextLine();
					
		}
		
		
		sort(data);

	}

	public static void sort(String[] dat1)
	{
//		System.out.println(dat1[0]);
		String [] arr = dat1;
		ArrayList<String> ans = new ArrayList<String>();
		for (int ii = 0; ii < arr.length; ii++)
		{

			String data = arr[ii];
			if (data.contains("www."))
			{
				String[] data1 = data.split("www.");
//				System.out.println(data1[1]);
				for (int i = 1; i < data1.length; i++)
				{
					String[] data2 = data1[i].split("/");
					ans.add(data2[0]);
				}

			} else if (data.contains("ww2."))
			{
				String[] data1 = data.split("ww2.");
				for (int i = 1; i < data1.length; i++)
				{
					String[] data2 = data1[i].split("/");
					ans.add(data2[0]);
				}

			}
			if (data.contains("web."))
			{
				String[] data1 = data.split("web.");
				for (int i = 1; i < data1.length; i++)
				{
					String[] data2 = data1[i].split("/");
					ans.add(data2[0]);
				}

			}

			// System.out.println(ans);
		}
		String[] final_ans = new String[ans.size()];
		for (int i = 0; i < ans.size(); i++)
		{
			final_ans[i] = ans.get(i);
		}

		Arrays.sort(final_ans);
		for (int i = 0; i < final_ans.length-1; i++)
		{
			if(final_ans[i].equals(final_ans[i+1]))
			{
				
			}
			else
				System.out.print(final_ans[i] + ";");
		}

	}

}
