package hack;

import java.util.Scanner;

public class Substring_Diff
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
     		int final_ans = 0;
			int ans[][] = new int[data1.length()][data1.length()];

			for (int i = 0; i < data1.length(); i++)
			{
				for (int j = 0; j < data2.length(); j++)
				{
					int temp_Ans = 0;
					int x = i;
					int y = j;
					int k_tem = k;
					while ((x < data1.length() && y < data1.length() ) )
					{
						if(data1.charAt(x) == data2.charAt(y))
						{
							temp_Ans++;
								x++;
							y++;
						}
						else
						{
							if(k_tem==0)
								break;
							x++;
							y++;
							k_tem--;
							temp_Ans++;
						}
					}
					
					ans[i][j]= temp_Ans;
					if(ans[i][j]>final_ans)
						final_ans=ans[i][j];
				}

			}
			disp(ans);
			System.out.println(final_ans);
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
