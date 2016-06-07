package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class metaprogramming
{

	public static void main(String[] args)
	{
		
		Scanner s= new Scanner(System.in);
		
		Map<String, Integer> dic = new HashMap<String, Integer>(); 
		
		while(s.hasNext())
		{
			String data1 = s.nextLine();
			String []data = data1.split(" ");
			
			if(data[0].equals("define"))
			{
				dic.put(data1.substring(9,data1.length()), Integer.parseInt(data[1]));
			}
			else
			{
				String now = data1.substring(5, data1.length());
				String [] now_array ={};
				if(now.contains(">"))
				{
					now_array =now.split(">");
					now_array[0]=now_array[0].substring(0, now_array[0].length()-1);
					now_array[1]=now_array[1].substring(1, now_array[1].length());
//					System.out.println(now_array[0]+" "+now_array[1]);
					if(dic.get(now_array[0])!=null && dic.get(now_array[1])!=null)
					{
						if(dic.get(now_array[0])>dic.get(now_array[1]))
							System.out.println("true");
						else
							System.out.println("false");
					}
					else
						System.out.println("undefined");
				}
				else if(now.contains("="))
				{
					now_array= now.split("=");
					now_array[0]=now_array[0].substring(0, now_array[0].length()-1);
					now_array[1]=now_array[1].substring(1, now_array[1].length());
//					System.out.println(now_array[0]+" "+now_array[1]);
					if(dic.get(now_array[0])!=null && dic.get(now_array[1])!=null)
					{
						if(dic.get(now_array[0])==dic.get(now_array[1]))
							System.out.println("true");
						else
							System.out.println("false");
					}
					else
						System.out.println("undefined");
				}
				else
				{
					now_array = now.split("<");
					now_array[0]=now_array[0].substring(0, now_array[0].length()-1);
					now_array[1]=now_array[1].substring(1, now_array[1].length());
//					System.out.println(now_array[0]+" "+now_array[1]);
					if(dic.get(now_array[0])!=null && dic.get(now_array[1])!=null)
					{
						if(dic.get(now_array[0])<dic.get(now_array[1]))
							System.out.println("true");
						else
							System.out.println("false");
					}
					else
						System.out.println("undefined");
				}
				
				
					
				
				
				
				
			}
			
//			System.out.println(dic);
			
		}
		
		
		
	}

}
