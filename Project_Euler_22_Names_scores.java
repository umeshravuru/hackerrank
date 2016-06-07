package hack;

import java.util.Arrays;
import java.util.Scanner;

public class Project_Euler_22_Names_scores
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n =Integer.parseInt(s.nextLine());
		String [] data = new String[n];
		for(int i =0;i<n;i++)
		{
			data[i]=s.nextLine();
		}
		Arrays.sort(data);
		
		int [] ans = new int [n];
		for(int i =0;i<n;i++)
		{
			ans[i]=0;
			for(int j=0;j<data[i].length();j++)
			{
			ans[i]=ans[i]+(int)data[i].charAt(j)-64;
			}
//			System.out.println(ans[i]);
			ans[i]=ans[i]*(i+1);
		}
		
		
		int q = Integer.parseInt(s.nextLine());
		for(int i =0;i<q;i++)
		{
		
			String now  = s.nextLine();
			for(int j =0;j<n;j++)
			{
				if(now.equals(data[j]))
				{
					System.out.println(ans[j]);
					break;
				}
			}
		}
		
	}

}
