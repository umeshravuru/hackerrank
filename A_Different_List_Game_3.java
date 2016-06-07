package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_Different_List_Game_3
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		long data = s.nextLong();

		Map<Long, Integer> fac = new HashMap<Long, Integer>();
		long tem  = 0 ;
		while (data > 1 && tem != data)
		{
			tem = data;
			int che1=0;
			for (long i = 2; i < Math.sqrt(data) + 5; i ++)
			{
				if(fac.get(i)==null)
				{
					if(data%i==0)
					{
						data=data/i;
						fac.put(i, 1);
						che1=1;
					}
				}
				if(che1==1)
					break;
			}
		}
		
		if(data!=1)
			fac.put( data,  1);
		System.out.println(fac);
		System.out.println(fac.size());
		
		
	}

}
