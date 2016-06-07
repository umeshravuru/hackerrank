package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class poceket_gems
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		ArrayList<String> data = new ArrayList<String>();
		
//		while()
//		{
			data.add(s.nextLine());
			data.add(s.nextLine());
			System.out.println(data.get(0));
//		}
		
		System.out.println(diff(data.get(0),data.get(1)));

	}
	
	
	
	public static int diff(String a,String b)
	{
		int yy1=Integer.parseInt(a.substring(7, 11));
		int yy2=Integer.parseInt(b.substring(7, 11));
		
		int mm1=Integer.parseInt(a.substring(4, 6));
		int mm2=Integer.parseInt(b.substring(4, 6));
		
		int dd1=Integer.parseInt(a.substring(1, 3));
		int dd2=Integer.parseInt(b.substring(1, 3));
		
		int hh1=Integer.parseInt(a.substring(12, 14));
		int hh2=Integer.parseInt(b.substring(12, 14));
		
		int mi1=Integer.parseInt(a.substring(15, 17));
		int mi2=Integer.parseInt(b.substring(15, 17));
		
		int ss1=Integer.parseInt(a.substring(18, 20));
		int ss2=Integer.parseInt(b.substring(18, 20));
		
//		int ans = (yy2-yy1)+(mm1-mm2)
		
		long t1=Math.min(yy1, yy2)-yy1;
		
		
		
		
		
		System.out.println(ss2);
		
		return 1;	
	}

}
