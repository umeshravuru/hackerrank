package beer_night;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Adding_words
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		String data1 = s.nextLine();
		Map<String, Integer> dic = new HashMap<String, Integer>();
		while (true)
		{
			if (data1.equals("clear"))
				break;
			else
			{

				String[] data = data1.split(" ");
				if (data[0].equals("def"))
				{
					dic.put(data[1], Integer.parseInt(data[data.length-1]));
				} else if (data[0].equals("calc"))
				{
					int ans = dic.get(data[1]);
					int che=0;
					for (int i = 2; i < data.length-1; i++)
					{
						if (dic.get(data[i + 1]) == null)
						{
								che=1;
								break;
						}

						if (data[i].equals("+"))
							ans = ans + dic.get(data[i + 1]);
						else
							ans = ans - dic.get(data[i + 1]);

						i++;
					}

					if (che==1)
					{
						for(int i =1;i<data.length;i++)
						{
							System.out.print(data[i]+" ");
						}
						System.out.println("unknown");
						
					}
					else
					{
						int che1=0;
						String final_Ans = "unknown";
						for (String key : dic.keySet()) {
							if(dic.get(key)==ans)
							{
								final_Ans = key;
								che1=1;
								break;
							}
							
							
							
//							a[0:len(a)/2]
						}
						for(int i =1;i<data.length;i++)
						{
							System.out.print(data[i]+" ");
						}
							System.out.println(final_Ans);
						
						
					}
				}

			}

			data1 = s.nextLine();
		}
		
//		System.out.println(dic);

	}

}
