package hack;

import java.util.Scanner;

public class Project_Euler_14_Longest_Collatz_sequence
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int i =0;i<t;i++)
		{
			int m =s.nextInt();
			long ans_final=0;
			int pri=0;
//			for(int j=m;j>1;j--)
//			{
				long ans =0;
				int jj=m;
				while(jj!=1)
				{
					if(jj%2==0)
						jj=jj/2;
					else
						jj=3*jj+1;
						
					ans++;
				}
				
				System.out.println(ans); 
			
//				System.out.println(j+" - "+ans);
//				break;
//				if(ans_final<ans)
//				{
//					ans_final=ans;
//					pri =j;
//				}
				
			
//			System.out.println(pri);
			
		}
				
		
	}

}
