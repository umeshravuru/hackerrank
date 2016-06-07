package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import beer_night.hashmap_iteration;

public class Roys_lucky_number
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in );
		int t  =s.nextInt();
		for(int ii =0;ii<t;ii++)
		{
			Map<Long, Integer> fin_map = new HashMap<Long,Integer>();
			
			int final_ans=0;
			long data = s.nextLong();
			fin_map.put(data, 1);
			long tem = 0;
			while(tem !=data )
			{
				tem = data;
				if(data%2==0)
				{
					data=data/2;
				}
				else
				{
					for(long i=3;i<Math.sqrt(data)+2;i=i+2)
					{
						if(data%i==0)
						{
							data=data/i;
							fin_map.put(i, 1);
							fin_map.put(data/i, 1);
//							if(lucky(i))
//								final_ans++;
						}
					}
				}
			}
			fin_map.put(data, 1);
			for(Long jj : fin_map.keySet())
			{
				if(lucky(jj))
					final_ans++;
			}
//			System.out.println(fin_map);
			System.out.println(final_ans);	
		}
		
		
		
		
		
		
	}
	
	public static Boolean lucky(long a){
		String tem = String.valueOf(a);
		for(int i =0;i<tem.length();i++)
		{
			if(tem.charAt(i)=='5' || tem.charAt(i)=='3')
				return true;
		}
		
		return false;
	}

}
