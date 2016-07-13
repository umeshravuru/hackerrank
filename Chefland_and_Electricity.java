package Code_chef;

import java.util.Scanner;

public class Chefland_and_Electricity
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());

		for (int ii = 0; ii < t; ii++)
		{
			int n = Integer.parseInt(s.nextLine());
			String data1 = s.nextLine();
			int data0[] = new int[n];
			int data[] = new int[n];
			data1 = s.nextLine();
			String data2[] = data1.split(" ");
			for (int i = 0; i < n; i++)
			{
				if (data1.charAt(i) == '1')
					data0[i] = 1;
				
				data[i] = Integer.parseInt(data2[i]);
			}
			long ans = 0;
//			disp(data0);
			for (int i = 0; i < n; i++)
			{
				if (data0[i] == 0)
				{
					data0[i] = 1;
				} else
				{
					ans = ans + data[i] - data[0];
					break;
				}
			}
//			disp(data0);
			for (int i = n - 1; i >= 0; i--)
			{
				if (data0[i] == 0)
				{
					data0[i] = 1;
				} else
				{
					ans = ans + data[n - 1] - data[i];
					break;
				}
			}
//			disp(data0);
			
			
			for(int i =1;i<n-1;i++)
			{
				if(data0[i]==0)
				{
					ans = ans + Math.min(data[i-1], data[i+1]);
				}
			}
			
			
			
			
			System.out.println(ans);
			
		}

	}
	
	public static void disp(int []data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println(); 
	}
	

}
