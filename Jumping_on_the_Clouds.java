package beer_night;

import java.util.Scanner;

public class Jumping_on_the_Clouds
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data [] = new int [n];
		for(int i =0;i<n;i++)
		{
			data[i]=s.nextInt();
		}
		int ans =0;
		for(int i =0;i<n;i++)
		{
			if(i+2<n)
			{
			if(data[i+2]!=1)
			{
				ans++;
				i++;
			}
			else
			{
				ans++;
			}
			}
			if(i==n)
				break;
		}
		
		System.out.println(ans);
		
	}

}
