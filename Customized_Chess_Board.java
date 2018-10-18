package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Customized_Chess_Board {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader br = new BufferedReader(new FileReader(
				"/Users/UXR08UQ/Desktop/testData.txt"));

		int t  = Integer.parseInt(br.readLine());
		
		
		for(int ii =0;ii<t;ii++){
			int n  = Integer.parseInt(br.readLine());
			int data[] = new int[n];
			for(int i =0;i<t;i++){
				data[i] = br.read();
			}
		}
		
		
	}
	

}
