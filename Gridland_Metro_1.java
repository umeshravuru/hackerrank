/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class Gridland_Metro_1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int r = s.nextInt();
		long ans = n * m;
		Map<Integer, ArrayList<int[]>> data = new HashMap<>();
		for (int i = 0; i < r; i++)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			if (data.get(a) == null)
			{
				ArrayList<int[]> tem = new ArrayList<>();
				int tem_arr[] = new int[2];
				tem_arr[0] = b;
				tem_arr[1] = c;
				tem.add(tem_arr);
				data.put(a, tem);
			} else
			{
				ArrayList<int[]> tem = new ArrayList<>();
				int tem_arr[] = new int[2];
				for (int j = 0; j < data.get(a).size(); j++)
				{
					if (data.get(a).get(j)[1] <= b)
					{
						int pass[] =
						{b, c};
						int here[] = merge(data.get(a).get(j), pass);
					}
				}

			}

		}

	}
	public static int[] merge(int[] data1, int[] data2)
	{
		int ans[] = new int[2];
		if (data1[0] > data2[0])
		{
			int tem = data1[0];
			data1[0] = data2[0];
			data2[0] = tem;
			tem = data1[1];
			data1[1] = data2[1];
			data2[1] = tem;
		}

		ans[0] = data1[0];
		if (data1[1] >= data2[0])
		{
			ans[1] = data2[1];
		} else
		{
			ans[0] = 0;
			ans[1] = 0;
		}

		return ans;
	}

}
