package beer_night;

import java.util.Scanner;

public class Super_Humble_Matrix
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		int max = Math.max(n, m);
		int min = Math.min(n, m);

		int[] data = new int[n + m - 1];

		for (int i = 1; i <= min; i++)
		{
			data[i - 1] = i;
			data[data.length - i] = i;
		}
		for (int i = min; i < data.length; i++)
		{
			if (data[i] != 0)
				break;
				data[i] = min;
		}
//		disp(data);
		long[] data_mod = new long[n + m - 1];
		data_mod[0]=1;
		data_mod[data_mod.length-1]=1;
		for (int i = 2; i <= min; i++)
		{
			data_mod[i-1]=mod(data_mod[i-2]*mod(i));
			data_mod[data.length-i]= mod(data_mod[data.length-i+1]*mod(i));
		}
		for(int i =min;i<data.length;i++)
		{
			if(data_mod[i]!=0)
				break;
			data_mod[i]=data_mod[i-1];
		}
		long final_ans =1;
		for(int i=0;i<data.length;i++)
		{
			final_ans =mod(final_ans *mod(data_mod[i]));
		}
//		disp_long(data_mod);
		System.out.println(final_ans);
	}

	public static void disp(int[] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	public static void disp_long(long[] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
	}
	public static long mod_fac(long data)
	{
		long ans = 1;
		for (int i = 2; i <= data; i++)
		{
			ans = mod(ans * mod(i));
		}
		return ans;

	}
	public static long mod(long data)
	{
		return data % (1000000007);
	}

}
