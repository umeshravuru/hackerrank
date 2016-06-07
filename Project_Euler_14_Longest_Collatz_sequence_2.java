package hack;

import java.util.Scanner;

public class Project_Euler_14_Longest_Collatz_sequence_2
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		int n =s.nextInt();
		
		long  [] data = new long [5000001];
//		long  [] data = new long [500];
		data[0]=0;
		data[1]=1;
		data[2]=2;
		for(long i =3;i <data.length;i++)
		{
			long pre =i;
			long ans =0;
			while(pre>=i)
			{
				if(pre%2==0)
					pre = pre/2;
				else
					pre = 3*pre+1;
				ans++;
			}
			data[(int) i]=data[(int) pre]+ans;
		}
		
		
		long[] max_data = new long [5000001];
//		long[] max_data = new long [500];
		long curretn_max_value=0;
		int current_max_index=0;
		max_data[0]=0;
		for(int i =1;i<data.length;i++)
		{
			if(curretn_max_value<=data[i])
			{
				max_data[i]=i;
				current_max_index=i;
				curretn_max_value=data[i];
			}
			else
			{
				max_data[i]=current_max_index;
			}
		}
		
		
		for(int i =0;i<n;i++)
		{
			int m =s.nextInt();
			
			System.out.println(max_data[m]);
		}
		
		
//		for(int i =0;i <data.length;i++)
//		{
//			System.out.println(i+" - "+max_data[i]);
//		}
		
//		System.out.println(data[13]);
		
	}

}
