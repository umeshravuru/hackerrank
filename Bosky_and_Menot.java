package coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bosky_and_Menot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();
		int count = 0;
		int max = -1;
//		int data = 0;
		ArrayList<Integer> data = new ArrayList<Integer>();
		for(int i =0;i<t;i++){
			String now[] = s.nextLine().split(" ");
			for(int j=0;j<now.length;j++){
			try{
				int date = Integer.parseInt(now[j]);
//				System.out.println(date);
				if(mapper.get(date)== null)
					mapper.put(date, 1);
				else
					mapper.put(date, mapper.get(date)+1);
			}
			catch(Exception e){
//				System.out.println(e.getMessage());
			}
			}
			
		
		}
		for(Integer key: mapper.keySet()){
			if(mapper.get(key)>max){
				max = mapper.get(key);
				data.add(key);
			}
			
		}
		
		for(Integer key: mapper.keySet()){
			if(mapper.get(key)==max)
				count ++;
		}

		
		System.out.println(mapper);
		if(count>1)
			System.out.println("No Date");
		else{
//		if(data == 19 || data == 20)
//			System.out.println("Date");
//		else
//			System.out.println("No Date");
			
		}
	
		
		
	}

}
