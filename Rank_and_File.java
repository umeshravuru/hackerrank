package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rank_and_File
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n =s.nextInt();
			int freq [] = new int [2501];
			for(int i=0;i<2*n-1;i++)
			{
				for(int j=0;j<n;j++)
				{
					freq[s.nextInt()]++;
				}
			}
			ArrayList<Integer> missing = new ArrayList<Integer>();
			for(int i=0;i<freq.length;i++)
			{
				if(freq[i]%2!=0)
					missing.add(i);
			}
			int ans []= new int [missing.size()];
			for(int i =0;i<ans.length;i++)
			{
				ans[i]=missing.get(i);
			}
			Arrays.sort(ans);
			System.out.print("Case #"+(ii+1)+": ");
			for(int i =0;i<ans.length;i++)
			{
				System.out.print(ans[i]+" ");
			}
			System.out.println("");
		}
		
		
	}

}
