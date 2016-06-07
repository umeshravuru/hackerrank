package beer_night;

import java.util.Scanner;


public class differentdistances
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		 
		String data1 = s.nextLine();
		while(true)
		{
			if(data1.equals("0"))
				break;
			else
			{
				String [] data = data1.split(" ");
				double x1 = Double.parseDouble(data[0]);
				double y1 = Double.parseDouble(data[1]);
				double x2 = Double.parseDouble(data[2]);
				double y2 = Double.parseDouble(data[3]);
				double p = Double.parseDouble(data[4]);
				
				double x3 = Math.abs(x1-x2);
				double y3 = Math.abs(y1-y2);
				double ans = (double)Math.pow((double)Math.pow(x3, p)+(double)Math.pow(y3, p),1/p);
				System.out.println((double)Math.round(ans * 1000000d) / 1000000d);
				
				
			}
			
			data1= s.nextLine();
			
		}
		
		
	}

}
