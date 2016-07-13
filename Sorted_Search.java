/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Hackerrank;

import java.util.Scanner;

/**

 */
public class Sorted_Search
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int data [] = {1,2,3,4,5,6,7,8,9,10};
		int target = s.nextInt();
		System.out.println(sorted_se(data, target));
		
	}

	
	public static int sorted_se(int [] data,int target)
	{
		if(data==null || data.length<=0)
			return -1;
		
		int left = 0;
		int right = data.length-1;
		
		while(left<right)
		{
			int middle = (left+ right)/2;
			if(data[middle]>target)
				right = middle-1;
			else 
				left= middle+1;
			
		}
		
		if(data[right]==target)
			return right;
		
		return -1;
	}
	
}
