package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Absolute_Permutation
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++)
		{
			int n = s.nextInt();
			int m = s.nextInt();
			int ans[] = new int[n+1];
			int che = 0;
			Map<Integer, Integer> data = new HashMap<Integer,Integer>();
			for(int i =1;i<=n;i++)
			{
				data.put(i, 1);
			}
			for (int i = 1; i <= n; i++)
			{
//				System.out.println(data);
				int a = i + m;
				int b = i - m;
//				System.out.println(a+" "+b);
				if (a > n && b > 0)
				{
					if(data.get(b)!=null)
					{
					ans[i] = b;
					data.remove(b);
					}
					else
					{
						che=1;
						break;
					}
				}
				else if (a <= n && b <= 0)
				{
					if(data.get(a)!=null)
					{
					ans[i] = a;
					data.remove(a);
					}
					else
					{
						che=1;
						break;
					}
				}
				else if (a <= n && b > 0)
				{	
					if(data.get(Math.min(a, b))!=null)
					{
					ans[i] = Math.min(a, b);
					data.remove(ans[i]);
					}
					else
					{
						ans[i] = Math.max(a, b);
						data.remove(ans[i]);
					}
					
				}
				else
				{
					che = 1;
					break;
				}
			}
			if (che == 1)
				System.out.println("-1");
			else
			{
				for (int i = 1; i <=n; i++)
				{
					System.out.print(ans[i] + " ");
				}
				System.out.println();
			}

		}

	}

}
