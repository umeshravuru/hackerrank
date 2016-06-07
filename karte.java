package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class karte
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		
		Map<Integer, Integer> P = new HashMap<>();
		Map<Integer, Integer> K = new HashMap<>();
		Map<Integer, Integer> H = new HashMap<>();
		Map<Integer, Integer> T = new HashMap<>();
		int bre = 0;
		for(int i =0;i<data.length();i=i+3)
		{
			String tem = data.substring(i,i+3);
//			System.out.println(tem );
			char type = tem.charAt(0);
			int number = Integer.parseInt(tem.substring(1,3));
//			System.out.println(number);
			
			if(type == 'P')
			{
				if(P.get(number)!=null)
				{
					bre=1;
					break;
				}
				else
				{
					P.put(number, 1);
				}
			}
			else if(type == 'K')
			{
				if(K.get(number)!=null)
				{
					bre=1;
					break;
				}
				else
				{
					K.put(number, 1);
				}
			}
			else if(type == 'H')
			{
				if(H.get(number)!=null)
				{
					bre=1;
					break;
				}
				else
				{
					H.put(number, 1);
				}
			}
			else if(type == 'T')
			{
				if(T.get(number)!=null)
				{
					bre=1;
					break;
				}
				else
				{
					T.put(number, 1);
				}
			}
			
		}
		
		if(bre==1)
			System.out.println("GRESKA");
		else
			System.out.println((13-P.size())+" "+(13-K.size())+" "+(13-H.size())+" "+(13-T.size()));
		
		
		
	}

}
