package hack;

import java.util.Scanner;

public class Garmin_code2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int minx=600;
		int miny=600;
		int maxx=-600;
		int maxy=-600;
		int [][] data = new int [n][4];
		for (int i = 0; i < n; i++)
		{
			data[i][0]=s.nextInt();
			data[i][1]=s.nextInt();
			data[i][2]=s.nextInt();
			data[i][3]=s.nextInt();
			if(data[i][0]>maxx)
				maxx = data[i][0];
			if(data[i][0]<minx)
				minx = data[i][0];
			
			if(data[i][2]>maxx)
				maxx = data[i][2];
			if(data[i][2]<minx)
				minx = data[i][2];
			
			if(data[i][1]>maxy)
				maxy = data[i][1];
			if(data[i][1]<miny)
				miny = data[i][1];
			
			if(data[i][3]>maxy)
				maxy = data[3][0];
			if(data[i][3]<miny)
				miny = data[3][0];
		}
		
		
		System.out.println(maxx+" "+minx);
		System.out.println(maxy+" "+miny);

	}

}
