/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.ArrayList;
import java.util.Scanner;

/**

 */
public class pranitha_akka_increase_array
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data [] = new int [n];
		for(int i =0;i<n;i++)
		{
			data[i]= s.nextInt();
		}
		System.out.println(sol(data));

	}
	
	public static int sol(int[] data)
	{
		int tem =1;
		ArrayList<Integer> max_values = new ArrayList<>();
		ArrayList<Integer> max_index = new ArrayList<>();
		
		
		
 		for(int i =1;i<data.length;i++)
		{
 			if(data[i-1]<data[i])
 				tem++;
 			else
 			{
 				max_values.add(tem);
 				max_index.add(i);
 				tem =1;
 			}
		
		}
 		max_values.add(tem);
 		max_index.add(data.length);
// 		System.out.println(max_values);
//		System.out.println(max_index);
		int main_maxxx =0;
		int main_max_index=-1;
		for(int i =0;i<max_values.size();i++)
		{
			if(main_maxxx<max_values.get(i))
			{
				main_maxxx= max_values.get(i);
				main_max_index = max_index.get(i);
			}
		}
		return main_max_index-main_maxxx;
	}
	

}
