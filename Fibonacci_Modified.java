package hack;

import java.util.Scanner;

public class Fibonacci_Modified
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		String[] data = new String[c];
		data[0]=String.valueOf(a);
		data[1]=String.valueOf(b);
		for(int i =2;i<c;i++)
		{
			
			String tem = Mult_pandy(data[i-1], data[i-1]);
			
			data[i]=Add_pandy(tem, data[i-2]);
			
			
			System.out.println(data[i]);
			
		}
		
		
		
		
//		String d = Add_pandy(String.valueOf(a), String.valueOf(b));
//		System.out.println(d);
//		 System.out.println(Mult_pandy(String.valueOf(a), String.valueOf(b)));

	}

	public static String Add_pandy(String a, String b)
	{
//		System.out.println(a + " " + b);
		String ans = "";
		if (a.length() != b.length())
		{
			int len1 = a.length();
			int len2 = b.length();
			int lenght_max = Math.max(len1, len2);

			for (int i = 0; i < lenght_max - len1; i++)
			{
				a = "0" + a;
			}
			for (int i = 0; i < lenght_max - len2; i++)
			{
				b = "0" + b;
			}
		}

		int carry = 0;
		int tem = 0;
		for (int i = a.length() - 1; i >= 0; i--)
		{
			tem = Integer.parseInt(String.valueOf(a.charAt(i)))
					+ Integer.parseInt(String.valueOf(b.charAt(i))) + carry;
			if (tem >= 10)
				carry = 1;
			else
				carry = 0;
			ans = String.valueOf(tem % 10) + ans;
		}
		if (carry == 1)
			ans = String.valueOf(carry) + ans;

		// System.out.println(a);
		// System.out.println(b);

		return ans;
	}

	public static String Mult_pandy(String a, String b)
	{

		if (b.length() > a.length())
		{
			String tem1 = a;
			a = b;
			b = tem1;
		}
		String bb = "0";
		int len1 = a.length();
		int len2 = b.length();
		for (int i = len2 - 1; i >= 0; i--)
		{
			String aa = "";
			int carry = 0;
			int tem = 0;
			for (int j = len1 - 1; j >= 0; j--)
			{
				tem = Integer.parseInt(String.valueOf(a.charAt(j)))
						* Integer.parseInt(String.valueOf(b.charAt(i))) + carry;
				if (tem >= 10)
					carry = tem / 10;
				else
					carry = 0;
				aa = String.valueOf(tem % 10) + aa;
			}
			if (carry >= 1)
				aa = String.valueOf(carry) + aa;
			for (int j = 0; j < len2 - 1 - i; j++)
			{
				aa = aa + "0";
			}
			bb = Add_pandy(aa, bb);

		}

		return bb;
	}

}
