package webScrap.org.webScrap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Magician_versus_Chef {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		for(int ii =0;ii<t;ii++){
			int  n = s.nextInt();
			int  x = s.nextInt()-1;
			int  swaps = s.nextInt();
			int data[][] = new int [2][swaps];
			Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();
			for(int i = 0;i<n;i++){
				mapper.put(i, 0);
			}
			mapper.put(x, 1);
			for(int i = 0;i<swaps;i++){
				data[0][i] = s.nextInt()-1;
				data[1][i] = s.nextInt()-1;
				if(mapper.get(data[0][i]) == 1){
					mapper.put(data[0][i], 0);
					mapper.put(data[1][i], 1);
				} else if(mapper.get(data[1][i]) == 1){
					mapper.put(data[0][i], 1);
					mapper.put(data[1][i], 0);
				}
				
			}
			
			for(int key : mapper.keySet()){
				if(mapper.get(key) == 1){
					System.out.println(key+1);
					break;
				}
			}
			
			
			
			
		}
		
	}

}
