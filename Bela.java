/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package Kattis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class Bela
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		String tem = s.nextLine();
		String tem1[] = tem.split(" ");
		
		int n = Integer.parseInt(tem1[0]);
		Map<String, Integer> key1 = new HashMap<>();
		Map<String, Integer> key2 = new HashMap<>();
		
		key1.put("A",11);
		key2.put("A",11);
		
		key1.put("K",4);
		key2.put("K",4);
		
		key1.put("Q",3);
		key2.put("Q",3);
		
		key1.put("J",20);
		key2.put("J",2);
		
		key1.put("T",10);
		key2.put("T",10);
		
		key1.put("9",14);
		key2.put("9",0);
		
		key1.put("8",0);
		key2.put("8",0);

		key1.put("7",0);
		key2.put("7",0);
		int ans =0;
		for(int i =0;i<4*n;i++)
		{
			tem = s.nextLine();
			if(tem.contains(tem1[1]))
				ans = ans + key1.get(tem.substring(0, 1));
			else
				ans = ans + key2.get(tem.substring(0, 1));
			
//			System.out.println(ans);
		}
		System.out.println(ans);
		
	}

}
