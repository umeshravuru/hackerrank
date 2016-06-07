package hack;

import java.util.Scanner;

public class Factorial_Length_Sum {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		long [] data = new long [n];
		long [] power_data= new long[n];
		for(int i=0;i<n;i++)
		{
			data[i]=s.nextLong();
			power_data[i]=power_sum(data[i]);
			System.out.println(power_sum(data[i]));
		}
		
		s.close();
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(power_data[i]+" ");
//		}
//		
//		System.out.println("");
		long [] power_data_new = new long[n+1];
		power_data_new[0]=0;
		
		long final_ans=0;
		for(int i=1;i<=n;i++)
		{
			power_data_new[i]=power_data_new[i-1]+power_data[i-1];
		}
		
//		for(int i=0;i<=n;i++)
//		{
//			System.out.print(power_data_new[i]+" ");
//		}
//		
//		System.out.println("");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				if((power_data_new[j]-power_data_new[i])%2==0)
				{
					final_ans=final_ans+(power_data_new[j]-power_data_new[i]);
				}
			}
		}
//		System.out.println(final_ans);
		
		
		
		
	}
	
	
	public static long power_sum(long a){
		
		long ans=0;
		for(long i=2;i<=a;i++)
		{
			long tem=i;
			//System.out.println(i);
			while(tem>1)
			{
				
				for(long j=2;j<=i;j++)
				{
					if(tem%j==0)
					{
						ans++;
						tem=tem/j;
						break;
					}
				}
			}
			
			
		}
		
		
		
		
		return ans;
	}

}
