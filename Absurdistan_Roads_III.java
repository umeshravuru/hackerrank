package hack;

import java.util.ArrayList;
import java.util.Scanner;

public class Absurdistan_Roads_III
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>(); 
		for (int i = 0; i < n; i++)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(s.nextInt());
			temp.add(s.nextInt());
//			temp.r
			int che=0;
			for(int j=0;j<data.size();j++)
			{
				if(data.get(j).get(0)>temp.get(0))
				{
					data.add(j,temp);
					che=1;
					break;
				}
			}
			if(che==0)
			data.add(temp);
		}
		
		System.out.println(data);
		

	}

}
