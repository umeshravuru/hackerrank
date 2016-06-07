package hack;

import java.util.Scanner;

public class Flatland_Space_Stations
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int [] data = new int [m];
		for(int i =0;i<m;i++)
		{
			data[i]=s.nextInt();
		}
		int ans=0;
		for(int i=0;i<n;i++)
		{
			int temp=1000000;
			for(int j=0;j<m;j++)
			{
				temp= Math.min(temp, Math.abs(i-data[j]));
			}
			
			ans=Math.max(temp, ans);
		}
		
		System.out.println(ans);

	}

}
