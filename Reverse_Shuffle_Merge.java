package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_Shuffle_Merge
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		String a="";
		String b ="";
		ArrayList<Character> temp = new ArrayList<Character>();
		for(int i =0;i<data.length();i++)
		{
			int check=0;
			for(int j=0;j<temp.size();j++)
			{
				if(data.charAt(i)==temp.get(j))
				{
					check=1;
					b=b+String.valueOf(temp.get(j));
					temp.remove(j);
					break;
				}
			}
			if(check==0)
			{
				a=a+String.valueOf(data.charAt(i));
				temp.add(data.charAt(i));
			}
		
		}
		
		System.out.println(a);
		System.out.println(b);
//		System.out.println(temp);
		int [] frequeny = new int [26];
		for(int i =0;i<a.length();i++)
		{
			frequeny[(int)a.charAt(i)-97]++;
		}
		String ans="";
		for(int i=0;i<26;i++)
		{
			for(int j=0;j<frequeny[i];j++)
			{
				ans=ans+String.valueOf((char)(97+i));			}
		}
		
		System.out.println(ans);
		
		
		
		
		
	}

}
