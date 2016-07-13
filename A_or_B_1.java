package Hackerrank;

import java.util.Scanner;

public class A_or_B_1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < t; ii++)
		{
			int k = Integer.parseInt(s.nextLine());
			String data1 = s.nextLine();
			String data2 = s.nextLine();
			String data3 = s.nextLine();

			int max_len = Math.max(data1.length(),
					Math.max(data2.length(), data3.length()));
			for (int i = 0; i < max_len - data1.length(); i++)
			{
				data1 = "0" + data1;
			}
			for (int i = 0; i < max_len - data2.length(); i++)
			{
				data2 = "0" + data2;
			}
			for (int i = 0; i < max_len - data3.length(); i++)
			{
				data3 = "0" + data3;
			}
//			System.out.println(data1 + " " + data2 + " " + data3);

			long changed = 0;
			String ans1 = "";
			String ans2 = "";
			String ans3 = "";
			int che = 0;
			for (int i = 0; i < data3.length(); i++)
			{
				String tem1 = hex_to_binary(data1.charAt(i));
				String tem2 = hex_to_binary(data2.charAt(i));
				String tem3 = hex_to_binary(data3.charAt(i));

				String tem_data1 = "";
				String tem_data2 = "";
				for (int j = 0; j < 4; j++)
				{
					if (tem3.charAt(j) == '0')
					{
						if (tem1.charAt(j) == '1')
						{
							changed++;
							tem_data1 = tem_data1 + "0";
						} else
						{
							tem_data1 = tem_data1 + "0";
						}
						if (tem2.charAt(j) == '1')
						{
							changed++;
							tem_data2 = tem_data2 + "0";
						} else
						{
							tem_data2 = tem_data2 + "0";
						}
					} else
					{
						if (tem1.charAt(j) == '0' && tem2.charAt(j) == '0')
						{
							changed++;
							tem_data1 = tem_data1 + "0";
							tem_data2 = tem_data2 + "1";
						} else 
						{
							tem_data1 = tem_data1
									+ String.valueOf(tem1.charAt(j));
							tem_data2 = tem_data2
									+ String.valueOf(tem2.charAt(j));
						}

					}
					if (changed > k)
					{
						che = 1;
						break;
					}
					
				}
//				System.out.println(tem_data1+" "+tem_data2);
				if (che == 1)
					break;
				ans1 = ans1 + String.valueOf(binary_to_hex(tem_data1));
				ans2 = ans2 + String.valueOf(binary_to_hex(tem_data2));

			}
			if (che == 1)
				System.out.println("-1");
			else
			{
				String ans1_main ="";
				for(int i =0;i<ans1.length();i++)
				{
					if(ans1.charAt(i)!='0')
					{
						ans1_main = ans1.substring(i,ans1.length());
						break;
					}
				}
				String ans2_main ="";
				for(int i =0;i<ans2.length();i++)
				{
					if(ans2.charAt(i)!='0')
					{
						ans2_main = ans2.substring(i,ans2.length());
						break;
					}
				}
				System.out.println(ans1_main);
				System.out.println(ans2_main);
			}

		}

	}

	public static String hex_to_binary(char a)
	{
		if (a == '0')
			return "0000";
		else if (a == '1')
			return "0001";
		else if (a == '2')
			return "0010";
		else if (a == '3')
			return "0011";
		else if (a == '4')
			return "0100";
		else if (a == '5')
			return "0101";
		else if (a == '6')
			return "0110";
		else if (a == '7')
			return "0111";
		else if (a == '8')
			return "1000";
		else if (a == '9')
			return "1001";
		else if (a == 'A')
			return "1010";
		else if (a == 'B')
			return "1011";
		else if (a == 'C')
			return "1100";
		else if (a == 'D')
			return "1101";
		else if (a == 'E')
			return "1110";
		else if (a == 'F')
			return "1111";
		return "0000";
	}

	public static char binary_to_hex(String data)
	{
		if (data.equals("0000"))
			return '0';
		else if (data.equals("0001"))
			return '1';
		else if (data.equals("0010"))
			return '2';
		else if (data.equals("0011"))
			return '3';
		else if (data.equals("0100"))
			return '4';
		else if (data.equals("0101"))
			return '5';
		else if (data.equals("0110"))
			return '6';
		else if (data.equals("0111"))
			return '7';
		else if (data.equals("1000"))
			return '8';
		else if (data.equals("1001"))
			return '9';
		else if (data.equals("1010"))
			return 'A';
		else if (data.equals("1011"))
			return 'B';
		else if (data.equals("1100"))
			return 'C';
		else if (data.equals("1101"))
			return 'D';
		else if (data.equals("1110"))
			return 'E';
		else if (data.equals("1111"))
			return 'F';

		return '0';
	}

}
