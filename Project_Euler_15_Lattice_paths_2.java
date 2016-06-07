package hack;

import java.util.Scanner;

public class Project_Euler_15_Lattice_paths_2
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		for(int i =0;i<t;i++)
		{
			System.out.println(mod_fac(s.nextLong(), s.nextLong()));
		}
		
	}
	
	public static long mod_fac(long m,long n){
		
		long ans=1;
		
		for(long i=m+n;i>=m+1;i--)
		{
			ans=ans*i;
			ans=mod(ans);
		}
		System.out.println(ans);
		long ans1=1;
		for(long i=n;i>=2;i--)
		{
			ans1=ans1*i;
			ans1=mod(ans1);
		}
		System.out.println(ans1);
		
		
		return ans/ans1;
	}
	
	
	public static long mod(long data){
		return data%(1000000007);
	}

}
