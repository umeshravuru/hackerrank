package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Day_20_Review_More_String_Methods {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		ArrayList<String> ans= new ArrayList<String>();
		int ans_num=0;
		String tem="";
		for(int i=0;i<data.length();i++)
		{
			if(((int)data.charAt(i)>=65 && (int)data.charAt(i)<=90) || ((int)data.charAt(i)>=97 && (int)data.charAt(i)<=122))
			{
				tem=tem+String.valueOf(data.charAt(i));
			}
			else
			{
				if(tem.equals(""))
				{
					
				}
				else
				{
				ans.add(tem);
				}
				tem="";
				
			}
		}
		if(tem.length()!=0)
			ans.add(tem);
		System.out.println(ans.size());
		for(int i=0;i<ans.size();i++)
		{
			System.out.println(ans.get(i));
		}
		 
		
		
	}

}
