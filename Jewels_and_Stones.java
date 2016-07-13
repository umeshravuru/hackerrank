package Code_chef;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jewels_and_Stones
{

	public static void main(String[] args)
	{
		
		Scanner s  = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for(int ii =0;ii<n;ii++)
		{
			String a = s.nextLine();
			String b = s.nextLine();
			Map<Character, Integer> freq = new HashMap<>();
			int ans =0;
			for(int i=0;i<b.length();i++)
			{
				if(a.contains(String.valueOf(b.charAt(i))))
				{
					if(freq.get(b.charAt(i))==null)
						freq.put(b.charAt(i), 1);
					else
						freq.put(b.charAt(i), freq.get(b.charAt(i))+1);
					ans++;
				}
			}
//			System.out.println(freq.size());
			System.out.println(ans);
			
		}
		
				
		
		
	}

}
