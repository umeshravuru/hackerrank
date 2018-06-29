package coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Minute_to_Win_It {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m = s.nextInt();
		int data[] = new int[n];
		int need[] = new int[n];
		Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			data[i] = s.nextInt();
			need[i] = m * i;
			need[i] = need[i] - data[i];
			if (mapper.get(need[i]) == null)
				mapper.put(need[i], 1);
			else
				mapper.put(need[i], mapper.get(need[i]) + 1);
		}
		disp(data);
		disp(need);
		int max = 0;
		for (Integer key : mapper.keySet()) {
			if (mapper.get(key) > max)
				max = mapper.get(key);
		}
		
		System.out.println(n-max);
//		System.out.println(mapper);

	}

	
	public static void disp(int [] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("");
	}
}
