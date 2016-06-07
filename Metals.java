package hack;

import java.util.HashMap;
import java.util.Map;

public class Metals
{

	public static void main(String[] args)
	{

		int data [] = {26,103,59};
		System.out.println(max_fun(100, 10, data));
		
		
		
	}

	public static int max_fun(int a, int b, int data[])
	{

		Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
		for (int i = 0; i < data.length; i++)
		{
			freq.put(data[i], 1);
		}
			int max =-1;
			System.out.println(freq);
		for (Integer key : freq.keySet())
		{
			int now = key;
			
			int selling = 0;
			int cut = 0;
			for (int i = 0; i < data.length; i++)
			{
				selling = selling + ((data[i] / now) * b);
				if (data[i] % now == 0)
					cut = cut + (((data[i] / now) - 1) * a);
				else
					cut = cut + (((data[i] / now)) * a);
				System.out.println(selling+" "+cut);
			}
			if(selling-cut>max)
				max = selling-cut;
System.out.println("");
		}

		return max;
	}

}
