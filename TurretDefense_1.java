/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Top_Coder;

import java.util.Scanner;

/**

 */
public class TurretDefense_1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int xs[] = new int [n];
//		int ys[] = new int [n];
//		int times[] = new int [n];
		
//		for(int i =0;i<n;i++)
//		{
//			xs[i]= s.nextInt();
//		}
//		for(int i =0;i<n;i++)
//		{
//			ys[i]= s.nextInt();
//		}
//		for(int i =0;i<n;i++)
//		{
//			times[i]= s.nextInt();
//		}
//{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
//		int ys[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
//		int times[]={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,31};
		
//		int xs[]=		{1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0};
//		int ys[]={1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0};
//		int times[]={2000,4000,6000,8000,10000,12000,14000,16000,18000,20000, 22000,24000,26000,28000,30000,32000,34000,36000,38000,40000, 42000,44000,46000,48000,50000,52000,54000,56000,58000,60000, 62000,64000,66000,68000,70000,72000,74000,76000,78000,80000, 82000,84000,86000,88000,90000,92000,94000,96000,98000,100000};
		
//		int xs[]={4,5};
//		int ys[]={4,5};
//		int times[]={7,8};
		
		int xs[]={1,2,3,4,15};
		int ys[]={1,2,3,4,15};
		int times[]={100,200,300,400,405};
		
		TurretDefense obj = new TurretDefense();
		System.out.println(obj.firstMiss(xs, ys, times));
		
	}
	

}

class TurretDefense
{

	public int firstMiss(int[] xs, int[] ys, int[] times)
	{
		int x = 0;
		int y = 0;
		for (int i = 0; i < xs.length; i++)
		{
			if (i == 0)
			{
				if (Math.abs(x - xs[i]) + Math.abs(y - ys[i]) <= times[i])
				{
					x = xs[i];
					y = ys[i];
				} else
				{
					return i;
				}
			} else
			{
				if (Math.abs(x - xs[i]) + Math.abs(y - ys[i]) <= times[i]
						- times[i - 1])
				{
					x = xs[i];
					y = ys[i];
				} else
				{
					return i;
				}
			}
		}
		return -1;
	}

}
