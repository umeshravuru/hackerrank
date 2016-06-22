package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Two_Two
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
			 System.out.println(i + " " + data_base[i]);
			if (data_base[i].length() > len)
			{
				y.add(i - 1);
				len++;
				if (len != 1)
					x.add(i);
			}

		}
		// System.out.println(x);
		// System.out.println(y);
		// System.out.println(data_base[800].length());
		int t = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < t; ii++)
		{
			String data = s.nextLine();
			long final_ans = 0;
			for (int j = data.length(); j > 0; j--)
			{
				if (	   data.charAt(j-1) == '2'
						|| data.charAt(j-1) == '4'
						|| data.charAt(j-1) == '6'
						|| data.charAt(j-1) == '8'
						)
				{
				for (int i = 0; i < j; i++)
				{
//					 System.out.println(data.substring(i,j));
					String now = data.substring(i, j);
					// System.out.println(now.charAt(now.length()-1)+" "+now);
//					if (now.charAt(now.length() - 1) == '2'
//							|| now.charAt(now.length() - 1) == '4'
//							|| now.charAt(now.length() - 1) == '6'
//							|| now.charAt(now.length() - 1) == '8'
//							|| now.equals("1"))
					
//					{
//						if(now.equals("1"))
//							final_ans++;
						if (now.charAt(0) != '0')
						{
							if (now.length() < 241)
							{
								int xx = x.get(now.length() - 1);
								int yy = y.get(now.length() - 1);
								int che = 0;
								for (int k = xx; k <= yy; k++)
								{
									if (data_base[k].equals(now))
									{
										final_ans++;
										break;
									}
								}
							}
						}

//					} else
//					{
////						j--;
//						break;
//					}

				}

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
