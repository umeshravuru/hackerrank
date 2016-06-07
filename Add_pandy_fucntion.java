package hack;

import java.util.Scanner;

public class Add_pandy_fucntion
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String a =s.nextLine();
		String b =s.nextLine();
		
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

//		return ans;
		
		System.out.println(ans);

	}

}
