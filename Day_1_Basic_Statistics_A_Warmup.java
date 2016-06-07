package beer_night;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day_1_Basic_Statistics_A_Warmup
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] data = new int[t];
		Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
		int sum = 0;
		for (int i = 0; i < t; i++)
		{
			data[i] = s.nextInt();
			sum = sum + data[i];
			if (freq.get(data[i]) == null)
				freq.put(data[i], 1);
			else
				freq.put(data[i], freq.get(data[i]) + 1);

		}
		float mean = (float)sum / t;
		System.out.printf("%.1f", mean);
		System.out.println("");
		Arrays.sort(data);
		float median = 0;
		if (t % 2 == 0)
			median =(float) (data[t / 2] + data[(t - 1) / 2]) / 2;
		else
			median = (float)data[t / 2];
		System.out.printf("%.1f", median);
		System.out.println("");
		int mode = 0;
		int tem = 0;
		for (int key : freq.keySet())
		{
			if (freq.get(key) > tem)
			{
				tem = freq.get(key);
				mode = key;
			}
			else if(freq.get(key)==tem)
			{
				if(key<mode)
					mode = key;
			}
		}
		System.out.println(mode);
		float var = 0;
		float var_sum = 0;

		for (int i = 0; i < t; i++)
		{
			var_sum = var_sum + (data[i] - mean) * (data[i] - mean);
		}
		var_sum = var_sum / t;
		var = (float) Math.sqrt(var_sum);
//		System.out.printf("%.1f", var);
		System.out.println(var);

	}

}
