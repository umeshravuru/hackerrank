package hack;

import java.util.Scanner;

public class Standing_Ovation
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for(int i =0;i<t;i++)
		{
			String data1 = s.nextLine();
			String[] data2 = data1.split(" ");
			int n = Integer.parseInt(data2[0]);
			String data = data2[1];
			int ans = 0;
			for(int j =0;j<data.length();j++)
			{
				if(data.charAt(j)=='0')
					ans++;
			}
			System.out.println("Case #"+(i+1)+": "+ans);
			
			
			
			
		}
	
	}

}
