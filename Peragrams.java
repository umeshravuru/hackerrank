package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Peragrams
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data =s.nextLine();
		int [] ans = new int [26];
		for(int i =0;i<data.length();i++)
		{
			ans[(int)data.charAt(i)-97]++;
		}
		
		
		int che1=0;
		int che2=0;
		for(int i =0;i<26;i++)
		{
			if(che1!=1)
			{
			if(ans[i]%2!=0)
				che1++;
			}
			else
			{
				if(ans[i]%2!=0)
				che2++;
			}
//			System.out.println(ans[i]+" ");
		}
		
		System.out.println(che2);
		
	}

}
