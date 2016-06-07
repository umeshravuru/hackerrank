package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class The_Full_Counting_Sort_1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		Map<Integer, String> data = new HashMap<>();
		String data_num[] = new String[n];
		String data_str[] = new String[n];
		ArrayList<Integer> inc = new ArrayList<>();
		for (int i = 0; i < n; i++)
		{
			String tem = s.nextLine();
			String temp[] = tem.split(" ");
			int now = Integer.parseInt(temp[0]);
			int che2=0;
			for(int j =0;j<inc.size();j++)
			{
				if(now != inc.get(j))
				{
				if(now<inc.get(j))
				{
					inc.add(j,now);
					che2=1;
					break;
				}
				}
				else
				{
					che2=1;
					break;
				}
			}
			if(che2==0)
			{
				inc.add(now);
			}
			String now_Str = "";
			if (data.get(now) != null)
			{
				if (i >= n / 2)
					now_Str = data.get(now) + " " + temp[1];
				else
					now_Str = data.get(now) + " -";

				data.put(now, now_Str);
			}
			else
			{
				if(i>=n/2)
					data.put(now, temp[1]);
				else
					data.put(now,"-");
				
			}
			

		}
//		System.out.println(inc);
//		System.out.println(data);
		for(int i =0;i<inc.size();i++)
		{
			if(data.get(inc.get(i))!=null)
			{
				System.out.print(data.get(inc.get(i))+" ");
			}
		}
		
		
		
		
		
	}

}
