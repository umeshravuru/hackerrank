package hack;

import java.util.Scanner;

public class Suggest_Better_Spending_Rates
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		long p = s.nextLong();
		double r = s.nextDouble()/100;
		int t = s.nextInt();
		int thresh = s.nextInt();
		int data[] = new int[t];

		for (int i = 0; i < t; i++)
		{
			data[i] = s.nextInt();
		}

		System.out.println(find_ans(p, r, data));
		
		if(thresh == 1)
		{
			data[data.length-1]++;
			data[0]--;
			System.out.print(find_ans(p, r, data)+" - ");
			disp(data);
			System.out.println();
			data[data.length-1]--;
			data[1]++;
			System.out.print(find_ans(p, r, data)+" - ");
			disp(data);
			System.out.println();
			data[0]++;
			data[1]= data[1]-2;
			data[data.length-1]++;
			System.out.print(find_ans(p, r, data)+" - ");
			disp(data);
			System.out.println();
		}	
		else if(thresh ==2)
		{
			data[data.length-1]++;
			data[0]--;
			System.out.print(find_ans(p, r, data)+" - ");
			disp(data);
			System.out.println();
			data[data.length-1]++;
			data[0]--;
			System.out.print(find_ans(p, r, data)+" - ");
			disp(data);
			System.out.println();
			data[0]++;
			data[1]--;
			System.out.print(find_ans(p, r, data)+" - ");
			disp(data);
			System.out.println();
		}
		else
		{
			data[data.length-1]++;
			data[0]--;
			System.out.print(find_ans(p, r, data)+" - ");
			disp(data);
			System.out.println();
			data[data.length-1]++;
			data[0]--;
			System.out.print(find_ans(p, r, data)+" - ");
			disp(data);
			System.out.println();
			data[0]++;
			data[data.length-1]++;
			data[0]--;
			System.out.print(find_ans(p, r, data)+" - ");
			disp(data);
			System.out.println();
		}
		
		
		
		
		
	}

	public static double find_ans(long P, double r, int data[])
	{
		double ans = 0;

//		double tem = (double)P*((double)data[0]/(double)100);
//		System.out.println(tem); 
		
//		tem = tem * Math.pow(1+r, 1);
//		System.out.println(tem);
		
		for (int i = 0; i < data.length; i++)
		{
			double tem = 1;
			for (int j = 0; j < i; j++)
			{
				tem = tem * ((double)100 - (double)data[j]) / (double)100;
			}
//			System.out.println(tem);
			ans = ans + tem * (double)data[i] * (double)P * ((double)Math.pow((1 + r), (i + 1)))*(((double)1/(double)100));
//			System.out.println(ans);

		}
		ans = ((double)Math.round(ans * 1000d) / 1000d);
		return ans;
	}
	public static void disp(int [] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
	}

}
