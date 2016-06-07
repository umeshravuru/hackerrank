package hack;

import java.util.Scanner;

public class Common_Child
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = s.nextLine();
		
		int [][] matrix = new int [a.length()+1][b.length()+1];
		
		for(int i =0;i<a.length();i++)
		{
			for(int j=0;j<b.length();j++)
			{
				if(a.charAt(i)==b.charAt(j))
				{
					matrix[i+1][j+1]=matrix[i][j]+1;
				}
				else
					matrix[i+1][j+1]=Math.max(matrix[i+1][j], matrix[i][j+1]);
			}
		}
		
		System.out.println(matrix[a.length()][b.length()]);

	}

}
