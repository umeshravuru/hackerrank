package beer_night;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Missing_Numbers
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Map<Integer, Integer> data1 = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++)
		{
			int now = s.nextInt();
			if (data1.get(now) == null)
				data1.put(now, 1);
			else
				data1.put(now, data1.get(now) + 1);
		}

		int m = s.nextInt();
		Map<Integer, Integer> data2 = new HashMap<Integer, Integer>();
		for (int i = 0; i < m; i++)
		{
			int now = s.nextInt();
			if (data2.get(now) == null)
			{
				if (data1.get(now) == null)
					data2.put(now, 1);
				else
					data1.put(now, data1.get(now) - 1);
			} else
			{
				if (data1.get(now) == null)
					data2.put(now, data2.get(now) + 1);
				else
					data1.put(now, data1.get(now) - 1);
			}

			if (data1.get(now) != null)
			{
				if (data1.get(now) == 0)
					data1.remove(now);
			}

		}

//		System.out.println(data2);
		ArrayList<Integer> data = new ArrayList<>();
		for (int key : data2.keySet())
		{
			data.add(key);
		}
		for(int i =0;i<data.size();i++)
		{
			for(int j =0;j<data.size()-1;j++)
			{
				if(data.get(j)>data.get(j+1))
				{
					int tem = data.get(j);
					data.set(j, data.get(j+1));
					data.set(j+1, tem);
				}
			}
		}
		
		System.out.print(data.get(0)+" ");
		for(int i=1;i<data.size();i++)
		{
			if(data.get(i)-data.get(0)<101)
				System.out.print(data.get(i)+" ");
			else
				break;
				
		}

	}

}
