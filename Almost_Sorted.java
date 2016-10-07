/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**

 */
public class Almost_Sorted
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int[n];
		int data1[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextInt();
			data1[i] = data[i];
		}
		Arrays.sort(data1);

		int che = 0;
		for (int i = 0; i < data.length - 1; i++)
		{
			if (data[i] > data[i + 1])
			{
				che = 1;
				break;
			}
		}
		if (che == 1)
		{
			ArrayList<Integer> index = new ArrayList<>();
			for (int i = 0; i < data.length; i++)
			{
				if (data[i] != data1[i])
					index.add(i);
			}
			if (index.size() == 2)
			{
				int tem = data[index.get(0)];
				data[index.get(0)] = data[index.get(1)];
				data[index.get(1)] = tem;
				ArrayList<Integer> index1 = new ArrayList<>();
				for (int i = 0; i < data.length; i++)
				{
					if (data[i] != data1[i])
						index1.add(i);
				}
				if (index1.size() == 0)
				{
					System.out.println("yes");
					System.out.println("swap " + (index.get(0) + 1) + " "
							+ (index.get(1) + 1));
				} else
					System.out.println("no");
			} else if (index.size() < 2)
			{
				System.out.println("no");
			} else
			{
				int che1 = 0;
				for (int i = 0; i < index.size() - 1; i++)
				{
					if (index.get(i) + 1 != index.get(i + 1))
					{
						che1 = 1;
						break;
					}
				}
				if (che1 == 1)
					System.out.println("no");
				else
				{
					// System.out.println("kh");
					for (int i = 0; i < index.size() / 2; i++)
					{
						int tem = data[index.get(i)];
						data[index.get(i)] = data[index
								.get(index.size() - 1 - i)];
						data[index.get(index.size() - 1 - i)] = tem;
					}
					System.out.println(index);
					disp(data);
					ArrayList<Integer> index1 = new ArrayList<>();
					for (int i = 0; i < data.length; i++)
					{
						if (data[i] != data1[i])
							index1.add(i);
					}
					if (index1.size() == 0)
					{
						System.out.println("yes");
						System.out.println("reverse " + (index.get(0) + 1) + " "
								+ (index.get(index.size() - 1) + 1));
					} else
						System.out.println("no");
				}
			}

		} else
			System.out.println("yes");

	}
	public static void disp(int[] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}
