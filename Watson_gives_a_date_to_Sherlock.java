package webScrap.org.webScrap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Watson_gives_a_date_to_Sherlock {

	public static void main(String[] args) throws ParseException {

		Scanner s = new Scanner(System.in);

		int t = Integer.parseInt(s.nextLine());
		Map<String, String> months = new HashMap<String, String>();
		months.put("January", "01");
		months.put("February", "02");
		months.put("March", "03");
		months.put("April", "04");
		months.put("May", "05");
		
		months.put("June", "06");
		months.put("July", "07");
		months.put("August", "08");
		months.put("September", "09");
		months.put("October", "10");
		
		months.put("November", "11");
		months.put("December", "12");
		
		Map<String, String> monthsR = new HashMap<String, String>();
		monthsR.put("1","January");
		monthsR.put("2","February");
		monthsR.put("3","March");
		monthsR.put("4","April");
		monthsR.put("5","May");
		monthsR.put("6","June");
		monthsR.put("7","July");
		monthsR.put("8","August");
		monthsR.put("9","September");
		monthsR.put("10","October");
		monthsR.put("11","November");
		monthsR.put("12","December");

		for (int i = 0; i < t; i++) {
			String[] data = s.nextLine().split(" ");
			
			String myDate = data[2]+"/"+months.get(data[1])+"/"+data[0] +" 00:00:00";
//			System.out.println(myDate);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = sdf.parse(myDate);
			long millis = date.getTime();
//			System.out.println(millis);
			long ansNeed = millis - 86400000;
			
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(ansNeed);

			int mYear = calendar.get(Calendar.YEAR);
			int mMonth = calendar.get(Calendar.MONTH);
			int mDay = calendar.get(Calendar.DAY_OF_MONTH);
//			System.out.println(mMonth);
			System.out.println(mDay + " "+ monthsR.get(String.valueOf(mMonth+1)) + " "+ mYear);
			
			
		}

	}

}
