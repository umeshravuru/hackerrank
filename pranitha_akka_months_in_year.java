/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;

import java.util.Scanner;

/**

 */
public class pranitha_akka_months_in_year
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int Y = Integer.parseInt(s.nextLine());
		String m1 = s.nextLine();
		String m2 = s.nextLine();
		String D = s.nextLine();
		sol(Y,m1,m2,D); 
		

	}

	public static int sol(int Y, String m1, String m2, String D)
	{
		int ans = 0;

		String[] months_s =
		{"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"};

		String[] day_s =
		{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
				"Sunday"};
		int day=0;
		for(int i =0;i<day_s.length;i++)
		{
			if(day_s[i].equals(D))
			{
				day = i+1;
				break;
			}
		}
		int days_in_month [] ={31,28,31,30,31,30,31,31,30,31,30,31};
		if(Y%4==0)
			days_in_month[1]=29;
		int month1 = 0;
		for(int i =0;i<months_s.length;i++)
		{
			if(months_s[i].equals(m1))
			{
				month1 = i+1;
				break;
			}
		}
		int month2=0;
		for(int i =0;i<months_s.length;i++)
		{
			if(months_s[i].equals(m2))
			{
				month2 = i+1;
				break;
			}
		}
		int total_days1 =0;
		for(int i =0;i<month1;i++)
		{
			total_days1 = total_days1+ days_in_month[i];
		}
		int total_days2 =0;
		for(int i =0;i<month2;i++)
		{
			total_days2 = total_days2+ days_in_month[i];
		}
		int total_days = 0;
		for(int i =month1;i<=month2;i++)
		{
			total_days = total_days+ days_in_month[i];
		}
		if(Y%4==0)
		{
			total_days1++;
			total_days2++;
		}
		
		int final_day_needed=day;
		for(int i =1;i<month1;i++)
		{
			if(days_in_month[i]==31)
			{
				final_day_needed= final_day_needed+3;
				if(final_day_needed>7)
					final_day_needed=final_day_needed-7;
			}
			if(days_in_month[i]==30)
			{
				final_day_needed= final_day_needed+2;
				if(final_day_needed>7)
					final_day_needed=final_day_needed-7;
			}
			
			if(days_in_month[i]==29)
			{
				final_day_needed= final_day_needed+1;
				if(final_day_needed>7)
					final_day_needed=final_day_needed-7;
			}
//			System.out.println(final_day_needed);
		}
		
		int offset =0;
		if(day!=0)
			offset =7-final_day_needed;
		int ans1 = (total_days1-offset)/7;
		int ans2 = (total_days2-offset)/7;
//		System.out.println(offset+" "+month1+" "+month2+" "+total_days);
//		System.out.println(ans1);
//		System.out.println(ans2);
//		System.out.println(final_day_needed);
//		System.out.println(ans2-ans1);
		System.out.println((total_days-offset)/7);
//		for(int i =0;i<month1;i++)
//		{
//			int current_month_days = days_in_month[i];
//			int present_day=1;
//			if(day!=0)
//				present_day =8-day;
//			
//			for(int  j=0;j<)
//			
//		}
//		
		
		
		
		
		return ans;
	}

}
