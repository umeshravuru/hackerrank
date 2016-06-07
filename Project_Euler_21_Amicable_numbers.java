package beer_night;

import java.util.Arrays;
import java.util.Scanner;

public class Project_Euler_21_Amicable_numbers
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		int [] data = {220, 284, 1184, 1210, 2620, 2924, 5020, 5564, 6232, 6368, 10744, 10856, 12285, 14595, 17296, 18416, 63020, 76084, 66928, 66992, 67095, 71145, 69615, 87633, 79750, 88730};
		
		Arrays.sort(data);
		
		for(int i =0;i<t;i++)
		{
			int n = s.nextInt();
			int ans  =0 ;
			for(int j =0;j<data.length;j++)
			{
				if(data[j]>=n)
					break;
				else
					ans = ans+data[j];
			}
			System.out.println(ans);
		}
		
		
		
	}

}
