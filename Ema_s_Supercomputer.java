package hack;

import java.util.Scanner;

public class Ema_s_Supercomputer
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String ss =s.nextLine();
		String [] sss=ss.split(" ");
		int n=Integer.parseInt(sss[0]);
		int m=Integer.parseInt(sss[1]);
		int [][] data  = new int [n][m];
		for(int i=0;i<n;i++)
		{
			ss=s.nextLine();
			for(int j=0;j<m;j++)
			{
				if(ss.charAt(j)=='G')
					data[i][j]=1;
				else
					data[i][j]=0;
			}
		}
	int minn=Math.min(n, m);
	if(minn%2==0)
		minn--;
		
		for(int i=minn;i>0;i=i-2)
		{
			
		}
		
		

	}
	
	
	public static boolean checking(int[][] data,int a)
	{
		int x=a/2;
		int y=a/2;
//		
//		for(int i=x)
		
		
		
		return true;
	}

}
