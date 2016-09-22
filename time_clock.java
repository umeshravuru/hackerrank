/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

/**

 */
public class time_clock
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println(sol(9, 1, 9, 7));
	}

	public static String sol(int a, int b, int c, int d)
	{
		String ans = "";
		int data[] =
		{a, b, c, d};
		int max_hours = 0;
		int max_mins = 0;
		for (int i1 = 0; i1 < 4; i1++)
		{

			for (int i2 = 0; i2 < 4; i2++)
			{
				if (i1 != i2)
				{
					for (int i3 = 0; i3 < 4; i3++)
					{
						if (i3 != i1 && i3 != i2)
						{
							for (int i4 = 0; i4 < 4; i4++)
							{
								if (i4 != i1 && i4 != i2 && i4 != i3)
								{
									System.out.print(i1 + " " + i2 + " " + i3
											+ " " + i4+"--");
									int hours = data[i1] * 10 + data[i2];
									int mins = data[i3] * 10 + data[i4];
									System.out.println(hours+":"+mins);
									
									if (hours < 24 && mins <= 59)
									{
										if (max_hours < hours)
										{
											max_hours = hours;
											max_mins = mins;
										} else if (max_hours == hours)
										{
											if (max_mins < mins)
												max_mins = mins;
										}

									}
								}
							}
						}
					}
				}
			}
		}

		if (max_hours == 0 && max_mins == 0)
			return "NOT POSSIBLE";
		else
			return String.valueOf(max_hours) + ":" + String.valueOf(max_mins);
	}

}
