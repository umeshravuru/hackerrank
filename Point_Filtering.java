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
public class Point_Filtering
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String tem = s.nextLine();
		String tems[] = tem.split(" ");
		int n = Integer.parseInt(tems[0]);
		int b = Integer.parseInt(tems[1]);
		int k[] = new int[n];
		double[][] data = new double[n][3];
		for (int i = 0; i < n; i++)
		{
			tem = s.nextLine();
			tems = tem.split(" ");
			k[i] = Integer.parseInt(tems[0]);
			data[i][0] = Double.parseDouble(tems[1]);
			data[i][1] = Double.parseDouble(tems[2]);
			data[i][2] = Double.parseDouble(tems[3]);
		}
		ArrayList<double[]> sorted_points = new ArrayList<>();
		ArrayList<Integer> sorted_k = new ArrayList<>();
		sorted_points.add(data[0]);
		sorted_k.add(k[0]);
		for (int i = 1; i < n; i++)
		{
			int che = 0;
			for (int j = 0; j < sorted_points.size(); j++)
			{
				if (data[i][2] > sorted_points.get(j)[2])
				{
					che = 1;
					sorted_points.add(j, data[i]);
					sorted_k.add(j, k[i]);
					break;
				}
			}
			if (che == 0)
			{
				sorted_points.add(data[i]);
				sorted_k.add(k[i]);
			}
		}

		ArrayList<double[]> bucket = new ArrayList<>();
		ArrayList<Integer> bucket_k = new ArrayList<>();
		Map<Integer, Integer> map_k = new HashMap<>();
		for (int i = 0; i < b; i++)
		{
			bucket.add(sorted_points.get(0));
			bucket_k.add(sorted_k.get(0));
			map_k.put(sorted_k.get(0), i);
			sorted_points.remove(0);
			sorted_k.remove(0);
		}
		// System.out.println(bucket_k.get(0)+" "+ bucket.get(0)[0]+"
		// "+bucket.get(0)[1]+" "+bucket.get(0)[2]);
		// System.out.println(bucket_k.get(1)+" "+bucket.get(1)[0]+"
		// "+bucket.get(1)[1]+" "+bucket.get(1)[2]);
		// System.out.println(sorted_points.get(0)[0]+"
		// "+sorted_points.get(0)[1]+" "+sorted_points.get(0)[2]);
		// System.out.println(sorted_points.get(1)[0]+"
		// "+sorted_points.get(1)[2]+" "+sorted_points.get(1)[2]);
		// System.out.println(map_k);

		while (s.hasNext())
		{
			tem = s.nextLine();
			tems = tem.split(" ");
			// System.out.println(tems[0]);
			if (tems[0].equals("F") || tems[0].equals("f"))
			{
				// System.out.println("jkhkj");
				if (map_k.get(Integer.parseInt(tems[1])) != null)
				{

					System.out.print(tems[1] + " = (");
					int temmm = map_k.get(Integer.parseInt(tems[1]));
					double ans1 = bucket.get(temmm)[0];
					double ans2 = bucket.get(temmm)[1];
					double ans3 = bucket.get(temmm)[2];
					ans1 = (double) Math.round(ans1 * 1000d) / 1000d;
					ans2 = (double) Math.round(ans2 * 1000d) / 1000d;
					ans3 = (double) Math.round(ans3 * 1000d) / 1000d;
					String ans11 =  round_to_3(ans1);
					String ans22 =  round_to_3(ans2);
					String ans33 =  round_to_3(ans3);
					System.out.println(ans11 + "," + ans22 + "," + ans33 + ")");
				} else
				{
					System.out.println("Point doesn't exist in the bucket.");
				}
			}
			// try
			// {
			// Thread.sleep(4000);
			// } catch (InterruptedException e)
			// {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }

			if (tems[0].equals("R") || tems[0].equals("r"))
			{
				if (sorted_points.size() == 0 || sorted_k.size() == 0)
				{
					System.out.println("No more points can be deleted.");
					break;
				}
				if (map_k.get(Integer.parseInt(tems[1])) != null)
				{
					int temmm = map_k.get(Integer.parseInt(tems[1]));
					bucket_k.remove(temmm);
					bucket_k.add(sorted_k.get(0));
					map_k.put(sorted_k.get(0), b - 1);
					sorted_k.remove(0);
					bucket.remove(temmm);
					bucket.add(sorted_points.get(0));
					sorted_points.remove(0);
					map_k.remove(temmm);

					System.out.println("Point id " + tems[1] + " removed.");
				} else
				{
					System.out.println("Point doesn't exist in the bucket.");
				}
			}

		}

	}
	public static String round_to_3(double data)
	{
		String tem = String.valueOf(data);
//		System.out.println(tem);
		String tems [] = tem.split("\\.");
//		System.out.println(tems.length);
//		System.out.println(tems[1]);
		if(tems[1].length()<3)
		{
//			System.out.println(tems[1].length());
			if(tems[1].length()==1)
				tems[1]= tems[1]+"00";
			else
				tems[1]=tems[1]+"0";
		}
		
		return (tems[0]+"."+tems[1]);
	}

}
