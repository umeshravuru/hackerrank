package hack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Kruskal_MST_Really_Special_Subtree
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[][] data = new int[m][3];
		for (int i = 0; i < m; i++)
		{
			data[i][0] = s.nextInt() - 1;
			data[i][1] = s.nextInt() - 1;
			data[i][2] = s.nextInt();
		}
		int starting_node = s.nextInt();
		LinkedList<LinkedList<Integer>> sorted_data = new LinkedList<LinkedList<Integer>>();

		for (int i = 0; i < m; i++)
		{
			LinkedList<Integer> temp = new LinkedList<>();
			int check = 0;
			for (int j = 0; j < sorted_data.size(); j++)
			{
				if (sorted_data.get(j).get(2) > data[i][2])
				{
					temp.add(data[i][0]);
					temp.add(data[i][1]);
					temp.add(data[i][2]);
					sorted_data.add(j, temp);
					check = 1;
					break;
				}
				if (sorted_data.get(j).get(2) == data[i][2])
				{
					if (sorted_data.get(j).get(2) + sorted_data.get(j).get(1)
							+ sorted_data.get(j).get(0) > data[i][0]
									+ data[i][1] + data[i][2])
					{
						temp.add(data[i][0]);
						temp.add(data[i][1]);
						temp.add(data[i][2]);
						sorted_data.add(j, temp);
						check = 1;
						break;
					}
				}

			}
			if (check == 0)
			{
				temp.add(data[i][0]);
				temp.add(data[i][1]);
				temp.add(data[i][2]);
				sorted_data.add(temp);
			}
		}
		LinkedList<LinkedList<Integer>> final_tree = new LinkedList<LinkedList<Integer>>();
		int check_final_ans = 0;
		int[] union_array = new int[n];
		for (int i = 0; i < n; i++)
		{
			union_array[i] = i;
		}
		for (int i = 0; i < sorted_data.size(); i++)
		{
			if (find(union_array, sorted_data.get(i).get(0),
					sorted_data.get(i).get(1)))
			{
				final_tree.add(sorted_data.get(i));
				merge(union_array, sorted_data.get(i).get(0),
						sorted_data.get(i).get(1));
			}
		}
		int fianl_Ans = 0;
		for (int i = 0; i < final_tree.size(); i++)
		{
			fianl_Ans = fianl_Ans + final_tree.get(i).get(2);
		}
		System.out.println(fianl_Ans);
	}
	public static int[] merge(int[] data, int a, int b)
	{
		int change = data[a];
		for (int i = 0; i < data.length; i++)
		{
			if (data[i] == change)
				data[i] = data[b];
		}
		return data;

	}

	public static boolean find(int[] data, int a, int b)
	{
		if (data[a] == data[b])
			return false;
		else
			return true;

	}

}
