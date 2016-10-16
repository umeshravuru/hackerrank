/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Playlist
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String data[] = new String[n];
		for (int i = 0; i < n; i++)
		{
			data[i] = s.nextLine();
		}
		int k = Integer.parseInt(s.nextLine());
		String q = s.nextLine();
		System.out.println(sol(data, k, q));
	}

	public static int sol(String[] data, int k, String q)
	{

		int ans1 = 0;
		int ans2 = 0;	
		
		int tem = k;
		while(true){
			if(data[tem].equals(q))
				break;
			else
			{
				ans1++;
				tem++;
			}
			if(tem==data.length)
				tem = 0;
		}
		tem =k;
		while(true){
			if(data[tem].equals(q))
				break;
			else
			{
				ans2++;
				tem--;
			}
			if(tem==-1)
				tem = data.length-1;
		}

		return Math.min(ans1, ans2);
	}

}
