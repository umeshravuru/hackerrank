package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Perfect_Separating
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		String data1 = s.nextLine();
//		String data1 = "abbb";
		if (data1.length() % 2 == 1)
			System.out.println("0");
		else
		{
			char data[] = data1.toCharArray();
			int total_number = (int) (Math.pow(2, data.length - 1));
			long final_ans =0;
//			System.out.println(total_number);
			for (int i = 1; i < total_number; i++)
			{
				String binary_string = Integer.toBinaryString(i);
				int tem_ones = 0;
				for (int j = 0; j < binary_string.length(); j++)
				{
					if (binary_string.charAt(j) == '1')
						tem_ones++;
				}
				if (tem_ones == (data1.length() / 2) - 1)
				{
//					System.out.println(binary_string);
					binary_string= equal_length(binary_string, data.length-1);
//					System.out.println(binary_string);
					String a =String.valueOf(data[0]);
					String b ="";
//					System.out.println(a+" "+b);
					
					
					for (int j  =0;j< binary_string.length() ; j++)
					{
						if (binary_string.charAt(j) == '1')
							a =a +data[j+1];
						else
							b= b+data[j+1];
					}
//					System.out.println(a+" "+b);
					if(a.equals(b))
						final_ans++;
				}
			}
			
			
			System.out.println(2*final_ans);

		}

	}
	
	public static String equal_length(String data,int n)
	{
		int len = data.length();
		for(int i =0;i<n-len;i++)
		{
			data = "0"+data;
		}
		
		
		return data;
	}

}
