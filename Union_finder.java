package test;

import java.util.HashMap;
import java.util.Map;

public class Union_finder {

	
//	# test data : friends
//	4
//	YYNN
//	YYYN
//	NYYN
//	NNNY
	
	static int friendCircles(String[] friends) {
		int data[] = new int [friends.length];
		for(int i =0;i<data.length;i++) {
			data[i] = i;
			
		}
		disp(data);
		for(int i =0;i<friends.length-1;i++) {
			for(int j =i+1;j<friends.length;j++) {
				if(friends[i].charAt(j)=='Y')
				{
					int now = data[i];
					for(int k =0;k<data.length;k++) {
						if(data[k]== now)
							data[k] = j;
					}
					disp(data);
				}
				
			}
		}
		disp(data);
		Map<Integer, Integer> mapper = new HashMap();
		for(int i =0;i<data.length;i++) {
			mapper.put(data[i], 1);
		}
		
		
		return mapper.size();
	}
	
	
	public static void disp(int [] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		
		
		
		
	}

}
