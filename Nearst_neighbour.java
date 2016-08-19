/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**

 */
public class Nearst_neighbour
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String tem = s.nextLine();
		String tem1[] = tem.split(" ");
		int n = Integer.parseInt(tem1[0]);
		int tem_n = Integer.parseInt(tem1[1]);
		double data[][] = new double[n][2];
		for (int ii = 0; ii < n; ii++)
		{
			tem = s.nextLine();
			tem1 = tem.split(" ");
			data[ii][0] = Double.parseDouble(tem1[0]);
			data[ii][1] = Double.parseDouble(tem1[1]);
		}
		int k = Integer.parseInt(s.nextLine());
		double max = 0;

		ArrayList<Double> distance_arr = new ArrayList<>();
		ArrayList<Integer> distance_index = new ArrayList<>();
		tem = s.nextLine();
		tem1 = tem.split(" ");
		double orig[] = new double[2];
		orig[0] = Double.parseDouble(tem1[0]);
		orig[1] = Double.parseDouble(tem1[1]);

		for (int i = 0; i < n; i++)
		{
			double dis = dist(orig, data[i][0], data[i][1]);
			if (distance_arr.size() == 0)
			{
				max = dis;
				distance_arr.add(dis);
				distance_index.add(i);
			} else
			{
				if (dis < max || distance_arr.size() < k)
				{
					int che =0;
					for(int j=0;k<distance_arr.size();j++)
					{
						if(dis<distance_arr.get(j))
						{
							distance_arr.add(j,dis);
							distance_index.add(j,i);
							che=1;
							break;
						}
					}
					if(che==0)
					{
						distance_arr.add(dis);
						distance_index.add(i);
					}
				}
			}

		}
		
		for(int i =0;i<distance_index.size();i++)
		{
			System.out.println(data[distance_index.get(i)][0]+" "+data[distance_index.get(i)][1]);
		}

	}
	public static double dist(double[] orig, double x, double y)
	{
		double tem = ((orig[0] - x) * (orig[0] - x))
				+ ((orig[1] - y) * (orig[1] - y));
		return Math.sqrt(tem);
	}

}
