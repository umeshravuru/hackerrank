package hack;

import java.util.Scanner;

public class ptice
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n =Integer.parseInt(s.nextLine());
		String data = s.nextLine();
		String dude1 = "ABC";
		String dude2 = "BABC";
		String dude3 = "CCAABB";
		
		int tem =0;
		int ans1 =0;
		for(int i =0;i<data.length();i++)
		{
			if(data.charAt(i)==dude1.charAt(tem))
				ans1++;
			tem++;
			if(tem==3)
				tem=0;
		}
		
		 tem =0;
		int ans2 =0;
		for(int i =0;i<data.length();i++)
		{
			if(data.charAt(i)==dude2.charAt(tem))
				ans2++;
			tem++;
			if(tem==4)
				tem=0;
		}
		
		tem =0;
		int ans3 =0;
		for(int i =0;i<data.length();i++)
		{
			if(data.charAt(i)==dude3.charAt(tem))
				ans3++;
			tem++;
			if(tem==6)
				tem=0;
		}
		int max = Math.max(ans1, Math.max(ans2, ans3));
		System.out.println(max);
		if(max==ans1)
			System.out.println("Adrian");
		if(max==ans2)
			System.out.println("Bruno");
		if(max==ans3)
			System.out.println("Goran");
		
	}

}
