package hack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class notamused
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int day =0;
		while(s.hasNext())
		{
			String just = s.nextLine();
			
			HashMap<String, Integer> data = new HashMap<String, Integer>(); 
			String tem ="";
			while(true)
			{
				tem = s.nextLine();
				if(tem.equals("CLOSE"))
				{
					day++;
					break;
				}
				else
				{
					if(data.get(tem.split(" ")[1])!=null)
					{
						data.put(tem.split(" ")[1], Integer.parseInt(tem.split(" ")[2])-data.get(tem.split(" ")[1]));
					}
					else
					{
						data.put(tem.split(" ")[1], Integer.parseInt(tem.split(" ")[2]));
					}
				}
				
			}
			System.out.println("Day "+day);
			
			
		
			
			for(int i =0;i<data.size()-1;i++)
			{
				for(int j =i+1;j<data.size();j++)
				{
//					if(data.get(1))
				}
			}
			System.out.println(data);
			
			
		}
		
		
	}

}
