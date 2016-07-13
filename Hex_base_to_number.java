package Hackerrank;

import java.util.Scanner;

public class Hex_base_to_number
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		String data = s.nextLine();
		System.out.println(hxe_to_num(data,16));
		
	}
	
	public static int hxe_to_num(String data,int base)
	{
		int ans =0;
		int pow =0;
		for(int i =data.length()-1;i>=0;i--)
		{
			if(data.charAt(i)=='A')
			{
				ans = (int) (ans + Math.pow(16, pow)*10);
				pow++;
			}
			else if(data.charAt(i)=='B')
			{
				ans = (int) (ans + Math.pow(16, pow)*11);
				pow++;
			}
			else if(data.charAt(i)=='C')
			{
				ans = (int) (ans + Math.pow(16, pow)*12);
				pow++;
			}
			else if(data.charAt(i)=='D')
			{
				ans = (int) (ans + Math.pow(16, pow)*13);
				pow++;
			}
			else if(data.charAt(i)=='E')
			{
				ans = (int) (ans + Math.pow(16, pow)*14);
				pow++;
			}
			else if(data.charAt(i)=='F')
			{
				ans = (int) (ans + Math.pow(16, pow)*15);
				pow++;
			}
			else
			{
				ans = (int) (ans + Math.pow(16, pow)*Integer.parseInt(String.valueOf(data.charAt(i))));
				pow++;
			}
		}
		
		
		
		
		return ans;
		
	}

}
