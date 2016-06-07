package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Super_Functional_Strings
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < t; ii++)
		{
			String data = s.nextLine();
			Map<String, Integer> data_base = new HashMap<String, Integer>();
			for (int i = 0; i < data.length(); i++)
			{
				for (int j = i + 1; j < data.length() + 1; j++)
				{
					String tem = data.substring(i, j);
					if (data_base.get(tem) == null)
						data_base.put(tem, 1);
				}
			}
			long final_ans = 0;
			for (String key : data_base.keySet())
			{
				int uniq = diff(key);
				//System.out.println(key);
				long tem = mod(mod_pow(key.length(), uniq));
				final_ans =mod( (mod(final_ans)+ mod(tem)));
				
			}
//			System.out.println(mod_pow(2, 10));
//			System.out.println(data_base);
			System.out.println(final_ans);
		}

	}
	public static int diff(String data)
	{
		Map<Character, Integer> data_base = new HashMap<Character, Integer>();
		for (int i = 0; i < data.length(); i++)
		{
			if (data_base.size() == 26)
				break;
			if (data_base.get(data.charAt(i)) == null)
				data_base.put(data.charAt(i), 1);
		}
		return data_base.size();
	}
	public static long mod(long data)
	{
		return (long) (data%(Math.pow(10, 9)+7));
	}
	
	public static long mod_pow(long a,long b)
	{
		long ans =1;
		for(int i =0;i<b;i++)
		{
			ans = mod(mod(ans)*mod(a));
		}
		
		
		
		return mod(ans);
	}
	

}
