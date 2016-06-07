package hack;

import java.util.Scanner;

public class Half_a_Cookie
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext())
		{
		Float r = s.nextFloat();
		Float x = s.nextFloat();
		Float y = s.nextFloat();
		x=(float) Math.sqrt(x*x+y*y);
		
		
		if(x>=r)
		{
		System.out.println("miss");
		}
		else
		{
		float ans1 = 0;
		float ans2 = 0;
		float val = (float) Math.sqrt(r*r-x*x);
		ans1 = (float) (((Math.PI*r*r)/2)+(r*r*Math.atan(x/val))+(x*val));
		ans2 = (float) (Math.PI*r*r-ans1);
		
		
		if(ans1>ans2)
			System.out.println(ans1+" "+ans2);
		else
			System.out.println(ans2+" "+ans1);
		
		}
		}
	}

}
