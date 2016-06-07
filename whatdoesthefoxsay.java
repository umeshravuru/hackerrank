package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class whatdoesthefoxsay
{

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		
		for(int ii=0;ii<t;ii++)
		{
			String data1= s.nextLine();
			ArrayList<String> ans = new ArrayList<String> (); 
			for(int i=0;i<data1.split(" ").length;i++)
			{
				ans.add(data1.split(" ")[i]);
			}
			String now = s.nextLine();
			while(now.contains("goes"))
			{
				String key = now.split(" ")[2];
				for(int i =0;i<ans.size();i++)
				{
					if(ans.get(i).equals(key))
					{
						ans.remove(i);
						i--;
					}
				}
				now=s.nextLine();
			}
			
			for(int i =0;i<ans.size();i++)
			{
				System.out.print(ans.get(i)+" ");
			}
			
			
		}
		
		
	}

}
