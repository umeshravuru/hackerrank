package Code_chef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Paying_up_1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++)
		{
			int n = s.nextInt();
			int m = s.nextInt();
			int in[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				in[i] = s.nextInt();
			}
			Map<Integer, Integer> data = new HashMap<>();
			data.put(in[0], 1);
			
			for(int i =1;i<n;i++)
			{
				ArrayList<Integer> tem = new ArrayList<>();
				for(Integer key : data.keySet())
				{
					if(data.get(in[i]+key)==null)
					{
//						data.put(in[i]*key, 1);
						tem.add(in[i]+key);
					}
				}
				for(int j=0;j<tem.size();j++)
				{
					data.put(tem.get(j), 1);
				}
				data.put(in[i],	 1);
			}
//			System.out.println(data);
			if(data.get(m)!=null)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		
	}

}
