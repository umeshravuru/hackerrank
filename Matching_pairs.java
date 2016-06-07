package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Matching_pairs
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data1 =s.nextLine();
//		char [] data = new char[data1.length()];
//		int [] num = new int [data1.length()];
		ArrayList<Character> data = new ArrayList<Character>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(int i =0;i<data1.length();i++)
		{
			num.add(i);
			data.add(data1.charAt(i));
		}
		
		int current_legth =0;
		int fin_ans=0;
		while(data.size()>0)
		{
//			System.out.println(data);
			if(current_legth==data.size())
				break;
			else
			{
				current_legth=data.size();
				for(int i =0;i<data.size()-1;i++)
				{
					if((int)data.get(i)==(int)data.get(i+1)-32)
					{
						fin_ans=num.get(i+1);
						num.remove(i);
						num.remove(i);
						data.remove(i);
						data.remove(i);
						
						break;
					
					}
				}
			}
		}
		System.out.println(fin_ans); 
	}

}
