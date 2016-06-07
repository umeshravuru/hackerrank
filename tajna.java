package hack;

import java.util.Scanner;

public class tajna
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		int row =0;
		for(int i =(int) Math.sqrt(data.length());i>=1;i--)
		{
			if(data.length()%i==0)
			{
				row = i;
				break;
			}
		}
		
		int col = data.length()/row;
		char [][] ans = new char[row][col];
		int tem =0;
		for(int i =0;i<col;i++)
		{
			for(int j =0;j<row;j++)
			{
				ans[j][i]= data.charAt(tem++);
			}
		}
		
		for(int i =0;i<row;i++)
		{
			for(int j =0;j<col;j++)
			{
				System.out.print(ans[i][j]+"");
			}
		}
		
		
	}

}
