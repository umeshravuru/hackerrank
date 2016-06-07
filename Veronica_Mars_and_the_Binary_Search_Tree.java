package beer_night;

import java.util.Scanner;

public class Veronica_Mars_and_the_Binary_Search_Tree
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();
		long [] data = new long [(int) t];
		for(int i=0;i<t;i++)
		{
			data[i]= s.nextLong();
		}
		long now =data[0];
		int check =0;
		int index = 0;
		long [] ans = new long[(int)t];
		ans[0]=1;
		for(int i =1;i<t;i++)
		{
			if(data[i]>data[i-1])
			ans[i]=2*ans[index]+1;
			else
				ans[i]=2*ans[index];
			
			if(check==1)
			{
				check=0;
				index ++;
			}
			else
				check++;
		}
		for(int i =0;i<t;i++)
		{
			System.out.print(ans[i]+" ");
		}
		
		
		
	}

}
