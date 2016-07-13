package Hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Anagrams
{
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		
		String data1 = s.nextLine();
		String data2 = s.nextLine();
		
		Map<Character, Integer> freq1 = new HashMap<>();
		Map<Character, Integer> freq2 = new HashMap<>();
		
		
		data1= data1.toLowerCase();
		data2= data2.toLowerCase();
		if(data1.length()!= data2.length())
		{
			System.out.println("Not Anagrams");
		}
		else
		{
			for(int i =0;i<data1.length();i++)
			{
				if(freq1.get(data1.charAt(i))==null)
					freq1.put(data1.charAt(i), 1);
				else
					freq1.put(data1.charAt(i), freq1.get(data1.charAt(i))+1);
				
				
				if(freq2.get(data2.charAt(i))==null)
					freq2.put(data2.charAt(i), 1);
				else
					freq2.put(data2.charAt(i), freq2.get(data2.charAt(i))+1);
			}
			int che=0;
			for(char key : freq1.keySet())
			{
				if(freq1.get(key)!=freq2.get(key))
				{
					che=1;
					break;
				}
			}
			if(che==0)
				System.out.println("Anagrams");
			else
				System.out.println("Not Anagrams");
			
		}
		
		
		
	}
}
