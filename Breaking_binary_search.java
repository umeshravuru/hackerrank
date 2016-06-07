package beer_night;

import java.util.Scanner;

public class Breaking_binary_search
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] data = new int[t];
		for (int i = 0; i < t; i++)
		{
			data[i] = s.nextInt();
		}
		int find = s.nextInt();
//		if(sorted_search(data, find)==-1)
		
		
		System.out.println(sorted_search(data, find));

	}

	public static int sorted_search(int[] elements, int target)
	{
		if (elements == null || elements.length <= 0)
			return -1;
		int left = 0, right = elements.length - 1;
		while (left < right)
		{
			int middle = (left + right + 1) / 2;
			if (elements[middle] > target)
			{
				right = middle - 1;
			} else
			{
				left = middle + 1;
			}
		}
		if (elements[right] == target)
			return right;
		return -1;
	}

}
