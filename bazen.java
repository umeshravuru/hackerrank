package beer_night;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bazen
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		float x = s.nextFloat();
		float y = s.nextFloat();
		DecimalFormat frmt = new DecimalFormat("##.00");
		if (x == 0 && y >= 125)
		{
			float ans =31250/y;
			 
			System.out.println("0.00 "+frmt.format(ans));
		} else if (y == 0 && x >= 125)
		{
			float ans =31250/x;
			System.out.println(frmt.format(ans)+" 0.00");
		} else if(x==0 && y<125)
		{
			float y1=250-y ; //// modified
			float dis =(float) ((31250*Math.sqrt(2))/y1);
			float	ans =(float) (250- Math.sqrt((dis*dis)/2));
			
			System.out.println(frmt.format(250-ans)+" "+frmt.format(ans));
		}else if(x<125 && y==0)
		{
			float y1=250-x ; //// modified
			float dis =(float) ((31250*Math.sqrt(2))/y1);
			float	ans =(float) (250- Math.sqrt((dis*dis)/2));
			
			System.out.println(frmt.format(ans)+" "+frmt.format(250-ans));
		}else if(x+y==250 && x>y)
		{
			float dis1 = (float) Math.sqrt((x*x)+((250-y)*(250-y)));
			float ans = (float) (31250*Math.sqrt(2)/dis1);
			if(Math.abs(ans)<0.001 || Math.abs(ans-250)<0.001)
				System.out.println("0.00 0.00");
			else
			System.out.println("0.00 "+frmt.format(250-ans));
		}
		else  /// x+y ==250 x<=y
		{
//			System.out.println("jkh");
			float dis1 = (float) Math.sqrt((y*y)+((250-x)*(250-x)));
			float ans = (float) (31250*Math.sqrt(2)/dis1);
//			System.out.println(ans);
			if(Math.abs(ans)<0.001 || Math.abs(ans-250)<0.001)
				System.out.println("0.00 0.00");
			else
			System.out.println(frmt.format(250-ans)+" 0.00");
		}

	}

}
