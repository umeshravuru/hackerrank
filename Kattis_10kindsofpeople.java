package hack;

import java.util.Scanner;

public class Kattis_10kindsofpeople
{

	public static void main(String[] args)
	{
		Scanner  s = new Scanner(System.in);
		String temp = s.nextLine();
		String temps[] = temp.split(" ");
		int r = Integer.parseInt(temps[0]);
		int c = Integer.parseInt(temps[1]);
		int [][] data = new int [r][c];
		for(int i =0;i<r;i++)
		{
				String tem =s.nextLine();
				for(int k =0;k<tem.length();k++)
				{
					if(tem.charAt(k)=='1')
						data[i][k]=1;
					else
						data[i][k]=0;
				}
				
		}
		int n = s.nextInt();
		for(int ii=0;ii<n;ii++)
		{
			int r1=s.nextInt()-1;
			int c1=s.nextInt()-1;
			int r2=s.nextInt()-1;
			int c2=s.nextInt()-1;
			
			int che1=0;
			int che0=0;
			
			int che3=0;
			for(int i=r1;i<=r2;i++)
			{
				for(int j=c1;j<=c2;j++)
				{
					System.out.print(data[i][j]);
				}
				System.out.println("");
			}
			
			
		}
		
		
	}

}
