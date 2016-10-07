/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.ArrayList;

/**

 */
public class Gridland_Metro_2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

	}

	public static ArrayList<int[]> merger(ArrayList<int[]> data, int[] add)
	{

		if (data.get(data.size() - 1)[1] < add[0])
		{
			data.add(add);
		} else if (data.get(data.size() - 1)[1] == add[0])
		{
			int tem[] = new int[2];
			tem[0] = data.get(data.size() - 1)[0];
			tem[1] = add[1];
			data.set(data.size() - 1, tem);
		} else if (data.get(0)[0] > add[1])
		{
			data.add(0, add);
		} else if (data.get(0)[0] == add[1])
		{
			int tem[] = new int[2];
			tem[1] = data.get(0)[1];
			tem[0] = add[0];
			data.set(0, tem);
		} else
		{
			int che = 0;
			for (int i = 0; i < data.size() - 1; i++)
			{
				if (data.get(i)[1] < add[0] && data.get(i + 1)[0] > add[1])
				{
					data.add(i + 1, add);
					che = 1;
					break;
				}
			}
			if (che == 0)
			{
				int mix1 = -1;
				int mix2 = -1;

				for (int i = 0; i < data.size(); i++)
				{
					if (data.get(i)[1] == add[0] || data.get(i)[0] == add[0])
					{
						mix1 = i;
					}
					if (data.get(i)[1] == add[1] || data.get(i)[0] == add[1])
					{
						mix2 = i;
					}
				}
			}
		}

		return data;
	}

}
