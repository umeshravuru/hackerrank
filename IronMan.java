/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

/**

 */
public class IronMan
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		
		
	}
	public static int sol(int data[])
	{
		int min = 200;
		int sum = 0;
		for(int i=0;i<data.length;i++)
		{
			sum = sum + data[i]; 
			min = Math.min(min, sum);
		}
		
		
		return min*-1+1;
	}
}
