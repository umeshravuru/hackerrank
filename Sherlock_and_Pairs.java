package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sherlock_and_Pairs
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();
		for(long ii=0;ii<t;ii++)
		{
			long n = s.nextLong();
			Map<Long, Long> freq = new HashMap<>();
			for(long i=0;i<n;i++)
			{
				long now = s.nextLong();
				if(freq.get(now)==null)
					freq.put(now, (long)1);
				else
					freq.put(now, freq.get(now)+1);
			}
			long final_Ans =0;
			for(long key : freq.keySet())
			{
				long val = freq.get(key);
				if(val>1)
				final_Ans = final_Ans + (long)(val*(val-1));
			}
			
			System.out.println(final_Ans);
				
		}

	}

}
