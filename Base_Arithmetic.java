package hack;

import java.util.Scanner;

public class Base_Arithmetic
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data1=s.nextLine();
		String data2=s.nextLine();
		int d1=0;
		int d2=0;
		char[] data = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
		
		for(int i=0;i<data1.length();i++ )
		{
			if((int)data1.charAt(i)>d1)
				d1=(int)data1.charAt(i);
		}
		for(int i=0;i<data2.length();i++ )
		{
			if((int)data2.charAt(i)>d2)
				d2=(int)data2.charAt(i);
		}
		
		System.out.println(d1+" "+d2);
		if(d1>=65)
			d1=d1-55;
		else
			d1=d1-48;
		
		
		if(d2>=65)
			d2=d2-55;
		else
			d2=d2-48;
		
		
//		System.out.println(d1+" "+d2);
		
		
		long ans1=0;
		long ans2=0;
		for(int i=0;i<data1.length();i++ )
		{
			int mult=0;
			if((int)data1.charAt(i)>=65)
				mult=(int)data1.charAt(i)-55;
			else
				mult=(int)data1.charAt(i)-48;
				ans1=(long) (ans1+Math.pow(d1+1, data1.length()-1-i)*mult);
			
		}
		
		for(int i=0;i<data2.length();i++ )
		{
			int mult=0;
			if((int)data2.charAt(i)>=65)
				mult=(int)data2.charAt(i)-55;
			else
				mult=(int)data2.charAt(i)-48;
				ans2=(long) (ans2+Math.pow(d2+1, data2.length()-1-i)*mult);
			
		}
		
//		System.out.println(ans1);
//		System.out.println(ans2);
		
		System.out.println(ans1+ans2);
		
		
		
	}

}
