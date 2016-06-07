package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class A_Compliance_Problem
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
		for(int i =0;i<data.length();i++)
		{
			int che=0;
			for(int j=0;j<ans.size();j++)
			{
				if(ans.get(j).get(0).equals(String.valueOf(data.charAt(i))))
				{
					ans.get(j).set(1, String.valueOf(Integer.parseInt(ans.get(j).get(1))+1));
					che=1;
					break;
				}
			}
			if(che==0)
			{
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(String.valueOf(data.charAt(i)));
				temp.add("1");
				ans.add(temp);
			}
		}
		
//		System.out.println(ans);
		
		int che1=0;
		for(int i =0;i<ans.size();i++)
		{
			if(che1==2)
				break;
			else
			{
			if(Integer.parseInt(ans.get(i).get(1))%2!=0)
			{
				che1++;
			}
			}
		}
		if(che1==2)
			System.out.println("no");
		else
			System.out.println("yes");
		
	}

}
