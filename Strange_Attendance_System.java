package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strange_Attendance_System {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//BufferedReader br = new BufferedReader(new FileReader(
			//	"/Users/UXR08UQ/Desktop/testData.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		
		for(int ii = 0;ii<t;ii++ ){
			String data = br.readLine();
			int x = Integer.parseInt(data.split(" ")[0]);
			int y = Integer.parseInt(data.split(" ")[1]);
			
//			System.out.println(x);
//			System.out.println(y);
			if(x*3 > y*4){
				
				int ans = 0;
				while(x*3 > y*4){
					ans++;
					x++;
					y++;
				}
				System.out.println(ans);
				
			} else System.out.println("0");
		
			
		}
		
		
		

	}

}
