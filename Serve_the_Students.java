package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Serve_the_Students
{

	public static void main(String[] args)
	{
		Scanner s  = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>(); 
		
		for(int i =0;i<n;i++)
		{
			String t1 = s.nextLine();
			String[] t2 = t1.split(" ");
			if(t2[0].equals("ENTER"))
			{
				ArrayList<String> temp = new ArrayList<String>();
				String name = t2[1];
				float cgpa = Float.parseFloat(t2[2]);
				int token = Integer.parseInt(t2[3]);
				int che=0;
				for(int j=0;j<data.size();j++)
				{
//					System.out.println(Float.parseFloat(data.get(j).get(1)));
					if(Float.parseFloat(data.get(j).get(1))<cgpa)
					{
						temp.add(name);
						temp.add(String.valueOf(cgpa));
						temp.add(String.valueOf(token));
						data.add(j,temp);
						che=1;
						break;
					}
					else if(Float.parseFloat(data.get(j).get(1))==cgpa)
					{
						if(data.get(j).get(0).equals(name))
						{
							if(Integer.parseInt(data.get(j).get(2))>token)
							{
								temp.add(name);
								temp.add(String.valueOf(cgpa));
								temp.add(String.valueOf(token));
								data.add(j,temp);
								che=1;
								break;
							}
						}
						else
						{
							if(smaller(name, data.get(j).get(0)))
							{
								temp.add(name);
								temp.add(String.valueOf(cgpa));
								temp.add(String.valueOf(token));
								
								data.add(j,temp);
								che=1;
								break;
							}
						}
					}
					
				}
				if(che==0)
				{
					ArrayList<String> temp1 = new ArrayList<String>();
					temp1.add(name);
					temp1.add(String.valueOf(cgpa));
					temp1.add(String.valueOf(token));
					data.add(temp1);
				}
				
				
			}
			
			else
			{
				if(data.size()==0)
					break;
				data.remove(0);
			}
			
			
			
//			System.out.println(data);
			
		}
		if(data.size()==0)
			System.out.println("EMPTY");
		else
		{
		for(int i =0;i<data.size();i++)
		{
			
			System.out.println(data.get(i).get(0));
		}
		}		
	}
	
	public static boolean smaller(String a , String b){
		
		for(int i =0;i<Math.min(a.length(), b.length());i++)
		{
			if((int)a.charAt(i)<(int)b.charAt(i))
				return true;
			if((int)a.charAt(i)>(int)b.charAt(i))
				return false;
		}
		
		return true;
	}

}
