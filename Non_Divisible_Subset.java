package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Non_Divisible_Subset
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int data [] = new int [n];
		for(int i =0;i<n;i++)
		{
			data[i]=s.nextInt();
		}	
		
		ArrayList<Integer> divisible_not = new ArrayList<Integer>();
		
		
		for(int i =0;i<n;i++)
		{	
			if(divisible_not.size()==0)
			{
				if(data[i]%k!=0)
					divisible_not.add(data[i]);
			}
			else
			{
				if((divisible_not.get(0)+data[i])%k!=0)
					divisible_not.add(data[i]);
			}
		}
		
		System.out.println(divisible_not.size());
		
		
	}

}
