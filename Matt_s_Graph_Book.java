/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.ArrayList;
import java.util.Scanner;

/**

 */
public class Matt_s_Graph_Book
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int k = s.nextInt();
		int data[][] = new int[k][2];
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		for (int i = 0; i < k; i++)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			x.add(a);
			y.add(b);
		}
		int remove = s.nextInt();
		for (int i = 0; i < x.size(); i++)
		{
			if (x.get(i) == remove || y.get(i) == remove)
			{
				x.remove(i);
				y.remove(i);
				i--;
			}
		}
		int tem_arr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			tem_arr[i] = i;
		}
		for (int i = 0; i < x.size(); i++)
		{
			int change = tem_arr[x.get(i)];
			for (int j = 0; j < n; j++)
			{
				if (tem_arr[j] == y.get(i))
					tem_arr[j] = change;
			}
		}
		int che = 0;
//		disp(tem_arr);
		for (int i = 0; i < n - 1; i++)
		{
			if (tem_arr[i] != tem_arr[n - 1] && i!=remove)
			{
				che = 1;
				break;
			}
		}
		if (che == 1)
			System.out.println("Not Connected");
		else
			System.out.println("Connected");

	}
	public static void disp(int data[])
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}
