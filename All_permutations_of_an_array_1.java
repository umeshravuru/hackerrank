package beer_night;

import java.util.Arrays;
import java.util.Scanner;

public class All_permutations_of_an_array_1
{

	public static void main(String[] args)
	{
		// Permute.permute(java.util.Arrays.asList(3,4,6,2,1), 0);
		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();
		char[] data = data1.toCharArray();

		permute(data, 0);

	}

	public static void permute(char[] arr, int k)
	{
		for (int i = k; i < arr.length; i++)
		{
			{
				char tem = arr[i];
				arr[i] = arr[k];
				arr[k] = tem;
			}
			permute(arr, k + 1);
			{
				char tem = arr[i];
				arr[i] = arr[k];
				arr[k] = tem;
			}
		}
		if (k == arr.length - 1)
		{
			disp(arr);
			System.out.println();
		}
	}

	public static void disp(char[] data)
	{

		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + " ");
		}

	}

}
