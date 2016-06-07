package hack;

import java.util.Scanner;

public class Emma_ans_squares
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n =Integer.parseInt(s.nextLine());
		String[] data = new String[n];
		for(int i =0;i<n;i++)
		{
		data[i]=s.nextLine();
		}
			count(data);
		
		
	}
	
	public static void count(String [] arr)
	{
		
		
		for(int i =0;i<arr.length;i++)
		{
			String[] data1= arr[i].split(" ");
			long a =Long.parseLong(data1[0]);
			long b =Long.parseLong(data1[1]);
			
			long bb = (long) Math.floor(Math.sqrt(b));
			long aa = (long) Math.ceil(Math.sqrt(a));
			System.out.println(bb+" "+aa);
			if(bb<aa)
				System.out.println("0");
			else
				System.out.println(bb-aa+1);
			
			
		}
		
	}

}
