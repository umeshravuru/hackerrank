package Code_chef;

import java.util.Scanner;

public class Uncle_Johny
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n = s.nextInt();
			int data [] = new int [n];
			for(int i =0;i<n;i++)
			{
				data[i]= s.nextInt();
			}
			int m = s.nextInt();
			int val = data[m-1];
			int ans =m;
			for(int i =0;i<n;i++)
			{
				for(int j =0;j<n-1;j++)
				{
					if(data[j]>data[j+1])
					{
						int tem = data[j];
						data[j]= data[j+1];
						data[j+1]= tem;
						
						if(data[j+1]==val)
							ans ++;
						if(data[j]==val)
							ans--;
					}
				}
				
			}
			
			
			System.out.println(ans);
			
			
		}
		
	}

}
