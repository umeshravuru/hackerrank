package beer_night;

import java.util.Arrays;
import java.util.Scanner;

public class plantingtrees
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int [] data = new int [n];
		for(int i =0;i<n;i++)
		{
			data[i]=s.nextInt();
		}
		Arrays.sort(data);
		int [] ans = new int [n];
		int max=0;
		for(int i =data.length-1;i>=0;i--)
		{
			ans [i]=data[i]+(n-i);
			if(max<ans[i])
				max = ans[i];
		}
		System.out.println(max+1);
		
	}

}
