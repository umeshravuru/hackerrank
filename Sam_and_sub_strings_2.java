package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Sam_and_sub_strings_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String ss =s.nextLine();
		long [][] data = new long [2][ss.length()];
		
		long present_sum =0;
		
		for(int i =0;i<ss.length();i++)
		{
			data[0][i]=Integer.parseInt(String.valueOf(ss.charAt(i)));
			present_sum = present_sum+(i+1)*data[0][i];
		}
		
		present_sum=mod(present_sum);
		long final_ans=0;
//		System.out.println(present_sum);
		final_ans=present_sum;
		ArrayList<Long> power_mod = new ArrayList<Long>(); 
		for(int i =ss.length();i>1;i--)
		{
			present_sum=mod(present_sum-i*Integer.parseInt(String.valueOf(ss.charAt(i-1))));
			final_ans=mod(final_ans+mod(mod_10(power_mod,ss.length()-i+1)*present_sum));
//			System.out.println(final_ans);
		}
		
		
		System.out.println(final_ans);
		System.out.println(mod_10(power_mod,30));
		
		
	}
	
	
	public static long mod(long a){
		return (long) (a%(Math.pow(10, 9)+7));
	}
	public static long mod_10(ArrayList<Long>power_mod, long a)
	{
		if(a<=9)
			return (long) Math.pow(10, a);
			else
			{
				ArrayList<Long> data  = new ArrayList<Long> ();
				for(int i =0;i<a/10;i++)
				{
					data.add((long) 999999937);
				}
				data.add((long) Math.pow(10, a%10));
				
//				System.out.println(data);
				while(data.size()>1)
				{
					data.set(0, mod(data.get(0)*data.get(1)));
					data.remove(1);
//					System.out.println(data);
				}
				
				return data.get(0);
				
				
			}
	}

}
