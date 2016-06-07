package beer_night;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class t9spelling
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		Map<Character, String> data = new HashMap<Character, String> ();
		data.put('a', "12");
		data.put('b', "22");
		data.put('c', "32");
		
		data.put('d', "13");
		data.put('e', "23");
		data.put('f', "33");
		
		data.put('g', "14");
		data.put('h', "24");
		data.put('i', "34");
		
		data.put('j', "15");
		data.put('k', "25");
		data.put('l', "35");
		
		data.put('m', "16");
		data.put('n', "26");
		data.put('o', "36");
		
		data.put('p', "17");
		data.put('q', "27");
		data.put('r', "37");
		data.put('s', "47");
		
		data.put('t', "18");
		data.put('u', "28");
		data.put('v', "38");
		
		data.put('w', "19");
		data.put('x', "29");
		data.put('y', "39");
		data.put('z', "49");
		
		for(int i =0;i<n;i++)
		{
			String ans ="*";
			String in = s.nextLine();
			for(int j=0;j<in.length();j++)
			{
				if(in.charAt(i)==' ')
				{
					if(ans.charAt(ans.length()-1)=='0')
						ans=ans+" ";
					ans =ans+'0';
				}
				else
				{
				if(String.valueOf(ans.charAt(ans.length()-1)).equals(data.get(in.charAt(j)).substring(1, 2)))
					ans=ans+" ";
				for(int k=0;k<Integer.parseInt(data.get(in.charAt(j)).substring(0, 1));k++)
				{
					ans=ans+(data.get(in.charAt(i)).substring(1, 2));
				}
				}
			}
			
			
			
			
			System.out.println("Case #"+(i+1)+": "+ans); 
			
		}
		
		
		
	}

}
