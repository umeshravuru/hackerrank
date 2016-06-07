package hack;

import java.util.Map;
import java.util.Scanner;

public class Reverse_Shuffle_Merge_1
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner( System.in );
		String data  = s.nextLine();
		
		int [] ans = new int [26];
		for(int i=0;i<data.length();i++)
		{
			ans[(int)data.charAt(i)-97]++;
		}
		String final_ans="";
		
		for(int i =0;i<26;i++)
		{
			for(int j=0;j<ans[i]/2;j++)
			{
				final_ans=final_ans+(char)(i+97);
			}
		}
		
		System.out.println(final_ans);
		
		
	}

}
