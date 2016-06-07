package hack;

import java.util.Scanner;

public class zigzag_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int length = (n / 25) + 2;
		if(n%25==0)
			length=length-1;
		char[] ans = new char[length];
		// System.out.println(ans.length);
		int excess = n % 25;
		if(excess==0)
			excess=25;
		ans[0] = 'a';
		for (int i = 1; i < length - 1; i++)
		{
			if (ans[i - 1] == 'a')
				ans[i] = 'z';
			else
				ans[i] = 'a';
		}

		if (ans[length - 2] == 'a')
		{
			ans[length - 1] = (char) (excess + 97);
		} else
		{
			ans[length - 1] = (char) (25 - excess + 97);
		}
		
//		prin(ans);
//		System.out.println();
		
		if(length>2 && length!=3 )
		{
		ans[1]='a';
		while(true)
		{
			int tem = chek(ans, n);
			if(tem<26)
			{
//				System.out.println(tem);
				if(ans[length-2]=='z')
					ans[length-1]=(char)(96+26-tem);
					else if(ans[length-2]=='a')
					{
						ans[length-1]=(char)(96+tem+1);
					}
				break;
			}
			else
			{
				ans[1]=(char)((int)ans[1]+1);
			}
				
		}
		}
		else if(length==3)
		{
			ans[1]='a';
			while(true)
			{
				int tem = chek(ans,n);
//				prin(ans);
//				System.out.println(tem-(int)ans[1]+96);
				if(tem<((int)ans[1]-96))
				{
					ans[2]=(char)((int)ans[1]-tem);
					break;
				}
				else
				{
					ans[1]=(char)((int)ans[1]+1);
				}
				
				
			}
			
			
			
		}
		
		prin(ans);
	}
	
	public static void prin(char[] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + "");
		}
	}
	
	public static int chek(char[]data,int tot)
	{
//		prin(data);
//		System.out.println();
		int ans =0;
		for(int i =0;i<data.length-2;i++)
		{
			ans = ans+Math.abs(data[i]-data[i+1]);
		}
		
		
		return tot-ans;
		
	}
	
	

}
