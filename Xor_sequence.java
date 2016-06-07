package hack;

import java.util.Scanner;

public class Xor_sequence
{

	public static void main(String[] args)
	{
		
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		for(int i =0;i<n;i++)
		{
			long ans=0;
			long a = s.nextLong();
			long b =s.nextLong();
			long aa=a;
			if(a%4!=0)
				aa= a+(4-a%4);
			long bb=b;
			if(b%4!=0)
				bb= b-(b%4);
			if(((bb-aa)/4)%2!=0)
				ans=2;
//			
			System.out.println(ans);
			if(a%4!=0)
			{
			for(long j =a;j<aa;j++)
			{
//				System.out.println(j+" top ");
//				if((j+1)%4!=0)
//				{
					ans=ans^arra((int) j);
//				}
//				else
//					break;
			}
			}
			System.out.println(""+ ans +"ans");
			if(true)//if(aa!=bb)
			{
			for(long j =bb;j<=b;j++)
			{
//				System.out.println(j+" lower ");
//				if((j)%4!=0)
//				{
					ans=ans^arra((int) (j));
//				}
//				else
//					break;
			}
			}
			
			System.out.println("a aa bb"+a+" "+b+" "+aa+" "+bb);
//			System.out.println("     --------      "+ans);
			System.out.println(ans);
		}
		
		

	}
	
	public static int arra(int n){
		if(n%4==0)
			return n;
		if(n%4==1)
			return 1;
		if(n%4==2)
			return n+1;
		if(n%4==3)
			return 0;
			
		
		return 0;
	}

}
