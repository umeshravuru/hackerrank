package hack;

import java.util.Scanner;

public class Leaf_and_Limelight_Attack
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
//		int len = 10000001;
		int len = 100;
		long ans[] = new long[len];

		ans[1] = 2;
		long num1 =0;
		long sum1 =1;
		long num2 =0;
		long sum2 =1;
		
		for (long ii = 2; ii < ans.length; ii++)
		{

			num1 = ii*ii - ii +1;
			sum1 = sum1 + num1;
			
			
			
			if (ii % 2 == 0)
			{
				num2 = (long) (2*ii + 4* Math.floor(((ii-1)*(ii-1))/4));
				num2++;
				
				
			} else
			{
				
				int now = (int) (ii-1);
				
				num2 = (long) ((3+ 4*now + 2* now*now - Math.pow(-1, now))/2);
				
			}
			
			sum2 = sum2 + num2;
			
			ans[(int) ii] = sum2+ sum1;
//			if(ans[(int) ii]<0)
//				System.out.println("o");
		System.out.println(ii +" "+ans[(int) ii] + " "+sum1 +" "+ sum2);	
		}
//		System.out.println(ans[10000000]%1000000009);
		
		

	}

}
