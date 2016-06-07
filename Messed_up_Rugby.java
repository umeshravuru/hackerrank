package hack;

import java.util.Scanner;

public class Messed_up_Rugby
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		for(int i1=0;i1<=t/7;i1++)
		{
			for(int i2=0;i2<=t/3;i2++)
			{
				for(int i3=0;i3<=t/2;i3++)
				{
					if(i1*7+i2*3+i3*2==t)
						System.out.println(i1+" "+i2+" "+i3);
				}
			}
		}
		
		
	}

}
