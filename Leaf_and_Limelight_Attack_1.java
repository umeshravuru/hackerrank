package hack;

import java.util.Scanner;

public class Leaf_and_Limelight_Attack_1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int len = 10000001;
//		int len = 100;
		String ans[] = new String[len];

		ans[1] = "0";
		long num1 =0;
		String sum1 ="1";
		long num2 =0;
		String sum2 ="1";
		
		for (long ii = 2; ii < ans.length; ii++)
		{
			num1 = ii*ii - ii +1;
			sum1 = Add_pandy(sum1, String.valueOf(num1));
			if (ii % 2 == 0)
			{
				num2 = (long) (2*ii + 4* Math.floor(((ii-1)*(ii-1))/4));
				num2++;
			} else
			{
				int now = (int) (ii-1);
				num2 = (long) ((3+ 4*now + 2* now*now - Math.pow(-1, now))/2);
			}
			sum2 = Add_pandy(sum2, String.valueOf(num2));
			ans[(int) ii]= Add_pandy(sum1, sum2);
//			System.out.println(ans[(int) ii]); 
			
		}
		System.out.println(ans[10000000]);
		
		

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
}
