package hack;

import java.util.HashMap;
import java.util.Scanner;

public class Mug_Color
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n =Integer.parseInt(s.nextLine());
		HashMap<String, Integer> ans = new HashMap<String, Integer>();
		ans.put("White", 0);
		ans.put("Yellow", 0);
		ans.put("Blue", 0);
		ans.put("Black", 0);
		ans.put("Red", 0);
		for(int i =0;i<n;i++)
		{
			String now =s.nextLine();
			ans.put(now, ans.get(now)+1);//, newValue)
		}
		
//		for(int i =0;i<5;)
		int min =1000000;
		String final_ans="";
		if(ans.get("White")<min)
		{
			min=ans.get("White");
			final_ans="White";
		}
		 if(ans.get("Yellow")<min)
		{
			min=ans.get("Yellow");
			final_ans="Yellow";
		}
		 if(ans.get("Blue")<min)
		{
			min=ans.get("Blue");
			final_ans="Blue";
		}
		 if(ans.get("Black")<min)
		{
			min=ans.get("Black");
			final_ans="Black";
		}
		 if(ans.get("Red")<min)
		{
			min=ans.get("Red");
			final_ans="Red";
		}
		System.out.println(final_ans);
		
	}

}
