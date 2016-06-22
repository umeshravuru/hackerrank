package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Prime_numer_list
{

	public static void main(String[] args)
	{
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
				if(i%prime.get(j)==0)
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
		}
		
	}

}
