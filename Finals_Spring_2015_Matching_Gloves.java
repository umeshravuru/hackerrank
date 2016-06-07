package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Finals_Spring_2015_Matching_Gloves
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n =Integer.parseInt(s.nextLine());
		ArrayList<String> data = new ArrayList<String>();
		for(int i =0;i<n;i++)
		{
			String tem=s.nextLine();
			if(!palin(tem))
			{
				data.add(tem);
			}
		}
//		System.out.println(data);
		ArrayList<String> data1 = new ArrayList<String>();
		for(int i =0;i<data.size();i++)
		{
			data1.add(rever(data.get(i)));
		}
//		System.out.println(data1);
		if(data.size()==0)
		{
			System.out.println("0");
		}
		else
		{
		int final_ans=0;
		int current_size = 0;//data.size();
		while(current_size!=data.size())
		{
			current_size=data.size();
			int i =0;
				for(int j =i+1;j<data.size();j++)
				{
					if(data.get(i).equals(data1.get(j)))
					{
						data.remove(j);
						data.remove(i);
						data1.remove(j);
						data1.remove(i);
						final_ans++;
						break;
					}
						
				}
			
		}
		System.out.println(data);
		if(data.size()>0)
			System.out.println("-1");
		else
			System.out.println(final_ans);
		}
		
		
	}

	public static boolean palin(String data)
	{
		// System.out.println(data);
		int chec = 0;
		for (int i = 0; i < data.length() / 2; i++)
		{
			if (data.charAt(i) != data.charAt(data.length() - 1 - i))
			{
				return false;
			}
		}

		return true;

	}

	public static String rever(String data1)
	{

		String tem = "";
		for (int i = 0; i < data1.length(); i++)
		{
			tem = tem + data1.charAt(data1.length() - 1 - i);
		}
		return tem;

	}

}
