/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Antiprime_Numbers
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int data[] =
		{1, 2, 4, 6, 12, 24, 36, 48, 60, 120, 180, 240, 360, 720, 840, 1260,
				1680, 2520, 5040, 7560, 10080, 15120, 20160, 25200, 27720,
				45360, 50400, 55440, 83160, 110880, 166320, 221760, 277200,
				332640, 498960, 554400, 665280, 720720, 1081080, 1441440,
				2162160, 2882880, 3603600, 4324320, 6486480, 7207200, 8648640,
				10810800};

		int n = s.nextInt();
		for(int i =0;i<n;i++)
		{
			int tem = s.nextInt();
			for(int j=data.length-1;j>=0;j--)
			{
				if(data[j]<tem)
				{
					System.out.println(data[j+1]);
					break;
				}
			}
		}
		
		
	}

}
