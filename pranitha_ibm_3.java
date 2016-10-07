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
public class pranitha_ibm_3
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();
		String data[] = data1.split(",");
		Map<String, String> tree = new HashMap<>();
		for (int i = 0; i < data.length - 2; i++)
		{
			String now = data[i];
			String now1[] = now.split("->");
			tree.put(now1[1], now1[0]);
		}
		ArrayList<String> boss1 = new ArrayList<>();
		ArrayList<String> boss2 = new ArrayList<>();
		String guy1 = data[data.length - 2];
		String guy2 = data[data.length - 1];
		while (true)
		{
			if (tree.get(guy1) == null)
				break;
			String now = tree.get(guy1);
			boss1.add(now);
			guy1 = now;

		}
		while (true)
		{
			if (tree.get(guy2) == null)
				break;
			String now = tree.get(guy2);
			boss2.add(now);
			guy2 = now;
		}
		int che =0;
		for(int i =0;i<boss1.size();i++)
		{
			for(int j =0;j<boss2.size();j++)
			{
				if(boss1.get(i).equals(boss2.get(j)))
				{
					System.out.println(boss1.get(i));
					che =1;
					break;
				}
				if(che==1)
					break;
			}
		}
//		System.out.println(boss1);
//		System.out.println(boss2);

	}

}
