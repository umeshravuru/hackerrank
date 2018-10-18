package webScrap.org.webScrap;

import java.util.Scanner;

public class How_Many_Ways_to_Decode_This_Message {

	public static void main(String[] args) {
		
//		System.out.println(rand(10));
		String data = rand(20);
		System.out.println(data);
		
		System.out.println(getAns(data));
		
	}
	
	public static int getAns(String data){
		if(data.length() == 0)
			return 0;
		if(data.charAt(0) == '0')
			return 0;
		else if(data.length() == 1){
			System.out.println(data);
			return 1;
		}
		else{
			if(Integer.parseInt(data.substring(0,2)) >0 && Integer.parseInt(data.substring(0,2)) <= 26)
				return getAns(data.substring(1,data.length())) + getAns(data.substring(2,data.length()));
			else
				return getAns(data.substring(1,data.length()));
				
		}
		
	}

	public static String rand(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(((int) (Math.random() * 9)+1));
		}
		return sb.toString();

	}

}
