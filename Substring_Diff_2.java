package hack;

import java.util.Scanner;

public class Substring_Diff_2
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < t; ii++)
		{
			String tem = s.nextLine();
			String[] tem_Arr = tem.split(" ");
			int k = Integer.parseInt(tem_Arr[0]);
			String data1 = tem_Arr[1];
			String data2 = tem_Arr[2];
			int data[][] = new int[data1.length() + 1][data1.length() + 1];
			int carry[][] = new int[data1.length() + 1][data1.length() + 1];
			for (int i = 0; i < data1.length(); i++)
			{
				carry[i][0]=k;
				carry[0][i]=k;
			}
			int max =0;
			for (int i = 0; i < data1.length(); i++)
			{
				for (int j = 0; j < data2.length(); j++)
				{
					if (data1.charAt(i) == data2.charAt(j))
					{
						data[i + 1][j + 1] = data[i][j] + 1;
						carry[i+1][j+1]=carry[i][j];
			
					}
					else
					{
						carry[i+1][j+1]=carry[i][j]-1;
						if(carry[i+1][j+1]>=0)
							data[i+1][j+1]=data[i][j]+1;
					}
					if(data[i+1][j+1]>max)
						max = data[i+1][j+1];

				}
			}
			System.out.println(max);
			disp(data);
			disp(carry);

		}

	}
	public static void disp(int[][] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data.length; j++)
			{
				System.out.print(data[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("");
	}

}
