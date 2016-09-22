/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class Lecture_Notes
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		String tem = s.nextLine();
		String tems []  = tem.split(" ");
		int n = Integer.parseInt(tems[0]);
		int k = Integer.parseInt(tems[1]);
		String data = s.nextLine();
		tem = s.nextLine();
		tems = tem.split(" ");
		int che=0;
		for(int i =0;i<k;i++)
		{
			if(data.charAt(Integer.parseInt(tems[i])-1)=='0')
			{
				che=1;
				break;
			}
		}
		
		if(che==1)
			System.out.println("YES"); 
		else
			System.out.println("NO");
		
	}

}
