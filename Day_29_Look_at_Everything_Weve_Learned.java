package hack;

import java.util.Scanner;

public class Day_29_Look_at_Everything_Weve_Learned
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		
		for(int ii=0;ii<t;ii++)
		{
			String ss= s.nextLine();
//			int [] data = new int[ss.length()];
			int chec=0;
			for(int i=0;i<ss.length()/2;i++)
			{
				if(Math.abs((int)(ss.charAt(i)-(int)(ss.charAt(i+1))))==Math.abs((int)(ss.charAt(ss.length()-1-i)-(int)(ss.charAt(ss.length()-i-2)))))
				{
					
				}
				else
				{
					chec=1;
					break;
				}
			}
			if(chec==0)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
			
		}
		

	}

}
