package hack;

import java.util.Scanner;

public class Two_Robots
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t  =s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int ans=0;
			int m =s.nextInt();int n=s.nextInt();
			int pos1=0;
			int pos2=0;
			int chec1=0;
			int chec2=0;
			for(int i=0;i<n;i++)
			{
				int x=s.nextInt();
				int y=s.nextInt();
				if(i==0)
					pos1=x;
				if(i==1)
					pos2=x;
				if(Math.abs(x-pos1)<=Math.abs(x-pos2))
				{
					ans=ans+Math.abs(y-x)+Math.abs(pos1-x);
					pos1=y;
					
				}
				else
				{
					ans=ans+Math.abs(y-x)+Math.abs(pos2-x);
					pos2=y;
				}
				
				System.out.print(ans +" : "+pos1+" "+pos2+"--");
				
			}
			
			
			System.out.println(ans);
		}
		
	}

}
