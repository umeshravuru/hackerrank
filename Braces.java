/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.ArrayList;
import java.util.Scanner;

/**

 */
public class Braces
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String[] tem = new String[n];
		for (int i = 0; i < n; i++)
		{
			tem[i] = s.nextLine();
		}
		// System.out.println(sol(tem));
		sol(tem);

	}

	public static String[] sol(String[] data)
	{
		String ans[] = new String[data.length];
		for (int ii = 0; ii < data.length; ii++)
		{
			int che = 0;
			String now = data[ii];
			ArrayList<Character> que = new ArrayList<>();
			for (int i = 0; i < now.length(); i++)
			{
				if (now.charAt(i) == '(' || now.charAt(i) == '['
						|| now.charAt(i) == '{')
				{
					que.add(now.charAt(i));
				} else
				{
					if (que.size() == 0)
					{
						che = 1;
						break;
					}
					if (now.charAt(i) == ')')
					{
						if (que.get(que.size() - 1) != '(')
						{
							che = 1;
							break;
						} else
							que.remove(que.size() - 1);
					} else if (now.charAt(i) == '}')
					{
						if (que.get(que.size() - 1) != '{')
						{
							che = 1;
							break;
						} else
							que.remove(que.size() - 1);
					} else if (now.charAt(i) == ']')
					{
						if (que.get(que.size() - 1) != '[')
						{
							che = 1;
							break;
						} else
							que.remove(que.size() - 1);
					}
				}
			}
			if (che == 1)
				ans[ii] = "NO";
			else
			{
				if(que.size()==0)
				ans[ii] = "YES";
				else
					ans[ii]="NO";
			}

			System.out.println(ans[ii]);
		}

		return ans;
	}

}
