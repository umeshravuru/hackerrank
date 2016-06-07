package beer_night;

import java.util.ArrayList;
import java.util.Scanner;

public class Smriti_and_the_Strings
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for (int ii = 0; ii < t; ii++)
		{
			String tem = s.nextLine();
			String temm[] = tem.split(" ");
			String data = temm[0];
			int n = Integer.parseInt(temm[1]);
			int [] freq= new int [26];
			ArrayList<Character> char_list  = new ArrayList<Character>(); 
			for(int i =0;i<data.length();i++)
			{
				freq[data.charAt(i)-97]++;
				char_list.add(data.charAt(i));
			}
			
			int index = -1;
			for(int i =0;i<26;i++)
			{
				if(freq[i]<=n)
				{
					n = n - freq[i];
					index++;
				}
				else
				{
					break;
				}
			}
			if(n==0)
				index++;
			for(int i =0;i<char_list.size();i++)
			{
				if(char_list.get(i)-97<index)
				{
					char_list.remove(i);
				}
			}
			
			
			System.out.println(index);
			
			
			
		}

	}

}
