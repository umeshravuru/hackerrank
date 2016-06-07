package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Journey_to_the_Moon
{

	public static void main(String[] args)
	{
		
		long Aa=System.currentTimeMillis();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int l = s.nextInt();
		ArrayList<Integer> data = new ArrayList<Integer>();
		// int[] data = new int[n];
		for (int i = 0; i < n; i++)
		{
			data.add(i);
			// data[i] = i;
		}
		for (int i = 0; i < l; i++)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int tempp = data.get(a);
			for (int j = 0; j < n; j++)
			{

				if (data.get(j) == tempp)
				{
					data.set(j, data.get(b));// = data[b];
				}
			}
			// System.out.println(data);
			// System.out.println("end");
		}
		// System.out.println("end");

		// System.out.println(data);
		ArrayList<Integer> ans_before = new ArrayList<Integer>();
		int adder = 1;
		while (data.size() > 0)
		{
			int tem = data.get(0);
			for (int i = 1; i < data.size(); i++)
			{
				if (tem == data.get(i))
				{
					adder++;
					data.remove(i);
					i--;
				}
			}
			data.remove(0);
			ans_before.add(adder);
			adder = 1;
		}
		long ans = 0;

		if (ans_before.size() == 1)
			ans_before.add(0);
		long total_sum = 0;
		for (int i = 0; i < ans_before.size(); i++)
		{
			total_sum=total_sum+ans_before.get(i);
		}
		
		for (int i = 0; i < ans_before.size() - 1; i++)
		{
			ans=ans+ans_before.get(i)*(total_sum-ans_before.get(i));
			total_sum=total_sum-ans_before.get(i);
					
		}

		// System.out.println(ans_before);
		System.out.println(ans);
		long Zz=System.currentTimeMillis();
		System.out.println(Zz-Aa);
		
	}

}
