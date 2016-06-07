package hack;

import java.util.Scanner;

public class Day_10_Binary_Numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		for(int i=0;i<t;i++){
			long n = s.nextLong();
			String ans="";
//			while(n>0)
//			{
				int temp=power(n);
				//if()
				ans=ans+"1";
				n=(long) (n-Math.pow(2, temp));
				temp--;
				while(temp>=0)
				{
					if(n>=Math.pow(2, temp))
						
						{
						ans=ans+"1";
						
						n=(long) (n-Math.pow(2, temp));
						}
					else
						ans=ans+"0";
					temp--;
				}
				
//			}
			
			
		System.out.println(ans);	
		}
		

	}
	
	public static int power(long n)
	{
		int ans=0;
		for(int i=0;i<50;i++)
		{
			if(Math.pow(2, i)<=n && Math.pow(2, i+1)>n)
			{
				ans=i;
				break;
			}
		}
		
		
		
		return ans;
	}

}
