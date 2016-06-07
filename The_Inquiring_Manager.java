package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class The_Inquiring_Manager
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in );
		ArrayList<Integer> data_cost = new ArrayList<>();
		ArrayList<Integer> data_time = new ArrayList<>();
		
		int  n = s.nextInt();
		for(int ii =0;ii<n;ii++)
		{
			int now = s.nextInt();
			if(now ==1)
			{
				data_cost.add(s.nextInt());
				data_time.add(s.nextInt());
			}
			else
			{
				int max =-1;
				int time_query = s.nextInt();
				for(int i=data_time.size()-1;i>=0;i--)
				{
					if(data_time.get(i)>=time_query-59)
					{
						if(max <data_cost.get(i))
							max = data_cost.get(i);
					}
					else
					{
						break;
					}
				}
				System.out.println(max);
			}
		}
		
		
	}

}
