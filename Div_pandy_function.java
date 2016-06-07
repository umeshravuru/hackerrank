package hack;

import java.util.Scanner;

public class Div_pandy_function
{

	public static void main(String[] args) throws InterruptedException
	{
		Scanner s = new Scanner(System.in);
		// String a = s.nextLine();
		// String b = s.nextLine();
		String a = "100";
		String b = "3";
//		System.out.print ln(sub_func(a, b));
		System.out.println(div_func(a, b));

	}

	public static String sub_func(String a, String b) throws InterruptedException
	{
		System.out.println(a+" "+b );
		Thread.sleep(100);
		String ans = "";
		int min_len = Math.min(a.length(), b.length());
		int a_len = a.length();
		int b_len = b.length();
		for (int i = 0; i < b_len - min_len; i++)
		{
			a = "0" + a;
		}
		for (int i = 0; i < a_len - min_len; i++)
		{
			b = "0" + b;
		}
		if(a.equals(b))
			return "0";
		for (int i = a.length() - 1; i >= 0; i--)
		{
			if ((int) a.charAt(i) < (int) b.charAt(i))
			{
				ans = String.valueOf((int) a.charAt(i) - (int) b.charAt(i) + 10)
						+ ans;
				
				if(i==1)
				{
					a= String.valueOf((int)a.charAt(0)-49)+a.substring(1,a.length());
					//System.out.println(a);
				}
				for (int j = i - 1; j >0; j--)
				{
					
					if (a.charAt(j) == '0')
					{
						a = a.substring(0, j) + "9"
								+ a.substring(j+1, a.length());
						if(j==1)
						{
							a= String.valueOf((int)a.charAt(0)-49)+a.substring(1,a.length());
						}
					} else
					{
						a = a.substring(0, j )
								+ String.valueOf((int) a.charAt(j) - 49)
								+ a.substring(j+1, a.length());
						if(j==1)
						{
							a= String.valueOf((int)a.charAt(0)-49)+a.substring(1,a.length());
						}
						break;
					}
				}
			} else
			{
				ans = String.valueOf((int) a.charAt(i) - (int) b.charAt(i))
						+ ans;
			}
		}
		
//		System.out.println(ans);
		return ans;
	}
	
	public static String div_func(String a, String b) throws InterruptedException
	{

		int min_len = Math.min(a.length(), b.length());
		int a_len = a.length();
		int b_len = b.length();
		for (int i = 0; i < b_len - min_len; i++)
		{
			a = "0" + a;
		}
		for (int i = 0; i < a_len - min_len; i++)
		{
			b = "0" + b;
		}
		
		while(bigg(a,b))
		{
			a= sub_func(a, b);
		}
		
		
		
		return a;
	}
	
	public static boolean bigg(String a, String b)
	{
		int min_len = Math.min(a.length(), b.length());
		int a_len = a.length();
		int b_len = b.length();
		for (int i = 0; i < b_len - min_len; i++)
		{
			a = "0" + a;
		}
		for (int i = 0; i < a_len - min_len; i++)
		{
			b = "0" + b;
		}
		
		for(int i =0;i<a.length();i++)
		{
			if(a.charAt(i)<b.charAt(i))
				return false;
			else if(a.charAt(i)>b.charAt(i))
				return true;
		}
		
		return true;
	}
	
	

}
