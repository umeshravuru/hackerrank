package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Two_Two_1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data_base[] = new String[801];
		data_base[0] = "1";
		data_base[1] = "2";

		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		x.add(0);
		int len = 1;
		for (int i = 2; i <= 800; i++)
		{
			data_base[i] = Add_pandy(data_base[i - 1], data_base[i - 1]);
			// System.out.println(i + " " + data_base[i]);
			if (data_base[i].length() > len)
			{
				y.add(i - 1);
				len++;
				if (len != 1)
					x.add(i);
			}

		}
		
		int t = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < t; ii++)
		{
			String data = s.nextLine();
			long final_ans = 0;
			for(int i =0;i<data_base.length;i++)
			{
				for(int j =0;j<data.length()-data_base[i].length()+1;j++)
				{
					System.out.println(data.substring(j,j+data_base[i].length()));
//					if(data.substring(i,j).equals(data_base[i]))
//						final_ans++;
				}
				
			}
			System.out.println(final_ans);
			
			
		}
		
		
		
		
	}
	
	public static String Add_pandy(String a, String b)
	{
		// System.out.println(a + " " + b);
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
