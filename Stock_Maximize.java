package hack;

import java.util.Scanner;

public class Stock_Maximize
{

	public static void main(String[] args)
	{
	
		Scanner s  = new Scanner(System.in);
		int t =s.nextInt();
		for(int i =0;i<t;i++)
		{
			int m = s.nextInt();
			int [] data = new int [m];
			for(int j =0;j<m;j++)
			{
				data[j]=s.nextInt();
			}
			int a=0;
			int z =m-1;
			for(int j =m-1;j>0;j-- )
			{
				if(data[j]<data[j-1])
					z--;
				else
					break;
			}
			long final_Ans=0;
			while(a<z)
			{
				int max = 0;
				int tem =0;
				for(int j =a;j<=z;j++)
				{
					if(max<data[j])
					{
						max = data[j];
						tem= j+1;
								
					}
				}

				for(int j =a;j<tem;j++)
				{
					final_Ans=final_Ans-data[j];
				}
				final_Ans=final_Ans+(data[tem-1])*(tem-a);
				a=tem;
				
			}
			
			System.out.println(final_Ans);
		}
				
		
		
	}

}
