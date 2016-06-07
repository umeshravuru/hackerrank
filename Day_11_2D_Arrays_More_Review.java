package hack;

import java.util.Scanner;

public class Day_11_2D_Arrays_More_Review {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		int [][ ] data = new int [6][6];
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				data[i][j]=s.nextInt();
			}
		}
		int ans=-1000000;
		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<4;j++)
			{
				int max=0;
				max=data[i][j]+data[i][j+1]+data[i][j+2]+data[i+1][j+1]+data[i+2][j]+data[i+2][j+1]+data[i+2][j+2];
				if(max>ans)
					ans=max;
			}
			
		}
		
		System.out.println(ans);
		
		
	}

}
