package hack;

import java.util.Scanner;

public class Larry_s_Array
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
//		int[] a ={30,20,10};
//		disp(order(30,20,10));
		for(int ii =0;ii<t;ii++)
		{
			int n = s.nextInt();
			int data [] = new int [n];
			for(int i =0;i<data.length;i++)
			{
				data[i]=s.nextInt();
			}
			int che = 0;
			for(int i =0;i<data.length-2;i++)
			{
//				System.out.println(i);
				if(check(data[i],data[i+1],data[i+2]))
				{
					int tem [] = order(data[i],data[i+1],data[i+2]);
					data[i]=tem[0];
					data[i+1]=tem[1];
					data[i+2]=tem[2];
					disp(data);
				}
				else
				{
					System.out.println(data[i]+" "+data[i+1]+" "+data[i+2]);
					che =1;
					break;
				}
			}
			
			if(che ==1)
				System.out.println("NO");
			else
				System.out.println("YES");
			
			
		}
		
		
	}
	
	public static boolean check (int a,int b,int c)
	{
		if(a<b && b<c)
			return true;
		else if(a<b)
		{
			int tem = b-a;
			if(b-tem>c)
				return true;
		}
		else if(a>b)
		{
			int tem = a-b;
			if(b+tem >c)
				return true;
		}
			
		return false;
	}
	
	public static int [] order(int a,int b,int c)
	{
		int ans [] = new int [3];
		if(a>b)
		{
			a = a+b;
			b= a-b;
			a= a-b;
		}
		if(b>c)
		{
			b = b+c;
			c= b-c;
			b= b-c;
		}
		if(a>b)
		{
			a = a+b;
			b= a-b;
			a= a-b;
		}
		ans[0]=a;
		ans[1]=b;
		ans[2]=c;
	return ans;	
	}
	
	public static void disp(int [] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("");
	}

}
