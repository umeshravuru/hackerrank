package Hackerrank;

import java.util.Scanner;

public class Accessory_Collection
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			
//			if((c-1)*b>=a)
//				System.out.println("SAD");
//			else
//			{
				long ans =0;
				long tem = a;
				long now = b;
				while(tem>0 )
				{
					ans = ans+ (c-d+1)*now;
					now--;
					tem = tem-c-1+d;
//					System.out.println(ans);
					if(now<=0)
						break;
					if(tem<c-d+1)
					{
						ans = (tem) * (now+1);
						break;
					}
				}
				if(now<=0)
					System.out.println("SAD");
				else
				System.out.println(ans);
				
				
				
			
//			}
			
			
			
			
		}
				
	}

}
