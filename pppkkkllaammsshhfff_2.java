package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class pppkkkllaammsshhfff_2
{

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);

		int min = 100;
		int n = s.nextInt();
		int product_last = 1;
		int product_max = 1;
		int max1 = -1;
		int max2 = -1;
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
		{
			data.add(s.nextInt());
		}
		
		for (int i = 0; i < n; i++)
		{
			if(max1<data.get(i))
				max1=data.get(i);
		}
		for (int i = 0; i < n; i++)
		{
			if(data.get(i)==max1)
			{
				data.remove(i);
				break;
			}
		}
		for (int i = 0; i < data.size(); i++)
		{
			if(max2<data.get(i))
				max2=data.get(i);
		}
		
		product_last = product_last * data.get(data.size() - 1);
		product_last = product_last * data.get(data.size() - 2);
		
		product_max= max1*max2;
		System.out.println(max1+" "+max2);
		System.out.println (product_last+" "+product_max);
		
		
		
		
		
		
			
	}

}
