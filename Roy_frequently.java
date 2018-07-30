package coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Roy_frequently {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int  t= Integer.parseInt(s.nextLine());
		Map<Character, Integer> mapper = new HashMap<Character, Integer>();
		mapper.put('.', 1);
		mapper.put(',', 2);
		mapper.put('?', 3);
		mapper.put('!', 4);
		mapper.put('1', 5);
		
		mapper.put('a', 1);
		mapper.put('b', 2);
		mapper.put('c', 3);
		mapper.put('2', 4);
		
		mapper.put('d', 1);
		mapper.put('e', 2);
		mapper.put('f', 3);
		mapper.put('3', 4);
		
		mapper.put('g', 1);
		mapper.put('h', 2);
		mapper.put('i', 3);
		mapper.put('4', 4);
		
		mapper.put('j', 1);
		mapper.put('k', 2);
		mapper.put('l', 3);
		mapper.put('5', 4);
		
		mapper.put('m', 1);
		mapper.put('n', 2);
		mapper.put('o', 3);
		mapper.put('6', 4);
		
		mapper.put('p', 1);
		mapper.put('q', 2);
		mapper.put('r', 3);
		mapper.put('s', 4);
		mapper.put('7', 5);
		
		mapper.put('t', 1);
		mapper.put('u', 2);
		mapper.put('v', 3);
		mapper.put('8', 4);
		
		mapper.put('w', 1);
		mapper.put('x', 2);
		mapper.put('y', 3);
		mapper.put('z', 4);
		mapper.put('9', 5);
		
		mapper.put('_', 1);
		mapper.put('0', 2);
		
		Map<Character, Integer> mapper1 = new HashMap<Character, Integer>();
		mapper1.put('.', 1);
		mapper1.put(',', 1);
		mapper1.put('?', 1);
		mapper1.put('!', 1);
		mapper1.put('1', 1);
		
		mapper1.put('a', 2);
		mapper1.put('b', 2);
		mapper1.put('c', 2);
		mapper1.put('2', 2);
		
		mapper1.put('d', 3);
		mapper1.put('e', 3);
		mapper1.put('f', 3);
		mapper1.put('3', 3);
		
		mapper1.put('g', 4);
		mapper1.put('h', 4);
		mapper1.put('i', 4);
		mapper1.put('4', 4);
		
		mapper1.put('j', 5);
		mapper1.put('k', 5);
		mapper1.put('l', 5);
		mapper1.put('5', 5);
		
		mapper1.put('m', 6);
		mapper1.put('n', 6);
		mapper1.put('o', 6);
		mapper1.put('6', 6);
		
		mapper1.put('p', 7);
		mapper1.put('q', 7);
		mapper1.put('r', 7);
		mapper1.put('s', 7);
		mapper1.put('7', 7);
		
		mapper1.put('t', 8);
		mapper1.put('u', 8);
		mapper1.put('v', 8);
		mapper1.put('8', 9);
		
		mapper1.put('w', 9);
		mapper1.put('x', 9);
		mapper1.put('y', 9);
		mapper1.put('z', 9);
		mapper1.put('9', 9);
		
		mapper1.put('_', 0);
		mapper1.put('0', 0);
		
		for(int ii =0;ii<t;ii++){
			int ans = 0;
			String data = s.nextLine();
			
			int handNow = 1;
			for(int i=0;i<data.length();i++){
				Character now = data.charAt(i);
				int times = mapper.get(now);
				if(handNow != mapper1.get(now)){
					ans++;
					handNow = mapper1.get(now);
				}
				
				ans = ans + times;
				
			}
			System.out.println(ans);	
		}
		
		
		
		
	}

}
