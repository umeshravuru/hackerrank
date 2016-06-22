package hack;

import java.util.*;

public class Mathe_Matica_Town_and_Primo
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		ArrayList<Integer> prime = new ArrayList<>();
		Map<Integer, Integer> prime_map = new HashMap<>();
		
		prime.add(2);
		prime.add(3);
		prime_map.put(2, 1);
		prime_map.put(3, 1);
		
		for(int i =5;i<=1000000;i=i+2)
		{
			int che =0;
			for(int j =0;j<prime.size();j++)
			{
				if(i%prime.get(j)==0)// || prime.get(j)*prime.get(j)>i) 
				{
					che=1;
					break;
				}
				if(prime.get(j)*prime.get(j)>i)
					break;
			}
			if(che==0)
			{
				prime.add(i);
				prime_map.put(i, 1);
			}
//			System.out.println(i);
		}
		
//		System.out.println(prime);
		
		for(int ii=0;ii<t;ii++)
		{	
			int data = s.nextInt();
			int che =0;
			int now = 0;
			if(data%2==0)
				now = (data/2)-1;
			else
				now = data/2;
			for(int i =now;i>=2;i--)
			{
				
				if(prime_map.get(i)!=null && prime_map.get(data-i)!=null)
				{
					che=1;
					System.out.println(i+" "+(data-i));
					break;
				}
			}
			if(che==0)
				System.out.println("-1 -1");
				
		}
		
	}

}
