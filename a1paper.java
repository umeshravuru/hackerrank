package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class a1paper
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		ArrayList<Integer> data  = new ArrayList<Integer>();
		
//		data.add(0);
//		data.add(0);
		for(int i =2;i<=n;i++)
		{
			data.add(s.nextInt());
		}
//		ArrayList<Integer> data1  = data;
		while(data.get(0)!=2 && data.size()>1)
		{
			for(int i =data.size()-1;i>0;i--)
			{
				
					data.set(i-1, data.get(i-1)+data.get(i)/2);
					data.remove(i);
				
			}
		}
		if(data.get(0)>=2)
		{
			for(int i =0;i<n;i++)
			{
//				if(data)
			}
			
			
			
			
		}	
		else
			System.out.println("impossible");
		
		System.out.println(data);
		
	}

}
