package Code_chef;

import java.util.Scanner;

public class The_Next_Palindrome_1
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
				int che = 0;
				for (int i = 1; i <= data.length / 2; i++)
				{
					if (data[(data.length / 2) - i] > data[(data.length / 2)
							+ i])
					{
						data[(data.length / 2) + i] = data[(data.length / 2)
								- i];
						che = 1;
					}
					if (data[(data.length / 2) - i] < data[(data.length / 2)
							+ i])
					{
						data[(data.length / 2) + i] = data[(data.length / 2)
						   								- i];
					}
				}
				if (che == 0) /// data[(data.length/2)]
				{
					if (data[(data.length / 2)] != '9')
					{
						int now = Integer.parseInt(
								String.valueOf(data[(data.length / 2)]));
						now++;
						data[(data.length / 2)] = (char) (now + 48);
					} else
					{
						String tem = Add_pandy(
								data1.substring(0, data1.length() / 2), "1");
						char tem1[] = tem.toCharArray();
						for (int i = 0; i < tem.length(); i++)
						{
							data[i] = tem1[i];
							data[data.length - 1 - i] = data[i];
						}
						data[data.length / 2] = '0';
					}
				}
				else
				{
					
				}

				String ans = new String(data);
				
				if (ans.charAt(0) != '0')
					System.out.println(ans);
				else
					System.out.println(ans.substring(1, ans.length() - 1));
			}
			else
			{
				
				

				int che = 0;
				for (int i = 0; i <data.length / 2; i++)
				{
					if (data[(data.length / 2) - i-1] > data[(data.length / 2)
							+i])
					{
						data[(data.length / 2) + i] = data[(data.length / 2)
								- i-1];
						che = 1;
					}
					if (data[(data.length / 2) - i-1] < data[(data.length / 2)
							+ i])
					{
						data[(data.length / 2) + i] = data[(data.length / 2)
						   								- i-1];
					}
				}
				if (che == 0) /// data[(data.length/2)]
				{
					if (data[(data.length / 2)] != '9')
					{
						int now = Integer.parseInt(
								String.valueOf(data[(data.length / 2)]));
						now++;
						data[(data.length / 2)] = (char) (now + 48);
						data[(data.length / 2)-1] = (char) (now + 48);
					} else
					{
						String tem = Add_pandy(
								data1.substring(0, data1.length() / 2), "1");
						char tem1[] = tem.toCharArray();
						for (int i = 0; i < tem.length(); i++)
						{
							data[i] = tem1[i];
							data[data.length - 1 - i] = data[i];
						}
						data[data.length / 2] = '0';
					}
				}
				

				String ans = new String(data);
				
				if (ans.charAt(0) != '0')
					System.out.println(ans);
				else
					System.out.println(ans.substring(1, ans.length() - 1));
			
				
				
				
				
				
				
				
			}

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
