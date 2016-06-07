package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class powerful_string
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();
		int m = Integer.parseInt(s.nextLine());
		ArrayList<Character> data = new ArrayList<Character>();
		for (int i = 0; i < data1.length(); i++)
		{
			data.add(data1.charAt(i));
		}
		int[][] query = new int[m][2];

		for (int i = 0; i < m; i++)
		{
			String tem = s.nextLine();
			String[] tem1 = tem.split(" ");
			query[i][0] = Integer.parseInt(tem1[0]) - 1;
			query[i][1] = Integer.parseInt(tem1[1]) - 1;
		}
		for (int j = 0; j < m; j++)
		{
			if (query[j][0] > query[j][1])
			{
				if (data.get(query[j][0]) > data.get(query[j][1]))
				{
					char temm = data.get(query[j][0]);
					data.set(query[j][0], data.get(query[j][1]));
					data.set(query[j][1], temm);
				}
			} else
			{
				if (data.get(query[j][0]) < data.get(query[j][1]))
				{
					char temm = data.get(query[j][0]);
					data.set(query[j][0], data.get(query[j][1]));
					data.set(query[j][1], temm);
				}
			}
			for (int jj = 0; jj <= j; jj++)
			{
				if (query[jj][0] > query[jj][1])
				{
					if (data.get(query[jj][0]) > data.get(query[jj][1]))
					{
						char temm = data.get(query[jj][0]);
						data.set(query[jj][0], data.get(query[jj][1]));
						data.set(query[jj][1], temm);
					}
				} else
				{
					if (data.get(query[jj][0]) < data.get(query[jj][1]))
					{
						char temm = data.get(query[jj][0]);
						data.set(query[jj][0], data.get(query[jj][1]));
						data.set(query[jj][1], temm);
					}
				}

//				System.out.println(data);
			}
		}
for(int i =0;i<data.size();i++)
{
		System.out.print(data.get(i));
}

	}

}
