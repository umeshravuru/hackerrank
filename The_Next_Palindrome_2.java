package Code_chef;

import java.util.Scanner;

public class The_Next_Palindrome_2
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < n; ii++)
		{
			String data1 = s.nextLine();
			data1 = "0" + data1 + "0";

			char[] data = data1.toCharArray();

			if (data.length % 2 != 0)
			{
				int bigger = bigg(data1.substring(0, data1.length() / 2), data1
						.substring((data1.length() / 2) + 1, data1.length()));
				// System.out.println(data1.substring(0, data1.length()/2)+"
				// "+data1.substring((data1.length()/2)+1,data1.length()));
				char[] ans = new char[data1.length()];

				if (bigger == 1 || bigger ==0)
				{
					if (data[data.length / 2] == '9')
					{
						String now = Add_pandy(
								data1.substring(0, data1.length() / 2), "1");
						for (int i = 0; i < now.length(); i++)
						{
							ans[i] = now.charAt(i);
							ans[ans.length - 1 - i] = ans[i];
						}
						ans[data.length / 2] = '0';
					}

					else
					{
						String now = data1.substring(0, data1.length() / 2);
						for (int i = 0; i < now.length(); i++)
						{
							ans[i] = now.charAt(i);
							ans[ans.length - 1 - i] = ans[i];
						}
						int tem = 
						ans[data.length / 2] = (char)((int)ans[data.length / 2]+1);
					}
				} else if (bigger == -1)
				{
					if (data[data.length / 2] == '9')
					{
						String now = Add_pandy(
								data1.substring(0, data1.length() / 2), "1");
						for (int i = 0; i < now.length(); i++)
						{
							ans[i] = now.charAt(i);
							ans[ans.length - 1 - i] = ans[i];
						}
						ans[data.length / 2] = '0';
					}

					else
					{
						String now = Add_pandy(
								data1.substring(0, data1.length() / 2), "1");
						for (int i = 0; i < now.length(); i++)
						{
							ans[i] = now.charAt(i);
							ans[ans.length - 1 - i] = ans[i];
						}
						ans[data.length / 2] = (char)((int)ans[data.length / 2]+1);
					}
				}

				String ans1 = new String(ans);

				if (ans1.charAt(0) != '0')
					System.out.println(ans1);
				else
					System.out.println(ans1.substring(1, ans1.length() - 1));

			} else
			{
				int bigger = bigg(data1.substring(0, data1.length() / 2), data1
						.substring((data1.length() / 2) + 1, data1.length()));
				// System.out.println(data1.substring(0, data1.length()/2)+"
				// "+data1.substring((data1.length()/2),data1.length()));
				char[] ans = new char[data1.length()];
				if (data[(data.length / 2) - 1] == '9')
				{
					String now = Add_pandy(
							data1.substring(0, data1.length() / 2), "1");
					for (int i = 0; i < now.length(); i++)
					{
						ans[i] = now.charAt(i);
						ans[ans.length - 1 - i] = ans[i];
					}
				} else
				{
					String now = data1.substring(0, data1.length() / 2);
					for (int i = 0; i < now.length(); i++)
					{
						ans[i] = now.charAt(i);
						ans[ans.length - 1 - i] = ans[i];
					}
				}

				String ans1 = new String(ans);

				if (ans1.charAt(0) != '0')
					System.out.println(ans1);
				else
					System.out.println(ans1.substring(1, ans1.length() - 1));

			}

		}

	}

	public static int bigg(String a, String b)
	{
		for (int i = 0; i < a.length(); i++)
		{
			if (a.charAt(a.length() - 1 - i) > b.charAt(i))
				return 1;
			if (a.charAt(a.length() - 1 - i) > b.charAt(i))
				return -1;
		}
		return 0;
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
