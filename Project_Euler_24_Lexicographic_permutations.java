package beer_night;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class Project_Euler_24_Lexicographic_permutations
{

	public static void main(String[] args)
	{

		String input = "abcdefghijklm";
		Scanner s = new Scanner(System.in);
		int  t =s.nextInt();
		for(int i =0;i<t;i++)
		{
			long n = s.nextLong();
			String ans = "";
			int tem =1;
			while(fac(tem)<n)
			{
				tem++;
			}
			System.out.println(tem);
			ans = input.substring(0,input.length()-tem);
			System.out.println(ans);
			String now = input.substring(input.length()-tem-1,input.length());
			while(n>0)
			{
				int temp = (int) (n/fac(tem-1));
				ans=ans+now.charAt(temp);
//				n=n
			}
			
		
		}
				
		
	}
	
	public static long fac(int i )
	{
		long ans =1;
		for(int ii =2;ii<=i;ii++)
		{
			ans=ans*ii;
		}
		return ans;
	}

}
