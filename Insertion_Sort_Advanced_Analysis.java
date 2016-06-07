package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Insertion_Sort_Advanced_Analysis
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int ii=0;ii<t;ii++)
		{
			int n = s.nextInt();
			ArrayList<Integer> key = new ArrayList<>();
			ArrayList<Integer> value = new ArrayList<>();
			long final_ans =0;
			
			key.add(s.nextInt());
			value.add(1);
			for(int i =1;i<n;i++)
			{
				int now = s.nextInt();
				int che =0;
				
				for(int j=0;j<key.size();j++)
				{
					if(key.get(j)>now)
						final_ans=final_ans+ value.get(j);
					
					if(key.get(j)<now)
					{
						key.add(j,now);
						value.add(j,1);
						che=1;
						break;
					}
					else if(key.get(j)==now)
					{
						che=1;
						value.set(j, value.get(j)+1);						
						break;
					}
				}
				
				if(che==0)
				{
					key.add(now);
					value.add(1);
				}
				
//				System.out.println(key);
//				System.out.println(value);
//				System.out.println(final_ans);
			}
//			System.out.println(key);
//			System.out.println(value);
			System.out.println(final_ans);
			
			
			
			
		}
		
		
	}

}
