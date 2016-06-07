package hack;

import java.util.Scanner;

public class Div_pandy_function_2
{

	public static void main(String[] args) throws InterruptedException  //// working 
	{
		Scanner s = new Scanner(System.in);
		// String a = s.nextLine();
		// String b = s.nextLine();
		String a = "390583485903";
		String b = "1000000007";
//		System.out.println(sub_func(a, b));
		 System.out.println(mod_func(a, b));

	}

	public static String sub_func(String a, String b)
			throws InterruptedException
	{
//		 System.out.println(a + " " + b);
//		Thread.sleep(100);
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
		if (a.equals(b))
			return "0";

		int aaa[] = new int[a.length()];
		int bbb[] = new int[b.length()];
		for (int i = 0; i < a.length(); i++)
		{
			aaa[i] = (int) a.charAt(i) - 48;
			bbb[i] = (int) b.charAt(i) - 48;
		}

		for (int i = a.length() - 1; i >= 0; i--)
		{
			if (bbb[i] > aaa[i])
			{
				ans = String.valueOf(aaa[i] - bbb[i] + 10) + ans;
				for (int j = i - 1; j >= 0; j--)
				{
					if (aaa[j] == 0)
					{
						aaa[j] = 9;
					} else
					{
						aaa[j] = aaa[j] - 1;
						break;
					}
				}

			} else
			{
				ans = String.valueOf(aaa[i] - bbb[i]) + ans;
			}
		}

		return ans;
	}
	public static String mod_func(String a, String b) throws InterruptedException
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
