package hack;

import java.util.Scanner;

public class Maximum_difference_in_an_array_food_man
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int data[] = new int [n];
		
		for(int i =0;i<n;i++)
		{
			data[i]=s.nextInt();
		}
		
		
		System.out.println(answer_fun(data));
		
		
		
		
	}
	
	
	public static int answer_fun(int data[])
	{
		int max_diff = data[1]-data[0];
		int min_ele = data[0];
		for(int i =0;i<data.length;i++)
		{
			if(data[i]-min_ele >max_diff)
				max_diff = data[i]-min_ele;
			if(data[i]<min_ele)
				min_ele = data[i];
		}
		return max_diff;
	}

}
