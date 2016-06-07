package hack;

import java.util.Scanner;

public class Equal
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t= s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n =s.nextInt();
			int [] data = new int [n];
			int min=1000;
			for(int j=0;j<n;j++)
			{
				data[j]=s.nextInt();
				if(data[j]<min)
					min=data[j];
			}
//			System.out.println(min);
			int ans=1000000000;
			min++;
			for(int j=0;j<=5;j++)
			{
			int tem=0;
			min=min-1;
			for(int i=0;i<n;i++)
			{
				int xx=data[i]-min;
				tem =tem+(xx/5)+((xx%5)/2)+((xx%5)%2);
			}
			if(tem<ans)
				ans=tem;
			}
			
			System.out.println(ans);
			
			
		}
		
		
	}

}
