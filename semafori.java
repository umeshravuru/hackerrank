package hack;

import java.util.Scanner;

public class semafori
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int[][] data = new int [n][3];
		for(int i =0;i<n;i++)
		{
			data[i][0]=s.nextInt();
			data[i][1]=s.nextInt();
			data[i][2]=s.nextInt();
		}

		int ans = 0;
		int tem =0;
		int present =-1;
		int key=0;
		while(tem!=m)
		{
			if(present<data[key][0])
			{
				ans++;
				tem++;
			}
		}
		
		
	}

}
