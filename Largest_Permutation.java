package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Largest_Permutation
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
		while (k > 0 && now>0)
		{

			int min = data_tem[beginning];
			int max_index = data.get(now);
			if (min < now)
			{
				data_tem[beginning] = now;
				data_tem[max_index] = min;

				data.put(min, max_index);
				data.put(now, beginning);
				k--;
			}

			beginning++;
			now--;
		}
		
		disp(data_tem);
		

	}
	public static void disp(int [] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}

}
