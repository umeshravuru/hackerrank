package hack;

import java.util.Scanner;

public class veci
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		
		long n =s.nextLong();
		int [] freq = new int [10];
		String n_str = String.valueOf(n);
		for(int i =0;i<n_str.length();i++)
		{
			freq[Integer.parseInt(String.valueOf(n_str.charAt(i)))]++;
			
		}
		
		for(int i =0;i<10;i++)
		{
			System.out.print(freq[i]+" ");
		}
		
		char [] now = new char[n_str.length()];
		int ind =0;
		for(int i =0;i<10;i++)
		{
			for(int j=0;j<freq[i];i++)
			{
				now[ind]=Character.valueOf((char) i);
				ind++;
			}
		}
		
		for(int i =0;i<now.length;i++)
		{
			System.out.print(now[i]+" ");
		}
		
		
		
		
	}

}
