package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Java_String_Compare
{

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		String data = s.nextLine();
		int n = Integer.parseInt(s.nextLine());
		
		String data1[] = new String[data.length()-n+1];
		
		for(int i =0;i<data.length()-n+1;i++)
		{
			data1[i]= data.substring(i,i+n);
			System.out.println(data1[i]);
		}
		
		Arrays.sort(data1);
		
		System.out.println(data1[0]);
		System.out.println(data1[data1.length-1]);
		
		
	}
	
	
}
