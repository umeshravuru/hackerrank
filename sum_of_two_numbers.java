package beer_night;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sum_of_two_numbers
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		
		Map<Integer, Integer> data = new HashMap<Integer,Integer>();
		
		int n =s.nextInt();
		int[] data1 = new int [n];
		for(int i =0;i<n;i++)
		{
			int tem =s.nextInt();
			data1[i]=tem;
			data.put(tem, 1);
			
		}
		int total= s.nextInt();
		for(int i =0;i<n;i++)
		{
			if(data.get(total-data1[i]) !=null)
			{
				System.out.println(data1[i]+" "+data.get(data1[i]));
			}
		}
		
	}

}
