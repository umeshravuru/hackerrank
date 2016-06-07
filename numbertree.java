package hack;

import java.util.Scanner;

public class numbertree
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data1 = s.nextLine();
		int n = Integer.parseInt(data1.split(" ")[0]);
		if(data1.split(" ").length==1)
		{
			System.out.println((long)Math.pow(2, n+1)-1);
		}
		else
		{
		String data = data1.split(" ")[1];
		
		long present = (long) (Math.pow(2, n+1)-1);
		long sum1=0;
		String bin="";
		for(int i =0;i<data.length();i++)
		{
			sum1=(long) (sum1+Math.pow(2, i+1));
			if(data.charAt(i)=='L')
				bin=bin+"1";
			else
				bin=bin+"0";
			
		}
//		System.out.println(present);
//		System.out.println(sum1);
//		System.out.println(bin);
		System.out.println(present-sum1+Integer.parseInt(bin,2));
		}
		
	}

}
