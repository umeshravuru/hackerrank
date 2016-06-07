package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_Different_List_Game_2
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		long data = s.nextLong();

		Map<Long, Long> fac = new HashMap<Long, Long>();
		long tem  = 0 ;
		while (data > 1 && tem != data)
		{
			tem = data;
//			System.out.println(data);
			int che = 0;
			if (data % 2 == 0)
			{
				che = 1;
				data = data / 2;
				if (fac.get((long)2) == null)
					fac.put((long) 2, (long) 1);
				else
					fac.put((long) 2, (long)(fac.get((long)2) + (long)1));
			}
			if (che == 0)
			{
				int che1=0;
				for (long i = 3; i < Math.sqrt(data) + 5; i = i + 2)
				{
					if(data%i==0)
					{
						data = data / i;
						if (fac.get(i) == null)
							fac.put( i, (long) 1);
						else
							fac.put( i, (long)(fac.get(i) +(long) 1));
						che1=1;
					}
					if(che1==1)
						break;
				}
				
			}
		}
//		System.out.println(data);
		if(data!=1)
		{
		if (fac.get(data) == null)
			fac.put( data, (long) 1);
		else
			fac.put( data, (long)(fac.get(data) +(long) 1));
		}
		System.out.println(fac);
		
//		for(long key : fac.keySet())
//		{
//			if(fac.get(key)>1)
//			{
//				if(fac.get(key)>3)
//				{
////					fac.
//				}
//			}
//		}

	}

}
