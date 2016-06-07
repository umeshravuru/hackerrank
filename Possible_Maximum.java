package beer_night;

import java.util.Scanner;

public class Possible_Maximum
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n =s.nextInt();
			int m =s.nextInt()-1;
			int min =0;
			for(int i =1;i<=n-1;i++)
			{
				for(int j =i+1;j<=n;j++)
				{
//					System.out.println(i+" "+j);
					if((i&j)>min)
						min = i&j;
					
					if(min == m )
						break;
				}
				if(min ==m)
					break;
			}
			
			System.out.println(min);
			
		}
		
		
	}

}
