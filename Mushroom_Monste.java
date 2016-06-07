package hack;

import java.util.Scanner;

public class Mushroom_Monste
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		for(int ii =0;ii<t;ii++)
		{
			int n = s.nextInt();
			int [] data = new int[n];
			for(int i =0;i<n;i++)
			{
				data[i]=s.nextInt();
			}
			int ans1 =0;
			for(int i =1;i<n;i++)
			{
				if(data[i]<data[i-1])
					ans1 = ans1+(data[i-1]-data[i]);
			}
			int tem = 0;
			int tem_index =0;
			for(int i =n-1;i>0;i--)
			{
				if(data[i]<data[i-1])
				{
					if(tem<data[i-1]-data[i])
					{
						tem = data[i-1]-data[i];
						tem_index= i;
					}
				}
			}
			
			int ans2 =0;
			for(int i =0;i<n;i++)
			{
				if(tem_index!=i)
				ans2 = ans2+Math.min(data[i], tem);
			}
			System.out.println("Case #"+(ii+1)+": "+ans1+" "+ans2);
			
		}
	}

}
