package hack;

import java.util.Scanner;

public class Saving_daylight
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		while(s.hasNext())
		{
			String data1 = s.nextLine();
			String [] data = data1.split(" ");
			int t1=Integer.parseInt(data[3].split(":")[0]);
			int m1=Integer.parseInt(data[3].split(":")[1]);
			int t2=Integer.parseInt(data[4].split(":")[0]);
			int m2=Integer.parseInt(data[4].split(":")[1]);
			
			
			if(m2<m1)
			{
				m2=m2+60;
				t2--;
			}
			
			System.out.println(data[0]+" "+data[1]+" "+data[2]+" "+(t2-t1)+" hours "+(m2-m1)+" minutes");
		}
		
	}

}
