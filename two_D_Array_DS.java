/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class two_D_Array_DS
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int data[][] = new int[6][6];
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				data[i][j] = s.nextInt();
			}
		}
		
		int max =-1;
		int ans =0;
		for(int i =1;i<5;i++)
		{
			for(int j =1;j<5;j++)
			{
				ans =0;
				ans = ans + data[i][j];
				ans = ans + data[i+1][j+1];
				ans = ans + data[i-1][j];
				ans = ans + data[i+1][j];
				ans = ans + data[i-1][j-1];
				ans = ans + data[i-1][j+1];
				ans = ans + data[i+1][j-1];
				if(max<ans)
					max = ans;
			}
			
		}
		System.out.println(max);

	}

}
