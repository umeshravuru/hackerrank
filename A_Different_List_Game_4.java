package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_Different_List_Game_4
{

	public static void main(String[] args)
	{
		
		
		
		Scanner s = new Scanner(System.in);
		long data = s.nextLong();
		ArrayList<Long> fac = new ArrayList<Long> (); 
		long tem  = 0 ;
		fac.add((long)1);
		while (data > 1 && tem != data)
		{
			tem = data;
			int che1=0;
			for (long i = (fac.get(fac.size()-1))+1; i < Math.sqrt(data) + 5; i ++)
			{
					if(data%i==0)
					{
						data=data/i;
						fac.add(i);
						che1=1;
					}
				if(che1==1)
					break;
			}
			
		}
		int check2= 0;
		for(int i =0;i<fac.size();i++)
		{
			if(fac.get(i)==data)
			{
				check2=1;
				break;
			}
		}
		if(check2==0)
		{
			fac.add( data);
		}
		else
		{
			fac.set(fac.size()-1, fac.get(fac.size()-1)*data);
		}
		System.out.println(fac);
		System.out.println(fac.size()-1);
	}

}
