package hack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class test_case_output_check
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<String>  data1  = new ArrayList<String>();
		ArrayList<String>  data2  = new ArrayList<String>();
		
		while(true)
		{
			String ss = s.nextLine();
			if(ss.equals("done"))
				break;
			
			data1.add(ss);
		}
		
		System.out.println(data1);
		
		
		while(true )
		{
			 String ss = s.nextLine();
			if(ss.equals("done"))
				break;
			
			data2.add(ss);
		}
		
		int check=0;
		for(int i=0;i<data1.size();i++)
		{
			if(data1.get(i).equals(data2.get(i)))
					{
				
					}
			else
			{
				check=1;
				break;
			}
		}
		
		
		
		//System.out.println(data2);
		if(check==0)
			System.out.println("equal");
		else
			System.out.println("not equal");
		
		
	}

}
