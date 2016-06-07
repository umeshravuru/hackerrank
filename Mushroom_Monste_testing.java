package hack;

import java.util.Scanner;

public class Mushroom_Monste_testing
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		for(int ii =0;ii<t;ii++)
		{
			int n = s.nextInt();
			int [] data = new int[n];
			for(int i =0;i<n;i++)
			{
				data[i]=s.nextInt();
			}
			int rate =0;
			int check =0;
			while(true)
			{
				int now =0;
				for(int i =0;i<n-1;i++)
				{
					now = data[i]-rate;
					if(data[i+1]<now)
					{
						break;
					}
					if(i==n-2)
					{
						check=1;
						break;
					}
				}
				if(check==1)
					break;
				
			
				rate++;
			}
			
			System.out.println("Case #"+(ii+1)+": "+rate);
			
			
		}
		
		
	}

}
