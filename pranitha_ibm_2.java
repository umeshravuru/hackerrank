/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.xml.crypto.Data;

/**

 */
public class pranitha_ibm_2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		String data1 = s.nextLine();
		String data[] = data1.split("\\|");
		// System.out.println(data.length);
		String comp_data[] = new String[data.length];
		Map<Integer, Integer> used = new HashMap<>();
		Map<String, Integer> used1 = new HashMap<>();
		Map<String, Integer> uniq = new HashMap<>();
		for (int i = 0; i < data.length; i++)
		{
			String tem = data[i];
			tem = tem.toLowerCase();
			tem = tem.trim();
			String add = "";
			for (int j = 0; j < tem.length(); j++)
			{
				if (((int) tem.charAt(j) <= 122 && (int) tem.charAt(j) >= 97)
						|| ((int) tem.charAt(j) <= 90
								&& (int) tem.charAt(j) >= 65)
						|| (int) tem.charAt(j) == 32)
				{
					add = add + tem.charAt(j);
				} else if ((int) tem.charAt(j) == 45)
				{
					add = add + " ";
				}

			}
			comp_data[i] = add;

		}

		for (int i = 0; i < comp_data.length; i++)
		{
			if (uniq.get(comp_data[i]) == null)
			{
				uniq.put(comp_data[i], i);
			}
		}
//		System.out.println(uniq);
//		disp(comp_data);
		String final_ans = "";
//		System.out.println(data.length);
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data.length; j++)
			{
				if (i != j)
				{
					// System.out.println(comp_data[i] + " " + comp_data[j]);
					if (comp_data[j].contains(comp_data[i]))
					{
						// System.out.println(data[j]+"|");
						if (used.get(j) == null)
						{
							if (used1.get(comp_data[j]) == null)
							{
								used.put(j, 1);
								used1.put(comp_data[j], 1);
								final_ans = final_ans + data[j] + "|";
							}
						}
					}
				}
			}

		}
		// System.out.println(final_ans);
		System.out.println(final_ans.substring(0, final_ans.length() - 1));

	}
	public static void disp(String data[])
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.println(data[i] + " ");
		}
		System.out.println();
	}

}
