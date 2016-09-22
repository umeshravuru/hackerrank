/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Bonetrousle_2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int  t = s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			long a = s.nextLong();
			long b = s.nextLong();
			int c = s.nextInt();
			
			long ans [] = new long [(int) c];
			long sum = a;
			int che =0;
			long now = b;
			for(int i =c-1;i>=0;i--)
			{
				ans[i]=  now;
				now--;
				sum = sum -ans[i];
				if(sum<0)
				{
					che=1;
					break;
				}
			}
			if(che==1)
			{
				 sum =a;
				for(int i =0;i<c;i++)
				{
					ans[i]= (int) (i+1);
					sum = sum -ans[i];
					if(sum<0)
					{
						che=1;
						break;
					}
				}
				if(che==1)
				{
					sum =a;
					now = b;
					for(int i =0;i<=c/2;i++)
					{
						ans[i]= (int) (i+1);
						ans[c-1-i]=now;
						now--;
						sum = sum -ans[i];
						if(sum<0)
						{
							che=1;
							break;
						}
					}
				}
			}
		}
	}

}
