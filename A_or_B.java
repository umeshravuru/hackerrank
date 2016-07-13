package Hackerrank;

import java.util.Scanner;

public class A_or_B
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < t; ii++)
		{
			int  k = Integer.parseInt(s.nextLine());
			String data1 = s.nextLine();
			String data2 = s.nextLine();
			String data3 = s.nextLine();
			
			long hex_data1 = hxe_to_num(data1,16);
			long hex_data2 = hxe_to_num(data2,16);
			long hex_data3 = hxe_to_num(data3,16);
			
			String binary_data1 = conv_to_base_2(hex_data1, 2);
			String binary_data2 = conv_to_base_2(hex_data2, 2);
			String binary_data3 = conv_to_base_2(hex_data3, 2);
			int max_len = Math.max(binary_data1.length(), Math.max(binary_data2.length(), binary_data3.length()));
			
			for(int i =0;i<max_len-binary_data1.length();i++)
			{
				binary_data1= "0"+binary_data1;
			}
			for(int i =0;i<max_len-binary_data2.length();i++)
			{
				binary_data2= "0"+binary_data2;
			}
			for(int i =0;i<max_len-binary_data3.length();i++)
			{
				binary_data3= "0"+binary_data3;
			}
			
			System.out.println(binary_data1 +" "+binary_data2+" "+binary_data3 );
			int ans =0;
			for(int i =0;i<data3.length();i++)
			{
				if(data3.charAt(i)=='0')
				{
					
				}
			}
			
			
			
			
		}

	}

	public static String conv_to_base_2(long data, int base)
	{

		String ans = "";
		int pow = 0;
		for (int i = 0; i < 1000; i++)
		{
			if (data >= Math.pow(base, i) && data < Math.pow(base, i + 1))
			{
				pow = i;
				break;
			}
		}
		while (pow >= 0)
		{
			if (data >= Math.pow(base, pow))

			{
				ans = ans + String.valueOf((int) (data / Math.pow(base, pow)));;

				data = (long) (data - (int) (data / Math.pow(base, pow))
						* Math.pow(base, pow));
			} else
				ans = ans + "0";

			pow--;

		}
		return ans;
	}

	public static int hxe_to_num(String data, int base)
	{
		int ans = 0;
		int pow = 0;
		for (int i = data.length() - 1; i >= 0; i--)
		{
			if (data.charAt(i) == 'A')
			{
				ans = (int) (ans + Math.pow(16, pow) * 10);
				pow++;
			} else if (data.charAt(i) == 'B')
			{
				ans = (int) (ans + Math.pow(16, pow) * 11);
				pow++;
			} else if (data.charAt(i) == 'C')
			{
				ans = (int) (ans + Math.pow(16, pow) * 12);
				pow++;
			} else if (data.charAt(i) == 'D')
			{
				ans = (int) (ans + Math.pow(16, pow) * 13);
				pow++;
			} else if (data.charAt(i) == 'E')
			{
				ans = (int) (ans + Math.pow(16, pow) * 14);
				pow++;
			} else if (data.charAt(i) == 'F')
			{
				ans = (int) (ans + Math.pow(16, pow) * 15);
				pow++;
			} else
			{
				ans = (int) (ans + Math.pow(16, pow)
						* Integer.parseInt(String.valueOf(data.charAt(i))));
				pow++;
			}
		}
		return ans;
	}

}
