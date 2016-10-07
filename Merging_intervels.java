/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.ArrayList;

/**

 */
public class Merging_intervels
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		
	}
	
	public static ArrayList<int []> merge(ArrayList<int []>data,int x,int y)
	{
		
		int che =0;
		for(int i =0;i<data.size();i++)
		{
			if(data.get(i)[0]>x)
			{
				data.get(i)[0]=x;
				che =1;
				break;
			}
		}
		
		
		
		
		return data;
	}

}
