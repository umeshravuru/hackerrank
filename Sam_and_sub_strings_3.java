package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Sam_and_sub_strings_3
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
			present_sum = mod(present_sum+(i+1)*data[0][i]);
		}
		
		present_sum=(present_sum);
		long final_ans=0;
//		System.out.println(present_sum);
		final_ans=present_sum;
		ArrayList<Long> power_mod = new ArrayList<Long>(); 
		power_mod.add((long) 1);
		for(int i =1;i<ss.length();i++)
		{
			if(i<=9)
				power_mod.add((long) Math.pow(10, i));
			else
			{
				power_mod.add(mod(power_mod.get(i-1)*10));
			}
		}
		
//		System.out.println(power_mod);
		
		for(int i =ss.length();i>1;i--)
		{
			present_sum=(present_sum-i*Integer.parseInt(String.valueOf(ss.charAt(i-1))));
			
			final_ans=mod((final_ans)+mod(power_mod.get(ss.length()-i+1)*present_sum));
//			System.out.println(present_sum);
		}
		
		
		System.out.println(final_ans);
//		System.out.println(mod_10(power_mod,30));
		
		
	}
	public static long mod(long a){
		return (long) (a%(Math.pow(10, 9)+7));
	}
	
	

}
