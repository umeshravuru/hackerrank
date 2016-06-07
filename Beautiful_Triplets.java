package beer_night;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Beautiful_Triplets
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d =s.nextInt();
		int data1[] = new int [n];
		Map<Integer, Integer> data = new HashMap<Integer,Integer>();
		for(int i =0;i<n;i++)
		{
			int tem = s.nextInt();
			data1[i]=tem;
			data.put(tem, 1);
		}
		long ans =0;
		for(int i =0;i<n-3;i++)
		{
			int a = data1[i];
			if(data.get(a+d)!=null)
			{
				if(data.get(a+d+d)!=null)
				{
					ans++;
				}
			}
		}
		
		
		System.out.println(ans);
		
		
	}

}
