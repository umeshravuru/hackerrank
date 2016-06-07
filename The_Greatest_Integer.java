package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class The_Greatest_Integer
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		ArrayList<Integer> data= new ArrayList<Integer> ();
		int maxx=0;
		for(int i =0;i<n;i++)
		{
			data.add(s.nextInt());
			if(maxx<data.get(i))
				maxx= data.get(i);
		}
		int m =s.nextInt();
		int ans =gcd(data.get(0),data.get(1));
		for(int i =0;i<n-1;i++)
		{
//			System.out.print(ans+"-");
			ans = gcd(ans,data.get(i+1));
//			System.out.println(data.get(i+1)+" : "+ans);
		}
		
		int[] final_ans = new int [maxx/ans];
		for(int i =0;i<final_ans.length;i++)
		{
			final_ans[i]=(i+1)*ans;
//			System.out.print(final_ans[i]+" ");
		}
		
//		System.out.println();
		System.out.println(final_ans[maxx/ans-m]);
		
		
	}
	
	
	
	public static  int gcd(int a, int b) {
		   if (b==0) return a;
		   return gcd(b,a%b);
		}

}
