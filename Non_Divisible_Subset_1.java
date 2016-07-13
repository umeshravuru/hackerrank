package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Non_Divisible_Subset_1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k1 = s.nextInt();
		int data[] = new int[n];
		Map<Integer, Integer> freq = new HashMap<>();
		int ans = 0;
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
			int tem = data[i] % k1;
			if (freq.get(tem) == null)
				freq.put(tem, 1);
			else
				freq.put(tem, freq.get(tem) + 1);
			
			
		}
		
		
		for (int i = 1; i <= k1/2; i++)
		{
			if (freq.get(i) != null && freq.get(k1 - i) != null)
			{
				ans =ans+ Math.max(freq.get(i), freq.get(k1-i));
			}
			else if (freq.get(i)!=null)
			{
				ans = ans + freq.get(i) ;
			}
			else if (freq.get(k1-i)!=null)
			{
				ans = ans + freq.get(k1-i) ;
			}
//			System.out.println(ans);
			
		}
		if(ans ==0)
			ans =1;
		System.out.println(ans);
//		System.out.println(freq);

	}

}
