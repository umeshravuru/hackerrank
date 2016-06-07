package hack;

import java.util.Scanner;

public class The_Longest_Common_Subsequence
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[] data1 = new int[n];
		int[] data2 = new int[m];
		for (int i = 0; i < n; i++)
		{
			data1[i] = s.nextInt();
		}
		for (int i = 0; i < m; i++)
		{
			data2[i] = s.nextInt();
		}

		int data[][] = new int[data1.length + 1][data2.length + 1];
		int max = 0;
		for (int i = 0; i < data1.length; i++)
		{
			for (int j = 0; j < data2.length; j++)
			{
				if (data1[i] == data2[j])
				{
					data[i + 1][j + 1] = data[i][j] + 1;
				} else
				{
					data[i + 1][j + 1] = Math.max(data[i][j],
							Math.max(data[i][j + 1], data[i + 1][j]));
				}
				if (data[i + 1][j + 1] > max)
					max = data[i + 1][j + 1];
			}
		}

		for(int i=0;i<data1.length;i++)
		{
			data[i+1][0]=data1[i];
		}
		for(int i=0;i<data2.length;i++)
		{
			data[0][i+1]=data2[i];
		}
		disp(data);
		String final_ans = "";
		int tem_max = 1;
		int che = 0;
		int j_tem = 1;
		
		int ii =data1.length;
		int jj = data2.length;
				while(ii>0 && jj>0)
				{
					if(data[0][jj]==data[ii][0])
					{
						final_ans=String.valueOf(data[ii][0])+" "+final_ans;
						ii--;
						jj--;
					}
					else
					{
						jj--;
					}
				}
		
		
//		for (int i = data1.length; i >0; i--)
//		{
//			for (int j = data2.length; j >0; j--)
//			{
//				if(data[0][j]==data[i][0])
//				{
//					final_ans=String.valueOf(data[i][0])+" "+final_ans;
//				}
//				else
//					
//				
//				
//				
//			}
//			
//		}
		
		
		
		
		System.out.println(final_ans);

	}

	public static void disp(int[][] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[0].length; j++)
			{
				System.out.print(data[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}

}
