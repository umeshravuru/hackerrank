package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Counter_game
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int i = 0; i < t; i++)
		{
			long data1 = s.nextLong();
			String data2 = conv(data1, 2);
			System.out.println(data2);
			
			ArrayList<Integer> data = new ArrayList<>();
			for (int j = 0; j < data2.length(); j++)
			{
				if (data2.charAt(j) == '1')
					data.add(1);// = 1;
				else
					data.add(0);
			}
			int now = 0;
			int ones = count_ones(data);
			while (true)
			{
				if(ones>1)
				{
					data.remove(0);
					now++;
					data = remove_zeros(data);
					ones--;
				}
				else
				{
					data.remove(0);
					data.set(0, 1);
					now++;
				}
//				System.out.println(data);
				if(data.size()<=1)
					break;
				
			}
			
//			System.out.println(now);
			if(now%2==0)
				System.out.println("Richard");
			else
				System.out.println("Louise");
		}

	}

	public static String conv(long data, int base)
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

	public static int count_ones(ArrayList<Integer> data)
	{
		int ans = 0;
		for (int i = 0; i < data.size(); i++)
		{
			ans= ans+data.get(i);
		}
		return ans;
	}
	
	public static ArrayList<Integer> remove_zeros(ArrayList<Integer>data)
	{
		for(int i =0;i<data.size();i++)
		{
			if(data.get(i)==0)
			{
				data.remove(i);
				i--;
			}
			else
				return data;
		}
		
		
		return data;
	}

}
