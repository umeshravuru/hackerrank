/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

/**

 */
public class pawan_hangout_problem
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		for(int i =8;i<100;i++)
		{
			int co =0;
			for(int i1=2;i1<100;i1++)
			{
				for(int i2=2;i2<100;i2++)
				{
					for(int i3=2;i3<100;i3++)
					{
						for(int i4=2;i4<100;i4++)
						{	
							if(i1+i2+i3+i4==i)
							{
								co++;
							}
						}
					}
				}
			}
			System.out.println(co+" ");
			
		}
	
	}

}
