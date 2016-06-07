package hack;

import java.util.Scanner;

public class Big_Number_Operations
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());// s.nextInt();

		for (int ii = 0; ii < t; ii++)
		{
			String a = s.nextLine();
			String b = s.nextLine();

			boolean bigger = big(a, b);
//			System.out.println(big(a, b));
//			System.out.println(add(a, b));
			System.out.println(div(a,b));
			

		}

	}

	public static boolean big(String a, String b)
	{
		
		if(a.length()>b.length())
			return false;
		

		for (int i = 0; i < Math.min(a.length(), b.length()); i++)
		{

			if (a.charAt(i) < b.charAt(i))
				return true;
			if (a.charAt(i) < b.charAt(i))
				return false;

		}
		return true;

	}

	public static String add(String a, String b)
	{

		String ans = "";
		int carry = 0;
		String tem = "";
		for (int i = a.length() - 1; i >= 0; i--)
		{
			tem = String.valueOf(Integer.parseInt(String.valueOf(a.charAt(i)))
					+ Integer.parseInt(String.valueOf(b.charAt(i))) + carry);

			ans = tem.charAt(tem.length() - 1) + ans;
			if (tem.length() >= 2)
				carry = Integer.parseInt(tem.substring(0, tem.length() - 1));
			else
			{
				carry = 0;
			}

//			 System.out.println(ans);

		}

		if (carry != 0)
			return String.valueOf(carry) + ans;
		else
			return ans;

	}
	
	
	public static String div(String a,String b)
	{

		int ans =2;
		String tem ="";
		for(int i =0;i<b.length();i++)
		{
			tem = tem +"0";
		}
			
		while(big(tem,b))
		{
			tem =mult(b,String.valueOf(ans));
			ans++;
			
			System.out.println(tem);
			
		}
			
		
		return String.valueOf(ans);
	}
	
	
	public static String mult(String a, String b)
	{
		String ans ="";
		int carry =0;
		for(int i =a.length()-1;i>=0;i--)
		{
			String tem = String.valueOf(Integer.parseInt(b)*Integer.parseInt(String.valueOf(a.charAt(i)))+carry);
			ans= tem.charAt(tem.length()-1)+ans;
			if (tem.length() >= 2)
				carry = Integer.parseInt(tem.substring(0, tem.length() - 1));
			else
				carry = 0;
		}
		
		if (carry != 0)
			return String.valueOf(carry) + ans;
		else
			return ans;
		
	}

}
