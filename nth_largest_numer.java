/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Hackerrank;

import java.util.Scanner;

/**

 */
public class nth_largest_numer
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String tem = s.nextLine();
		tem = tem.substring(1, tem.length()-1);
		String tem1 [] = tem.split(",");
		int data [] = new int [tem1.length];
		for(int i =0;i<tem1.length;i++)
		{
			data[i]= Integer.parseInt(tem1[i]);
		}
		int k = Integer.parseInt(s.nextLine());
		System.out.println(kthSmallest(data,0,data.length-1,data.length-k+1));
		
	}
	
	
	public static int kthSmallest(int arr[], int l, int r, int k)
	{
	    if (k > 0 && k <= r - l + 1)
	    {
	        int pos = partition(arr, l, r);
	        if (pos-l == k-1)
	            return arr[pos];
	        if (pos-l > k-1)  // If position is more, recur for left subarray
	            return kthSmallest(arr, l, pos-1, k);
	        return kthSmallest(arr, pos+1, r, k-pos+l-1);
	    }
	    return 2147483647;
	}
	public static int partition(int arr[], int l, int r)
	{
	    int x = arr[r], i = l;
	    for (int j = l; j <= r - 1; j++)
	    {
	        if (arr[j] <= x)
	        {
	            arr= swap(arr, i,j);
	            i++;
	        }
	    }
	    arr= swap(arr, i,r);
	    return i;
	}	
	public static int [] swap(int data[],int a,int b)
	{
		int tem = data[a];
		data[a]= data[b];
		data[b]= tem;
		
		return data;
	}

}
