package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class touchscreenkeyboard
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());

		Map<Character, Integer> x = new HashMap<Character, Integer>();
		Map<Character, Integer> y = new HashMap<Character, Integer>();

		String a1 = "qwertyuiop";
		String a2 = "asdfghjkl";
		String a3 = "zxcvbnm";

		for (int i = 0; i < 26; i++)
		{
			if (a1.contains(String.valueOf((char) (97 + i))))
			{
				x.put((char) (97 + i), 1);
				int ind = 0;
				for (int j = 0; j < a1.length(); j++)
				{
					if ((char) (97 + i) == a1.charAt(j))
					{
						ind = j;
						break;
					}
				}
				y.put((char) (97 + i), ind);
			} else if (a2.contains(String.valueOf((char) (97 + i))))
			{
				x.put((char) (97 + i), 2);
				int ind = 0;
				for (int j = 0; j < a2.length(); j++)
				{
					if ((char) (97 + i) == a2.charAt(j))
					{
						ind = j;
						break;
					}
				}
				y.put((char) (97 + i), ind);
			} else
			{
				x.put((char) (97 + i), 3);
				int ind = 0;
				for (int j = 0; j < a3.length(); j++)
				{
					if ((char) (97 + i) == a3.charAt(j))
					{
						ind = j;
						break;
					}
				}
				y.put((char) (97 + i), ind);
			}

		}

//		System.out.println(x);
//		System.out.println(y);

		for (int ii = 0; ii < t; ii++)
		{
			String data1 = s.nextLine();
			String[] data = data1.split(" ");
			int n = Integer.parseInt(data[1]);
			int[] dis = new int[n];
			String[] name = new String[n];
			for (int i = 0; i < n; i++)
			{
				name[i] = s.nextLine();
				for (int j = 0; j < name[i].length(); j++)
				{
					dis[i] = dis[i] + Math.abs(x.get(name[i].charAt(j))
							- x.get(data[0].charAt(j)));
					dis[i] = dis[i] + Math.abs(y.get(name[i].charAt(j))
							- y.get(data[0].charAt(j)));
				}
				// System.out.println(dis[i]);
			}

			for (int i = 0; i < n - 1; i++)
			{
				for (int j = i + 1; j < n; j++)
				{
					if (dis[i] > dis[j])
					{
						int tem = dis[i];
						dis[i] = dis[j];
						dis[j] = tem;

						String temp = name[i];
						name[i] = name[j];
						name[j] = temp;
					} else if (dis[i] == dis[j])
					{
						if(big(name[i],name[j]))
						{
							String temp = name[i];
							name[i] = name[j];
							name[j] = temp;
						}
						else
						{
							
						}
					}
				}
			}
			for (int i = 0; i < n; i++)
			{
				System.out.println(name[i] + " " + dis[i]);
			}

		}

	}
	
	public static boolean big(String a, String b)
	{
		for(int i =0;i<a.length();i++)
		{
			if(a.charAt(i)>b.charAt(i))
				return true;
			else if(a.charAt(i)<b.charAt(i))
				return false;
				
		}
		
		return true;
	}

}
