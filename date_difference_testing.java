package hack;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class date_difference_testing
{

	public static void main(String[] args)
	{
		String a0="02/10/2016 08:51:42 PM";
		String b0="01/01/2014 08:51:50 PM";
		
		a0=a0.replace('/', '-');
		a0=a0.replace(" ", "-");
		a0=a0.replace(":", "-");

		b0=b0.replace("/", "-");
		b0=b0.replace(" ", "-");
		b0=b0.replace(":", "-");
		
//		String a = "04-11-2014-11-45-34-243"; /// older lets assume
	//	String b = "04-12-2014-11-45-34-243"; ////
		String a=a0;
		String b=b0;
		
		String[] aa = a.split("-");
		String[] bb = b.split("-");
		//// we caliculate number of days first
		int year1=Integer.parseInt(aa[2]);
		int year2=Integer.parseInt(bb[2]);
		
		int month1=Integer.parseInt(aa[0]);
		int month2=Integer.parseInt(bb[0]);
		
		int date1=Integer.parseInt(aa[1]);
		int date2=Integer.parseInt(bb[1]);
		
		
		/// number of days for first input
		
		
		
		int total_days1=0;
		int min_year = Math.min(year1, year2);
		for(int i=min_year;i<year1;i++)
		{
			if(i%4==0)
				total_days1=total_days1+365;
			else
				total_days1=total_days1+364;
		}
		int total_days2=0;
		for(int i=min_year;i<year2;i++)
		{
			if(i%4==0)
				total_days2=total_days2+365;
			else
				total_days2=total_days2+364;
		}
//		System.out.println(total_days1);
		int[] days_in_month_year = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] days_in_month_year_leap = {31,29,31,30,31,30,31,31,30,31,30,31};
		for(int i=0;i<month1-1;i++)
		{
			if(year1%4==0)
				total_days1=total_days1+days_in_month_year_leap[i];
			else
				total_days1=total_days1+days_in_month_year[i];
		}
		for(int i=0;i<month2-1;i++)
		{
			if(year2%4==0)
				total_days2=total_days2+days_in_month_year_leap[i];
			else
				total_days2=total_days2+days_in_month_year[i];
		}
		
		total_days1=total_days1+date1;
		total_days2=total_days2+date2;
		System.out.println(total_days1);
		System.out.println(total_days1-total_days2);
		
	}

}
