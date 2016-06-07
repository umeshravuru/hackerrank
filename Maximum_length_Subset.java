package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Maximum_length_Subset
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] data = new int[t];

		for (int i = 0; i < t; i++)
		{
			data[i] = s.nextInt();
		}

		int total = s.nextInt();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int present = 0;
		int a=0;
		int z =0;
		for (int i = 0; i < t; i++)
		{
			z=i;
			present = present + data[i];
			if(present==total)
			{
				if(ans.size()<z-a+1)
				{
					ans.clear();
				for(int j=a;j<=z;j++)
				{
					ans.add(data[j]);
				}
				}
			}
			else if(present>total)
			{
				while(present>total)
				{
					present=present-data[a];
					a++;
				}
				if(present==total)
				{
					if(ans.size()<z-a+1)
					{
						ans.clear();
					for(int j=a;j<=z;j++)
					{
						ans.add(data[j]);
					}
					}
				}
				
			}
			System.out.println(present+" "+ans);
		}

	}

}
