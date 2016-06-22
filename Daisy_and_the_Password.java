package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Daisy_and_the_Password
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for(int ii=0;ii<t;ii++)
		{
			String data1 = s.nextLine();
			String data[] = data1.split(" ");
			Map<Character, Integer> freq1 = new HashMap<>();
			Map<Character, Integer> freq2 = new HashMap<>();
			
			for(int i =0;i<data[0].length();i++)
			{
				if(freq1.get(data[0].charAt(i))!=null)
					freq1.put(data[0].charAt(i), freq1.get(data[0].charAt(i))+1);
				else
					freq1.put(data[0].charAt(i), 1);
			}
			
			
			for(int i =0;i<data[1].length();i++)
			{
				if(freq2.get(data[1].charAt(i))!=null)
					freq2.put(data[1].charAt(i), freq2.get(data[1].charAt(i))+1);
				else
					freq2.put(data[1].charAt(i), 1);
			}
			
			
			if(freq1.size()==freq2.size())
			{
				int che =0;
				for(char key : freq1.keySet())
				{
					if(freq2.get(key)==null)
					{
						che=1;
						break;
					}
					if(2 !=freq2.get(key)/freq1.get(key))
					{
						che=1;
						break;
					}
				}
				if(che==1)
					System.out.println("Impossible");
				else
					System.out.println("Possible");
			}
			else
				System.out.println("Impossible");
			
		}
			
		
		
	}

}
