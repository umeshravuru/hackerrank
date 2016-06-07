package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Katis_Modulo
{

	public static void main(String[] args)
	{
		Map<Integer, Integer> freq = new HashMap<Integer,Integer>();
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			freq.put(s.nextInt()%42, 1);
		}
		System.out.println(freq.size());
		
	}

}
