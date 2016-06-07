package hack;

import java.util.Scanner;

public class Chef_And_Binary_Operation
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n  = Integer.parseInt(s.nextLine());
		for(int ii =0;ii<n;ii++)
		{
			String data1 = s.nextLine();
			String data2 = s.nextLine();
			int sum =0;
			int zero_to_one =0;
			int one_to_zero = 0;
			for(int i =0;i<data1.length();i++)
			{
				if(data1.charAt(i)=='1')
					sum++;
				if(data1.charAt(i)!=data2.charAt(i))
				{
					if(data1.charAt(i)=='1')
						one_to_zero++;
					else
						zero_to_one++;
				}
			}
			
			if(sum ==0 || sum == data1.length())
				System.out.println("Unlucky Chef");
			else
			{
				System.out.println("Lucky Chef");
				int tem = Math.min(one_to_zero, zero_to_one);
				one_to_zero = one_to_zero-tem;
				zero_to_one= zero_to_one-tem;
				System.out.println(one_to_zero+zero_to_one+tem);
			}
			
		}
		
		
	}

}
