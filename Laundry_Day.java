package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Laundry_Day
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		while (s.hasNext())
		{
			
			
			String now =s.nextLine();
			
			int che=0;
			for(int i =0;i<data.size();i++)
			{
				if(data.get(i).get(0).equals(now))
				{
					data.get(i).set(1, String.valueOf(Integer.parseInt(data.get(i).get(1)+1)));
					che=1;
					break;
				}
			}
			if(che==0)
			{
				int che1=0;
				for(int i =0;i<data.size();i++)
				{
					if(big(data.get(i).get(0),now))
					{
						ArrayList<String> temp = new ArrayList<String>();
						temp.add(now);
						temp.add("1");
						data.add(i,temp);
						che1=1;
						break;
					}
				}
				if(che1==0)
				{
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(now);
					temp.add("1");
					data.add(temp);
				}
				
			}
			
//			System.out.println(data);
//			System.out.println(big("red sock","polka dot sock"));
		}
		
		for(int i =0;i<data.size();i++)
		{
			if(data.get(i).get(0).contains("sock"))
			{
				if(data.get(i).get(1).length()%2==0){
					System.out.println(data.get(i).get(1).length()/2+"|"+data.get(i).get(0));
				}
				else
				{
					System.out.println(data.get(i).get(1).length()/2+"|"+data.get(i).get(0));
					if(data.get(i).get(1).length()>2)
					System.out.println("0|"+data.get(i).get(0));
				}
			}
			else
			{
				System.out.println(data.get(i).get(1).length()+"|"+data.get(i).get(0));
			}
		}
		
		

	}
	
	public static boolean big(String data1, String data2)
	{
		
		for(int i =0;i<Math.min(data1.length(), data2.length());i++)
		{
			if((int)data1.charAt(i)<(int)data2.charAt(i))
				return false;
			else if((int)data1.charAt(i)>(int)data2.charAt(i))
				return true;
			
		}
		
		
		return true;
	}

}
