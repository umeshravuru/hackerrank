package hack;

import java.util.Scanner;

public class Project_Euler_9_Special_Pythagorean_triplet
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		for(int i =0;i<t;i++)
		{
			int N = s.nextInt();
			if(N%2==0)
			{
				N=N/2;
				int che=0;
				int max=-1;
			for(int j =(int) (Math.sqrt(N)+1);j>=1;j--)
			{
				for(int k =(int) Math.sqrt(N);k>=j+1;k--)
				{
					if(k*(j+k)==N)
					{
//						System.out.println(j+" "+k);
						if(2*(j*k)*(-j*j*j*j+k*k*k*k)>max)
							max=2*(j*k)*(-j*j*j*j+k*k*k*k);
					}
				}
				
				
			}
			
System.out.println(max);				
			}
			else
				System.out.println("-1");
			
		}
		
		
	}

}
