package hack;

import java.util.Scanner;

public class Alien_Numbers
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for(int ii =0;ii<n;ii++)
		{
			String data = s.nextLine();
			String a = data.split(" ")[0];
			String b = data.split(" ")[1];
			String c = data.split(" ")[2];
			long conv_num=0;
			for(int i=a.length()-1;i>=0;i--)
			{
				conv_num=(long) (conv_num+pos(b,a.charAt(i))*Math.pow(b.length(), a.length()-1-i));
				
			}
			
			String ans_before = conv(conv_num,c.length());
			String final_ans = "";
//			System.out.println(ans_before);
			for(int i =0;i<ans_before.length();i++)
			{
				final_ans=final_ans+c.charAt(Integer.parseInt(String.valueOf(ans_before.charAt(i))));
				
			}
			
			System.out.println("Case #"+(ii+1)+": "+final_ans);
//			System.out.println("Case #"+(ii+1)+": "+final_ans);
			
		}
		
		
	}
	
	public static int pos(String data, Character a)
	{
		for(int i =0;i<data.length();i++)
		{
			if(data.charAt(i)==a)
				return i;
			
		}
		
		return 0;
		
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

}
