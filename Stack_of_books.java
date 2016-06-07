package beer_night;

import java.util.Arrays;
import java.util.Scanner;

public class Stack_of_books
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m =s.nextInt();
		int [] data = new int [n+1];
		for(int i=0;i<m;i++)
		{
			int a =s.nextInt();
			int b =s.nextInt();
			data[a-1]=data[a-1]+1;
			data[b]=data[b]-1;
		}
		for(int i =1;i<n;i++)
		{
			data[i]=data[i]+data[i-1];
		}
		int []ans = Arrays.copyOfRange(data, 0, n);
		Arrays.sort(ans);

		
		System.out.println(ans[n/2]);
		
	}

}
