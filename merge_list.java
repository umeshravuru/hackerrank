package hack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class merge_list
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		ArrayList<Integer> data = new ArrayList<Integer>();
		for(int i =0;i<n;i++)
		{
			data.add(s.nextInt());
		}
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
	
		
		
		System.out.println(merge(data.subList(0, data.size()/2),data.subList(data.size()/2, data.size())));
		
		
		
	}
	
	
	public static ArrayList<Integer> merge(List<Integer> list,List<Integer> list2){
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>(list);
		ArrayList<Integer> b = new ArrayList<Integer>(list2);
		int tot_size = list.size()+list2.size();
		while(ans.size()<tot_size)
		{
			
			if(a.get(0)<b.get(0))
			{
				ans.add(a.get(0));
				a.remove(0);
				if(a.size()==0)
					a.add(0,100000);
			}
			else
			{
				ans.add(b.get(0));
				b.remove(0);
				if(b.size()==0)
					b.add(0,100000);
			}
			
		System.out.println(ans);	
		}
		
		
		
		return ans;
	}

}
