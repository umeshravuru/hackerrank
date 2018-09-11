package webScrap.org.webScrap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Daily_Coding_Problem_Problem_13_brute {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		int n = Integer.parseInt(s.nextLine());
		int max = 0;
		String ans_string = ""; 
		for(int i =0;i<data.length();i++){
			for(int j =i;j<data.length();j++){
				System.out.println(data.substring(i,j+1)+" "+ discint(data.substring(i,j+1)));
				if(discint(data.substring(i,j+1)) == n){
					if(max < data.substring(i,j+1).length()){
						max = data.substring(i,j+1).length();
						ans_string = data.substring(i,j+1);
					}
					
				}
					
			}
		}
		
		System.out.println(ans_string);
		
	}
	
	public static int discint(String data){
		Map<Character, Integer> mapper = new HashMap<Character, Integer>();
		for(int i =0;i<data.length();i++){
			if(mapper.get(data.charAt(i)) == null)
				mapper.put(data.charAt(i), 1);
			else
				mapper.put(data.charAt(i), mapper.get(data.charAt(i))+1);
		}
		
		return mapper.size();
	}

}
