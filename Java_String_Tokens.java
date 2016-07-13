package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_String_Tokens
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		String delims = "[ .,?!]+";

		ArrayList<String> ans = new ArrayList<>();
		int ans_final = 0;
		String add ="";
		for (int i = 0; i < data.length(); i++)
		{
			if (data.charAt(i) != ' ' && data.charAt(i) != '!'
					&& data.charAt(i) != ',' && data.charAt(i) != '_'
					&& data.charAt(i) != '?' && data.charAt(i) != '\''
					&& data.charAt(i) != '.' && data.charAt(i) != '@')
			{
				add = add + data.charAt(i);
			}
			else
			{
				if(add.equals(""))
				{
					
				}
				else
				ans.add(add);
				add ="";
			}
		}
		if(add.equals(""))
		{
			
		}
		else
		ans.add(add);
		System.out.println(ans.size());
		for(int i =0;i<ans.size();i++)
		{
			System.out.println(ans.get(i));
		}

	}

}
