package webScrap.org.webScrap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class The_Power_Sum_1 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		System.out.println();
		
		BufferedReader br = new BufferedReader(new FileReader(
				"/Users/UXR08UQ/testData.txt"));

		int X = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

//		Scanner s = new Scanner(System.in);
		// int X = s.nextInt();
		// int n = s.nextInt();

		ArrayList<Integer> nn = new ArrayList<Integer>();
		int current = 1;
		while (true) {
			int now = current * current;
			if (now > X)
				break;
			else
				nn.add(now);

			current++;
		}
		System.out.println(nn);

		int ans = 0;
		for(int i =0;i<nn.size();i++){
			for(int j =0;j<=i;j++){
				System.out.print(nn.get(j)+" ");
			}
			System.out.println();
		}
		
		
		
		
//		disp(data);

	}

	public static void disp(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				if(data[i][j] <10)
				System.out.print("0"+data[i][j] + " ");
				else
					System.out.print(+data[i][j] + " ");	
			}
			System.out.println();
		}
		System.out.println();
	}

}
