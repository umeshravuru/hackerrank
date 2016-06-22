package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Beautiful_Quadruples_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int data[] = new int[4];
		data[0] = s.nextInt();
		data[1] = s.nextInt();
		data[2] = s.nextInt();
		data[3] = s.nextInt();
		Arrays.sort(data);

		Map<Integer, Integer> data1 = new HashMap<Integer, Integer>();
		int sum1 =0;
		for (int i = 1; i <= data[0]; i++)
		{
			for (int j = i; j <= data[1]; j++)
			{
				if(data1.get((i^j))==null)
					data1.put((i^j),1);
				else
					data1.put((i^j), data1.get((i^j))+1);
				
				sum1++;
			}
		}
		
		Map<Integer, Integer> data2 = new HashMap<Integer, Integer>();
		int sum2=0;
		for (int i = 1; i <= data[2]; i++)
		{
			for (int j = i; j <= data[3]; j++)
			{
				if(data2.get((i^j))==null)
					data2.put((i^j),1);
				else
					data2.put((i^j), data2.get((i^j))+1);
				
				sum2++;
			}
		}
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(sum1+" "+sum2);
		long final_ans =0;
		for(int i =1;i<=10;i++)
		{
			if(data1.get(i)!=null)
				final_ans = final_ans + ((data1.get(i))*(sum2));
			if(data2.get(i)!=null)
				final_ans = final_ans + ((data2.get(i))*(sum1));
			System.out.println(final_ans);
		}
		
		System.out.println(final_ans);
		
		
		
	}

}
