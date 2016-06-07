package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Largest_Permutation_1
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		Map<Integer, Integer> data = new HashMap<>();
		int data_tem[] = new int[n];

		for (int i = 0; i < n; i++)
		{
			int lll = s.nextInt();
			data.put(lll, i);
			data_tem[i] = lll;
		}

		int now = n;
		int beginning = 0;
		while(k>0)
		{
			int min = data_tem[beginning];
			int max_index = data.get(now);
			
			if(min<now)
			{
				
			}
			
			
		}
		
		
	}

}
