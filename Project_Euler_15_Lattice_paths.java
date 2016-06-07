package hack;

import java.util.Scanner;

public class Project_Euler_15_Lattice_paths
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int max_range =501;
		long [][] data = new long [max_range][max_range];
		for(int i =0;i<max_range;i++)
		{
			data[i][0]=1;
			data[0][i]=1;
		}
		for(int i =1;i<max_range;i++)
		{
			for(int j =1;j<max_range;j++)
			{
				data[i][j]=mod(data[i-1][j]+data[i][j-1]);	
			}
		}
		int n =s.nextInt();
		for(int i =0;i<n;i++)
		{
			System.out.println((int)(data[s.nextInt()][s.nextInt()]%(Math.pow(10, 9)+7)));
		}
	}
	public static long mod(long data){
		return data%(1000000007);
	}

}