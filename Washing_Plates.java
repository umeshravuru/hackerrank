/**
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Washing_Plates
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = s.nextInt();
		}
		int c[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			b[i] = s.nextInt();
			c[i] = a[i] + b[i];
		}
		int count = 0;

		long ans = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n-1; j++)
			{
				if(c[j+1]>c[j])
				{
					int tem = c[j];
					c[j]= c[j+1];
					c[j+1]=tem;
					
					tem = b[j];
					b[j]= b[j+1];
					b[j+1]=tem;
					
					tem = a[j];
					a[j]= a[j+1];
					a[j+1]=tem;
				}
			}
		}
		
		for(int i =0;i<k;i++)
		{
			ans = ans + a[i];
		}
		for(int i=k;i<n;i++)
		{
			ans = ans - b[i];
		}
		System.out.println(ans);
		

	}

}
