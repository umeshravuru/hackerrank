/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class Pairs
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s  =new Scanner(System.in);
		int n = s.nextInt();
		int data [] = new int[n];
		for(int i =0;i<n;i++)
		{
			data[i]= s.nextInt();
		}
		int k = s.nextInt();
		
		System.out.println(diff_Same(data, k));
				
		
		
	}
	public static int diff_Same(int [] data, int  k)
	{
		int ans =0;
		Map<Integer, Integer> freq = new HashMap<>();
		for(int i =0;i<data.length;i++)
		{
			if(freq.get(data[i])==null)
				freq.put(data[i],1);
			else
				freq.put(data[i], freq.get(data[i])+1);
		}
		Map<Integer, Integer> done = new HashMap<>();
		for(int i =0;i<data.length;i++)
		{
			if(done.get(data[i])==null)
			{
				int now = data[i]+k;
				if(freq.get(now)!=null)
				{
					System.out.println(data[i]+","+now);
					ans++;
					done.put(data[i], 1);
				}
				
				
			}
			
//			int now = data[i]+k;
//			if(freq.get(data[i])!=null && freq.get(now)!=null)
//			{
//				ans++;
//				freq.put(data[i], freq.get(data[i])-1);
//				freq.put(now, freq.get(now)-1);
//				if(freq.get(data[i])==0)
//					freq.remove(data[i]);
//				if(freq.get(now)==0)
//					freq.remove(now);
//			}
			
			
		}
		
		
		
		
		return ans;
	}

}
