package hack;

import java.util.Scanner;

public class Kitchen_Timetable
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t= s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n = s.nextInt();
			int [] data1 = new int [n+1];
			int [] data2 = new int [n];
			for(int i =0;i<n;i++)
			{
				data1[i+1]=s.nextInt();
			}
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(s.nextInt()<=data1[i]-data1[i-1])
					count++;
			}
			System.out.println(count);
		}
		
		
		
	}

}
