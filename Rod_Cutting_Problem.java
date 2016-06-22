package hack;

import java.util.Scanner;

public class Rod_Cutting_Problem
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i =0;i<t;i++)
		{
			int data = s.nextInt();
			int ans =0;
			int now =3;
			while(now<=data)
			{
				now = now*2+1;
				ans++;
			}
			
			System.out.println(ans);
			
		}
		
		
	}

}
