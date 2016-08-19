/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class List_of_objects
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		Map<Integer, ArrayList<Integer>> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		String[][] map3 = new String[n][3];
		int[][] check = new int[n][n];

		for (int ii = 0; ii < n; ii++)
		{
			String tem = s.nextLine();
			String tem1[] = tem.split(",");
			int userID = Integer.parseInt(tem1[0]);

			if (map1.get(userID) == null)
			{
				ArrayList<Integer> tem_arr = new ArrayList<>();
				tem_arr.add(ii);
				map1.put(userID, tem_arr);
			} else
			{
				ArrayList<Integer> tem_arr = map1.get(userID);
				tem_arr.add(ii);
				map1.put(userID, tem_arr);
			}

			map3[ii][0] = tem1[0];
			map3[ii][1] = tem1[1];
			map3[ii][2] = tem1[2];

			map2.put(userID, 1);

		}
		int max = -1;
		int index = -1;
		for (int i = 0; i < n - 1; i++)
		{
			int tem_max = 0;
			int uID = Integer.parseInt(map3[i][0]);
			for (int key : map2.keySet())
			{
				if (key != uID)
				{
					ArrayList<Integer> tem_arry = map1.get(key);
					double tem_a = Double.parseDouble(map3[i][1]);
					double tem_b = Double.parseDouble(map3[i][2]);
					for (int ii = 0; ii < tem_arry.size(); ii++)
					{
						int tem_che = check[i][tem_arry.get(ii)];
						double tem_c = Double
								.parseDouble(map3[tem_arry.get(ii)][1]);
						double tem_d = Double
								.parseDouble(map3[tem_arry.get(ii)][2]);
						if (tem_che == 0)
						{
							check[i][tem_arry.get(ii)] = dis(tem_a, tem_b,
									tem_c, tem_d);
							check[tem_arry.get(ii)][i] = check[i][tem_arry
									.get(ii)];
						}
						if (check[i][tem_arry.get(ii)] == 1)
						{
							tem_max++;
							break;
						}
					}

				}
			}

			if (max <= tem_max)
			{
				max = tem_max;
				index = i;
			}

		}

		System.out.println(map3[index][1] + " " + map3[index][2]);

	}
	public static int dis(double b, double a, double d, double c)
	{
		double R = 6378.137;
		double dLat = (c - a) * Math.PI / 180;
		double dLon = (d - b) * Math.PI / 180;
		double aa = Math.sin((dLat / 2)) * Math.sin((dLat / 2))
				+ Math.cos(a * Math.PI / 180) * Math.cos(c * Math.PI / 180)
						* Math.sin(dLon / 2) * Math.sin(dLon / 2);
		double cc = 2 * Math.atan2(Math.sqrt(aa), Math.sqrt(1 - aa));
		double dd = R * cc * 1000;
		if (dd <= 200)
		{
			return 1;
		}
		return -1;
	}

}
