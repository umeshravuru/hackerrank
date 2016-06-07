package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Team_Formation_1
{

	public static void main(String[] args) throws InterruptedException
	{

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int ii = 0; ii < t; ii++)
		{
			int n = s.nextInt();
			Map<Integer, Integer> data = new HashMap<>();
			for (int i = 0; i < n; i++)
			{
				int now = s.nextInt();
				if (data.get(now) == null)
					data.put(now, 1);
				else
					data.put(now, data.get(now) + 1);
			}
			int min = 100001;
			int size = n;
			while (size > 0)
			{
//				System.out.println("now"+size);
				
				for (int key : data.keySet())
				{
					int tem_min = 0;
					if(size==0)
						break;
					if (data.get(key) != 0)
					{
						int start = key;
						data.put(start, data.get(start) - 1);
						size--;
						int now = start + 1;
						tem_min++;
//						System.out.println(start);
						while (data.get(now) != null)
						{
							if (data.get(now) != 0)
							{
								tem_min++;
								data.put(now, data.get(now) - 1);
								size--;
							} else
								break;
							now++;
						}
						now = start - 1;
						while (data.get(now) != null)
						{
							if (data.get(now) != 0)
							{
								tem_min++;
								data.put(now, data.get(now) - 1);
								size--;
							} else
								break;
							now--;
						}
						if (tem_min < min)
							min = tem_min;
//						System.out.println(tem_min);
					}
//					System.out.println(data);
				
//					Thread.sleep(1000);
				}
//				Thread.sleep(1000);
				

			}
			System.out.println(min);

		}

	}

}
