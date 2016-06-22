package hack;

import java.util.Scanner;

public class kiran_grddy_gold
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int weight[] =
		{2, 5, 14, 17, 19, 13, 1, 3, 5, 11, 19};
		int gold[] =
		{57, 191, 417, 231, 741, 139, 28, 117, 13, 9, 18};

		double[] ratio = new double[11];

		for (int i = 0; i < 11; i++)
		{
			ratio[i] = (double) gold[i] / (double) weight[i];
			System.out.println(ratio[i]);

		}

		for (int i = 0; i < 11; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				if (ratio[j] < ratio[j + 1])
				{
					int tem = weight[j + 1];
					weight[j + 1] = weight[j];
					weight[j] = tem;

					tem = gold[j + 1];
					gold[j + 1] = gold[j];
					gold[j] = tem;

					double tem1 = ratio[j + 1];
					ratio[j + 1] = ratio[j];
					ratio[j] = tem1;

				} else if (ratio[j] == ratio[j + 1])
				{
					if (weight[j] > weight[j + 1])
					{
						 int tem = weight[j + 1];
						 weight[j + 1] = weight[j];
						 weight[j] = tem;
						
						 tem = gold[j + 1];
						 gold[j + 1] = gold[j];
						 gold[j] = tem;
						
						 double tem1 = ratio[j + 1];
						 ratio[j + 1] = ratio[j];
						 ratio[j] = tem1;

					}
				}
			}
		}
		for (int i = 0; i < 11; i++)
		{
			System.out.println(gold[i]);
		}


		int input[] =
		{1739, 72, 212, 55, 511, 1239, 99};

		for (int i = 0; i < input.length; i++)
		{
			int now = input[i];
			int index = 0;
			int final_Ans = 0;

			while (now > 0)
			{
				int tem = now / weight[index];
				now = now - tem * weight[index];
				final_Ans = final_Ans + gold[index] * tem;
				System.out.println(tem);
				index++;

			}
			System.out.println(final_Ans);
		}
	}

}
