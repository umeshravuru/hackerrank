package webScrap.org.webScrap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Little_pig_Benny {

	public static void main(String[] args) {
		
		System.out.println();
		Scanner s = new Scanner(System.in);

		String data = s.nextLine();
		
		Map<String, Integer> mapper  = new HashMap<String, Integer>();
		mapper.put("0,0", 1);
		int x = 0;
		int y = 0;
		int ans = 0;
		for(int i =0;i<data.length();i++){
			
			if(data.charAt(i) == 'L')
				x--;
			else if(data.charAt(i) == 'R')
				x++;
			else if(data.charAt(i) == 'U')
				y++;
			else if(data.charAt(i) == 'D')
				y--;
			String now = String.valueOf(x)+"," + String.valueOf(y);
			if(mapper.get(now)!= null)
				ans++;
			else
				mapper.put(now, 1);
		}
		
		System.out.println(ans);
	}

}
