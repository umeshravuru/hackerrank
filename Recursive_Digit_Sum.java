package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Recursive_Digit_Sum {

	public static void main(String[] args) throws NumberFormatException,
	IOException {
		// TODO Auto-generated method stub
		
		// BufferedReader br = new BufferedReader(new
				// InputStreamReader(System.in));

				BufferedReader br = new BufferedReader(new FileReader(
						"/Users/UXR08UQ/Desktop/testData.txt"));

				
			String data = br.readLine();	
			String a = (data.split(" ")[0]);
			Long b = Long.parseLong(data.split(" ")[1]);
			
			
			Long ans = sum(a)* b;
			System.out.println(ans);
			while(ans > 9){
				ans = sum(ans);
				System.out.println(ans);
			}
			System.out.println(ans);

				
				
	}
	
	private static Long sum(Long data){
		Long ans = (long)0;
		
		while(data > 0){
			ans = ans + (data%10);
			data = data / 10;
		}
		return ans;
	}
	
	private static Long sum(String data){
		Long ans = (long)0;
		for(int i =0;i<data.length();i++){
			ans = ans + Long.parseLong(String.valueOf(data.charAt(i)));
		}
		return ans;
	}

}
