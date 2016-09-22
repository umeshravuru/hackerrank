/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class Minimum_Index_Difference
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int [n];
		int b[] = new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]= s.nextInt();
		}
		Map<Integer, Integer> index = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			b[i]= s.nextInt();
			index.put(b[i], i);
		}
//		ArrayList<E>
		int min = 4000;
		int ans = 10002;
		for(int i =0;i<n;i++)
		{
			int now = Math.abs(i-index.get(a[i]));
//			System.out.println(now);
			if(now<min)
			{
				min = now;
				ans = a[i];
			}
			else if(now==min)
			{
				if(ans>a[i])
					ans = a[i];
			}
		}
		System.out.println(ans);
		
		
		
	}

}
